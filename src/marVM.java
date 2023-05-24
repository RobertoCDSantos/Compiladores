import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class marVM {

    HashMap<Integer, String> SymbolTable = new HashMap<Integer, String>();
    ArrayList<Object> myStack = new ArrayList<Object>();

    public Object pop() {
        return myStack.remove(myStack.size() - 1);
    }

    public void push(Object temp) {
        myStack.add(temp);
    }

    public void pops(int index, int times) {
        for (int j = 0; j < times; j++) {
            myStack.remove(index);
        }
    }

    public void hashMaps() {
        SymbolTable.put(1, "DCONST");
        SymbolTable.put(2, "ADD");
        SymbolTable.put(3, "SUB");
        SymbolTable.put(4, "MULT");
        SymbolTable.put(5, "DIV");
        SymbolTable.put(6, "UMINUS");
        SymbolTable.put(7, "PRINT");
        SymbolTable.put(8, "HALT");
        SymbolTable.put(9, "STRING");
        SymbolTable.put(10, "OR");
        SymbolTable.put(11, "AND");
        SymbolTable.put(12, "NOT");
        SymbolTable.put(13, "EQUAL");
        SymbolTable.put(14, "DIF");
        SymbolTable.put(15, "TRUE");
        SymbolTable.put(16, "FALSE");
        SymbolTable.put(17, "CONCAT");
        SymbolTable.put(18, "NIL");
        SymbolTable.put(19, "GT");
        SymbolTable.put(20, "LT");
        SymbolTable.put(21, "GEQ");
        SymbolTable.put(22, "LEQ");
        SymbolTable.put(23, "EQ_N");
        SymbolTable.put(24, "EQ_B");
        SymbolTable.put(25, "EQ_S");
        SymbolTable.put(26, "EQ_NIL");
        SymbolTable.put(27, "NEQ_N");
        SymbolTable.put(28, "NEQ_B");
        SymbolTable.put(29, "NEQ_S");
        SymbolTable.put(30, "NEQ_NIL");
        SymbolTable.put(31, "PRINT_N");
        SymbolTable.put(32, "PRINT_B");
        SymbolTable.put(33, "PRINT_S");
        SymbolTable.put(34, "PRINT_NIL");
        SymbolTable.put(35, "GLOBAL");
        SymbolTable.put(36, "LOAD");
        SymbolTable.put(37, "STORE");
        SymbolTable.put(38, "JUMP");
        SymbolTable.put(39, "JUMPF");
        SymbolTable.put(40, "DO");
        SymbolTable.put(41, "THEN");
        SymbolTable.put(42, "IFSTART");
        SymbolTable.put(43, "IFEND");
        SymbolTable.put(44, "ID");
        SymbolTable.put(45, "ELSESTART");
        SymbolTable.put(46, "ELSEEND");
        SymbolTable.put(47, "POP");
        SymbolTable.put(48, "CALL");
        SymbolTable.put(49, "STOREG");
        SymbolTable.put(50, "STOREL");
        SymbolTable.put(51, "LOADG");
        SymbolTable.put(52, "LOADL");
        SymbolTable.put(53, "LOCAL");
        SymbolTable.put(54, "RETURN");
        SymbolTable.put(55, "CONST");
        SymbolTable.put(56, "NUMBER");
    }

    public void printResults(String[] insts, String[] consts) {
        System.out.println("Constant pool:");

        int jkl = 0;
        while (jkl != consts.length) {
            System.out.println(consts[jkl++]);
        }

        System.out.println("Generated assembly code:");

        jkl = 0;
        while (jkl != insts.length) {
            System.out.println(insts[jkl++]);
        }
    }

    public static void main(String[] args) throws Exception {

        boolean debug = false;
        String url = "inputs/compiled.marbc";
        String directoryPath;
        String fileName;

        if (args.length > 0) {
            url = args[0];
        }
        if (args.length > 1) {
            if (args[1].equals("-debug")) {
                debug = true;
            }
        }

        String inputFile = null;
        if (args.length == 0) { // se não for pela consola ele le apartir do diretorio do projeto
            directoryPath = "inputs/";
            fileName = "compiled.marbc";
        }
        if (args.length > 0) { // se for pela consola le a partir do src
            directoryPath = "../inputs/";
            inputFile = args[0];
            Path path = Paths.get(inputFile);
            String fileNameWithExtension = path.getFileName().toString();
            fileName = fileNameWithExtension + "bc";
        }
        if (args.length > 1) {
            if (args[1].equals("-debug")) {
                debug = true;
            }
        }

        marVM options = new marVM();
        options.hashMaps();

        class IDVar {
            private String tipo;
            private String nome;
            private String value;

            public IDVar(String tipo, String nome) {
                this.tipo = tipo;
                this.nome = nome;
            }

            public IDVar(String tipo, String nome, String value) {
                this.tipo = tipo;
                this.nome = nome;
                this.value = value;
            }

            // Getters e setters
            public String getTipo() {
                return tipo;
            }

            public String getNome() {
                return nome;
            }

            public String value() {
                return value;
            }

            public void setTipo(String tipo) {
                this.tipo = tipo;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public void setInit(String value) {
                this.value = value;
            }
        }

        File file = new File(url);
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);

        int consts = dis.readInt();
        int Count = 0;
        String[] constPool = new String[consts];

        for (int i = 0; i < consts; i++) {
            int ind = dis.readByte();
            String temp = options.SymbolTable.get(ind);
            constPool[i] = i + ": <" + temp + ":";
            if (temp.equals("STRING")) {
                constPool[i] += "\"" + dis.readUTF() + "\"" + ">";
            } else {
                constPool[i] += dis.readDouble() + ">";
            }
        }

        int insts = dis.readInt();
        Count = 0;
        String[] instPool = new String[insts];

        String theDoubles = "CALL RETURN POP GLOBAL LOCAL STOREL STOREG LOADL LOADG CONST JUMP JUMPF";
        for (int i = 0; i < insts; i++) {
            int ind = dis.readByte();
            String temp = options.SymbolTable.get(ind);
            instPool[i] = i + ": " + temp;
            if (theDoubles.contains(temp)) {
                ind = dis.readInt();
                instPool[i] += " " + ind;
            }
        }

        if (debug) {
            options.printResults(instPool, constPool);
            System.out.println("Execution starts at instruction 0");
            System.out.println("Trace while running the code:");
        }

        boolean rotation = true;
        Count = 0;
        int i = 0;
        int lb = 0;

        Object[] globals = null;

        while (rotation) {

            if (debug) {

                StringBuilder sb1 = new StringBuilder();
                sb1.append("                      Globals: [");

                if (globals != null) {
                    for (int useful = 0; useful < globals.length; useful++) {
                        Object obj = globals[useful];
                        if (obj instanceof String) {
                            if (obj != "nil") {
                                sb1.append("<STRING:\"").append(obj).append("\">");
                            } else {
                                sb1.append("<NIL>");
                            }
                        } else if (obj instanceof Double) {
                            sb1.append("<NUMBER:").append(obj).append(">");
                        } else if (obj instanceof Boolean) {
                            sb1.append("<BOOL:").append(obj).append(">");
                        } else {
                            sb1.append("<NIL>");
                        }
                        if (useful != globals.length - 1) {
                            sb1.append(", ");
                        }
                    }
                }

                sb1.append("]");
                String formattedString1 = sb1.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("                        Stack: [");
                for (int contando = 0; contando < options.myStack.size(); contando++) {
                    Object obj = options.myStack.get(contando);
                    if (obj instanceof String) {
                        if (obj != "nil") {
                            sb2.append("<STRING:\"").append(obj).append("\">");
                        } else {
                            sb2.append("<NIL>");
                        }
                    } else if (obj instanceof Double) {
                        sb2.append("<NUMBER:").append(obj).append(">");
                    } else if (obj instanceof Integer) {
                        sb2.append("<INT:").append(obj).append(">");
                    } else if (obj instanceof Boolean) {
                        sb2.append("<BOOL:").append(obj).append(">");
                    } else {
                        sb2.append(obj);
                    }
                    if (contando != options.myStack.size() - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append("]");
                String formattedString2 = sb2.toString();
                System.out.println(formattedString1 + "\n" + formattedString2);
                System.out.println("                           LB: " + lb);
            }

            String fulString = instPool[i++];
            String[] parts = fulString.split(" ");
            String b = parts[1];

            switch (b) {
                case "CONST":
                    String value = "";
                    String toWorkWith = parts[2];
                    int NUM = Integer.parseInt(toWorkWith);
                    toWorkWith = constPool[NUM];

                    int startIndex = toWorkWith.indexOf("<") + 1;
                    int endIndex = toWorkWith.lastIndexOf(">");
                    String output = toWorkWith.substring(startIndex, endIndex);

                    String[] workingNow = output.split(":");
                    String key = workingNow[0];
                    value = workingNow[1];

                    if (key.equals("NUMBER")) {
                        options.push(Double.valueOf(value));
                        if (debug) {
                            System.out.println(i - 1 + ": " + "CONST " + parts[2] + " '<NUMBER:" + value + ">");
                        }
                    } else if (key.equals("STRING")) {
                        if (debug) {
                            System.out.println(i - 1 + ": " + "CONST " + parts[2] + " '<STRING:" + value + ">");
                        }
                        value = value.replaceAll("\"", "");
                        options.push(value);
                    }

                    break;
                case "ADD":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "ADD");
                    }
                    options.push((Double) options.pop() + (Double) options.pop());
                    break;
                case "SUB":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "SUB");
                    }
                    Double rightD = (Double) options.pop();
                    Double leftD = (Double) options.pop();
                    options.push(leftD - rightD);
                    break;
                case "MULT":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "MULT");
                    }
                    rightD = (Double) options.pop();
                    leftD = (Double) options.pop();
                    options.push(leftD * rightD);
                    break;
                case "DIV":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "DIV");
                    }
                    rightD = (Double) options.pop();
                    leftD = (Double) options.pop();
                    options.push((Double) leftD / rightD);
                    break;
                case "UMINUS":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "UMINUS");
                    }
                    options.push(-(Double) options.pop());
                    break;
                case "PRINT":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "PRINT" + "\n" + options.pop());
                    } else {
                        System.out.println(options.pop());
                    }
                    break;
                case "HALT":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "HALT");
                    }
                    dis.close();
                    fis.close();
                    rotation = false;
                    break;
                case "STRING":
                    String string = instPool[i++];
                    string = string.replaceAll("\"", "");
                    options.push(string);
                    if (debug) {
                        System.out.println(i - 1 + ": " + "CONST " + Count++ + " '<STRING:\"" + string + "\">");
                    }
                    break;
                case "OR": // OR
                    if (debug) {
                        System.out.println(i - 1 + ": " + "OR");
                    }
                    Boolean rightB = (Boolean) options.pop();
                    Boolean leftB = (Boolean) options.pop();
                    options.push((Boolean) rightB || leftB);
                    break;
                case "AND":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "AND");
                    }
                    rightB = (Boolean) options.pop();
                    leftB = (Boolean) options.pop();
                    options.push((Boolean) (rightB && leftB));
                    break;
                case "POP":
                    string = parts[2];
                    if (debug) {
                        System.out.println(i - 1 + ": " + "POP " + string);
                    }
                    for (int j = 0; j < Integer.parseInt(string); j++) {
                        options.pop();
                    }
                    break;
                case "RETURN":
                    string = parts[2];
                    fulString = instPool[i];
                    Object temp = options.pop(); // se a function tiver variaveis locais inicializadas para dar o pop

                    String[] partsTemp = fulString.split(" ");
                    if (partsTemp[1].equals("POP")){
                        for (int j = 0; j < Integer.parseInt(partsTemp[2]); j++) {
                            options.pop();
                        }
                    }

                    NUM = Integer.parseInt(string);
                    if (debug) {
                        System.out.println(i - 1 + ": " + "RETURN " + NUM);
                    }

                    int nextInst = (int) options.pop();
                    lb = (int) options.pop();
                    for (int jp = 0; jp < NUM; jp++) {
                        options.pop();
                    }
                    i = nextInst;
                    options.push(temp);
                    break;
                case "NOT":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "NOT");
                    }
                    options.push(!(Boolean) options.pop());
                    break;
                case "EQUAL":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "EQUAL");
                    }
                    if (options.pop() == options.pop()) {
                        options.push((Boolean) true);
                    } else {
                        options.push((Boolean) false);
                    }
                    break;
                case "DIF":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "DIF");
                    }
                    if (options.pop() != options.pop()) {
                        options.push((Boolean) true);
                    } else {
                        options.push((Boolean) false);
                    }
                    break;
                case "TRUE":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "TRUE");
                    }
                    options.push((Boolean) true);
                    break;
                case "FALSE":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "FALSE");
                    }
                    options.push((Boolean) false);
                    break;
                case "CONCAT":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "CONCAT");
                    }
                    String rightS = (String) options.pop();
                    String leftS = (String) options.pop();
                    options.push((String) leftS + rightS);
                    break;
                case "NIL":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "NIL");
                    }
                    options.push((String) "nil");
                    break;
                case "GT":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "GT");
                    }
                    rightD = (Double) options.pop();
                    leftD = (Double) options.pop();
                    if (leftD > rightD) {
                        options.push((Boolean) true);
                    } else {
                        options.push((Boolean) false);
                    }
                    break;
                case "LT":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "LT");
                    }
                    rightD = (Double) options.pop();
                    leftD = (Double) options.pop();
                    if (leftD < rightD) {
                        options.push((Boolean) true);
                    } else {
                        options.push((Boolean) false);
                    }
                    break;
                case "GEQ":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "GEQ");
                    }
                    rightD = (Double) options.pop();
                    leftD = (Double) options.pop();
                    if (leftD >= rightD) {
                        options.push((Boolean) true);
                    } else {
                        options.push((Boolean) false);
                    }
                    break;
                case "LEQ":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "LEQ");
                    }
                    rightD = (Double) options.pop();
                    leftD = (Double) options.pop();
                    if (leftD <= rightD) {
                        options.push((Boolean) true);
                    } else {
                        options.push((Boolean) false);
                    }
                    break;
                case "EQ_N":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "EQ_N");
                    }
                    rightD = (Double) options.pop();
                    leftD = (Double) options.pop();
                    if (leftD.equals(rightD)) {
                        options.push((Boolean) true);
                    } else {
                        options.push((Boolean) false);
                    }
                    break;
                case "EQ_B":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "EQ_B");
                    }
                    rightB = (Boolean) options.pop();
                    leftB = (Boolean) options.pop();
                    if (leftB.equals(rightB)) {
                        options.push((Boolean) true);
                    } else {
                        options.push((Boolean) false);
                    }
                    break;
                case "EQ_S":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "EQ_S");
                    }
                    rightS = (String) options.pop();
                    leftS = (String) options.pop();
                    if (leftS.equals(rightS)) {
                        options.push((Boolean) true);
                    } else {
                        options.push((Boolean) false);
                    }
                    break;
                case "EQ_NIL":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "EQ_NIL");
                    }
                    rightS = (String) options.pop();
                    leftS = (String) options.pop();
                    if (leftS.equals(rightS)) {
                        options.push((Boolean) true);
                    } else {
                        options.push((Boolean) false);
                    }
                    break;
                case "NEQ_N":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "NEQ_N");
                    }
                    rightD = (Double) options.pop();
                    leftD = (Double) options.pop();
                    if (leftD.equals(rightD)) {
                        options.push((Boolean) false);
                    } else {
                        options.push((Boolean) true);
                    }
                    break;
                case "NEQ_B":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "NEQ_B");
                    }
                    rightB = (Boolean) options.pop();
                    leftB = (Boolean) options.pop();
                    if (leftB.equals(rightB)) {
                        options.push((Boolean) false);
                    } else {
                        options.push((Boolean) true);
                    }
                    break;
                case "NEQ_S":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "NEQ_S");
                    }
                    rightS = (String) options.pop();
                    leftS = (String) options.pop();
                    if (leftS.equals(rightS)) {
                        options.push((Boolean) false);
                    } else {
                        options.push((Boolean) true);
                    }
                    break;
                case "NEQ_NIL":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "NEQ_NIL");
                    }
                    rightS = (String) options.pop();
                    leftS = (String) options.pop();
                    if (leftS.equals(rightS)) {
                        options.push((Boolean) false);
                    } else {
                        options.push((Boolean) true);
                    }
                    break;
                case "PRINT_N":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "PRINT_N");
                    }
                    System.out.println((Double) options.pop());
                    break;
                case "PRINT_B":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "PRINT_B");
                    }
                    System.out.println((Boolean) options.pop());
                    break;
                case "PRINT_S":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "PRINT_S");
                    }
                    System.out.println(options.pop());
                    break;
                case "PRINT_NIL":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "PRINT_NIL");
                    }
                    System.out.println(options.pop());
                    break;
                case "GLOBAL":
                    string = parts[2];
                    globals = new Object[Integer.parseInt(string)];
                    if (debug) {
                        System.out.println(i - 1 + ": " + "GLOBAL " + string);
                    }
                    break;
                case "LOCAL":
                    string = parts[2];
                    for (int j = 0; j < Integer.parseInt(string); j++) {
                        options.push("nil");
                    }
                    if (debug) {
                        System.out.println(i - 1 + ": " + "LOCAL " + string);
                    }
                    break;
                case "LOADL":
                    string = parts[2];
                    NUM = Integer.parseInt(string);
                    if (debug) {
                        System.out.println(i - 1 + ": " + "LOADL " + NUM);
                    }
                    NUM += lb;
                    Object tempHere = options.myStack.get(NUM);
                    options.push(tempHere);
                    break;
                case "LOADG":
                    string = parts[2];
                    NUM = Integer.parseInt(string);
                    if (debug) {
                        System.out.println(i - 1 + ": " + "LOADG " + NUM);
                    }
                    if (globals[NUM] == null || globals[NUM].equals("nil")) {
                        System.out.println("runtime error: marVM accessed a nil value.");
                        System.out.println("               global variable might not be initialized.");
                        System.exit(0);
                    }
                    options.push(globals[NUM]);
                    break;
                case "STOREL":
                    string = parts[2];
                    NUM = Integer.parseInt(string);
                    if (debug) {
                        System.out.println(i - 1 + ": " + "STOREL " + NUM);
                    }
                    options.myStack.set(lb + NUM, options.pop());
                    NUM += lb;
                    break;
                case "STOREG":
                    string = parts[2];
                    NUM = Integer.parseInt(string);
                    if (debug) {
                        System.out.println(i - 1 + ": " + "STOREG " + NUM);
                    }
                    globals[NUM] = options.pop();
                    break;
                case "CALL":
                    string = parts[2];
                    NUM = Integer.parseInt(string);
                    options.push((int) lb);
                    lb = options.myStack.size() - 1;
                    options.push((int) i);
                    if (debug) {
                        System.out.println(i - 1 + ": " + "CALL " + NUM);
                    }
                    i = NUM;
                    break;
                case "JUMP":
                    string = parts[2];
                    NUM = Integer.parseInt(string);
                    if (debug) {
                        System.out.println(i - 1 + ": " + "JUMP " + NUM);
                    }
                    i = NUM;
                    break;
                case "JUMPF":
                    string = parts[2];
                    NUM = Integer.parseInt(string);
                    if (debug) {
                        System.out.println(i - 1 + ": " + "JUMPF " + NUM);
                    }
                    if (options.pop().equals(false)) {
                        i = NUM;
                    }
                    break;
                case "DO":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "DO" + "\n" + options.pop());
                    } else {
                        System.out.println((Boolean) options.pop());
                    }
                    break;
                case "THEN":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "THEN" + "\n" + options.pop());
                    } else {
                        System.out.println((String) options.pop());
                    }
                    break;
                case "IFSTART":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "IFSTART" + "\n" + options.pop());
                    } else {
                        System.out.println(options.pop());
                    }
                    break;
                case "IFEND":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "IFEND" + "\n" + options.pop());
                    } else {
                        System.out.println((Double) options.pop());
                    }
                    break;
                case "ID":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "ID" + "\n" + options.pop());
                    } else {
                        System.out.println((Boolean) options.pop());
                    }
                    break;
                case "ELSESTART":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "ELSESTART" + "\n" + options.pop());
                    } else {
                        System.out.println((String) options.pop());
                    }
                    break;
                case "ELSEEND":
                    if (debug) {
                        System.out.println(i - 1 + ": " + "ELSEEND" + "\n" + options.pop());
                    } else {
                        System.out.println(options.pop());
                    }
                    break;
            }
        }
    }
}
