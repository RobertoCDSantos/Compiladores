import org.antlr.v4.codegen.model.chunk.ArgRef;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import helpful.*;
import mar.*;

public class marCompiler {
    // static debug flag;
    static boolean debug = false;
    static String directoryPath;
    static String fileName;
    static String inputFileSave = "console";
    static numberOfVars numbers2file = new numberOfVars();

    public static class translate extends marBaseListener {

        HashMap<String, Integer> usefulMap = new HashMap<String, Integer>();

        public void hashMaps() {
            usefulMap.put("DCONST", 1);
            usefulMap.put("ADD", 2);
            usefulMap.put("SUB", 3);
            usefulMap.put("MULT", 4);
            usefulMap.put("DIV", 5);
            usefulMap.put("UMINUS", 6);
            usefulMap.put("PRINT", 7);
            usefulMap.put("HALT", 8);
            usefulMap.put("STRING", 9);
            usefulMap.put("OR", 10);
            usefulMap.put("AND", 11);
            usefulMap.put("NOT", 12);
            usefulMap.put("EQUAL", 13);
            usefulMap.put("DIF", 14);
            usefulMap.put("TRUE", 15);
            usefulMap.put("FALSE", 16);
            usefulMap.put("CONCAT", 17);
            usefulMap.put("NIL", 18);
            usefulMap.put("GT", 19);
            usefulMap.put("LT", 20);
            usefulMap.put("GEQ", 21);
            usefulMap.put("LEQ", 22);
            usefulMap.put("EQ_N", 23);
            usefulMap.put("EQ_B", 24);
            usefulMap.put("EQ_S", 25);
            usefulMap.put("EQ_NIL", 26);
            usefulMap.put("NEQ_N", 27);
            usefulMap.put("NEQ_B", 28);
            usefulMap.put("NEQ_S", 29);
            usefulMap.put("NEQ_NIL", 30);
            usefulMap.put("PRINT_N", 31);
            usefulMap.put("PRINT_B", 32);
            usefulMap.put("PRINT_S", 33);
            usefulMap.put("PRINT_NIL", 34);
            usefulMap.put("GLOBAL", 35);
            usefulMap.put("LOAD", 36);
            usefulMap.put("STORE", 37);
            usefulMap.put("JUMP", 38);
            usefulMap.put("JUMPF", 39);
            usefulMap.put("DO", 40);
            usefulMap.put("THEN", 41);
            usefulMap.put("IFSTART", 42);
            usefulMap.put("IFEND", 43);
            usefulMap.put("ID", 44);
            usefulMap.put("ELSESTART", 45);
            usefulMap.put("ELSEEND", 46);
            usefulMap.put("POP", 47);
            usefulMap.put("CALL", 48);
            usefulMap.put("STOREG", 49);
            usefulMap.put("STOREL", 50);
            usefulMap.put("LOADG", 51);
            usefulMap.put("LOADL", 52);
            usefulMap.put("LOCAL", 53);
            usefulMap.put("RETURN", 54);
            usefulMap.put("CONST", 55);
            usefulMap.put("NUMBER", 56);
        }

        public class IDVar {
            private String tipo;
            private String nome;
            private Boolean init;
            private int pos;
            private int args;
            private Boolean returning;
            private IDVar[] localVars;
            int count = 0;

            public IDVar(String tipo, String nome) {
                this.tipo = tipo;
                this.nome = nome;
            }

            public IDVar(String tipo, String nome, int pos, int args, Boolean returning) {
                this.tipo = tipo;
                this.nome = nome;
                this.pos = pos;
                this.args = args;
                this.returning = returning;
            }

            public IDVar(String tipo, String nome, Boolean init) {
                this.tipo = tipo;
                this.nome = nome;
                this.init = init;
            }

            // Getters e setters
            public IDVar[] getLocalVars() {
                return localVars;
            }

            public String getTipo() {
                return tipo;
            }

            public String getNome() {
                return nome;
            }

            public int getPos() {
                return pos;
            }

            public Boolean getInit() {
                return init;
            }

            public Boolean getReturning() {
                return returning;
            }

            public int getArgs() {
                return args;
            }

            public void addLocalVars(IDVar value) {
                this.localVars[count++] = value;
            }

            public void setLocalVars(int value) {
                this.localVars = new IDVar[value];
            }

            public void setTipo(String tipo) {
                this.tipo = tipo;
            }

            public void setReturning(Boolean returning) {
                this.returning = returning;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public void setInit(Boolean init) {
                this.init = init;
            }

            public void setPos(int pos) {
                this.pos = pos;
            }

            public void setArgs(int args) {
                this.args = args;
            }

        }

        public void pop(int index, int times) {
            for (int j = 0; j < times; j++) {
                for (int i = index; i < constPoolL.length - 1; i++) {
                    constPoolL[i] = constPoolL[i + 1];
                }
                index--;
                constPoolL[constPoolL.length - 1] = null;
            }
        }

        IDVar[] constPool; // pool das globais
        IDVar[] constPoolL; // pool das locais
        IDVar[] funcPool; // pool das funcs
        String[] everything; // guardamos tudo
        String[] errorsArray; // erros aqui
        int[] blockVariables; // variaveis no bloco atual

        Stack<Integer> localNow = new Stack<Integer>(); // o numero de variaveis atualmente a ser usadas locais
        Stack<String> StackPool = new Stack<String>(); // Salvar tipos
        ArrayList<IDVar> localConstPool = new ArrayList<IDVar>(); // localConstPool

        public void counter() {
            constPool = new IDVar[numbers2file.getGlobals() + 1]; // para guardar as globais
            constPoolL = new IDVar[numbers2file.getLocals() + 1]; // para guardar as locais
            funcPool = new IDVar[numbers2file.getFuncs() + 1]; // para guardar funcs
            everything = new String[numbers2file.getNumberInsts() + 1]; // tudo
            errorsArray = new String[numbers2file.getNumberInsts() + 1]; // erros
            blockVariables = new int[numbers2file.getLocals() + 1]; // variaveis nos blocos
        }

        int funcs = 0; // n de funcoes
        int poolCounterL = 0; // pooli counter local
        int poolCounter = 0; // pooli counter
        int count = 0; // everything counter
        int errors = 0; // errorsArray counter
        int numberOfReturns = 0; // validar os returns
        Stack<Integer> ArgList = new Stack<Integer>(); // para eu saber quantas coisas tem dentro da arg list

        int localvalue = -1; // numero para guiar o array blockVariables, index

        String url = directoryPath + fileName; // url do ficheiro
        DataOutputStream dataOutputStream; // tratar dos bytes
        int n = 0; // um counter
        IDVar ActualFunc; // se estamos dentro de uma func

        public String getType(boolean both, boolean init, int line, int charPosition) {
            // funcao para verificar o tipo das variavaeis anteriores
            // both se forem as duas ultimas, se esta inicializada, linha e posição para
            // erros
            String right = new String(); // da direita
            String left = new String(); // da esquerda
            boolean error = true; // flag para erros
            // com funções

            if (count > 2 && everything[count - 2].equals("ID")) { // ID logo antes
                for (int i = 0; i < poolCounter; i++) {
                    if (constPool[i].getNome().equals(everything[count - 1])) {
                        right = " and " + constPool[i].getTipo();
                        error = false;
                        break;
                    }
                }
                for (int i = 0; i < localConstPool.size(); i++) {
                    if (localConstPool.get(i).getNome().equals(everything[count - 1])) {
                        right = " and " + localConstPool.get(i).getTipo();
                        error = false;
                        break;
                    }
                }
                if (error) {
                    errorsArray[errors++] = "line " + line + ":" + charPosition + " error: variable " +
                            everything[count - 1] + " is not initialized";
                    return "";
                }
            } else if (count > 2 && everything[count - 2].equals("CALL")) {
                String temp1 = StackPool.pop();
                StackPool.push(temp1);
                for (int i = 0; i < funcs; i++) {
                    if (funcPool[i].getNome().equals(everything[count - 1])) {
                        right = " and " + funcPool[i].getTipo();
                        error = false;
                        break;
                    }
                }
                if (both) { // se houver 2 e tiver um call func a frente é um caso especial
                    return temp1 + right;
                } else {
                    return right;
                }
            } else {
                if ((everything[count - 1].equals("TRUE") || everything[count - 1].equals("FALSE")
                        || everything[count - 1].equals("GT") || everything[count - 1].equals("LT")
                        || everything[count - 1].equals("GEQ") || everything[count - 1].equals("LEQ")
                        || everything[count - 1].equals("EQ_N") || everything[count - 1].equals("EQ_B")
                        || everything[count - 1].equals("EQ_S") || everything[count - 1].equals("EQ_NIL")
                        || everything[count - 1].equals("NEQ_N") || everything[count - 1].equals("NEQ_B")
                        || everything[count - 1].equals("NEQ_S") || everything[count - 1].equals("NEQ_NIL")
                        || everything[count - 1].equals("NOT") || everything[count - 1].equals("OR")
                        || everything[count - 1].equals("AND"))) {
                    right = " and bool";
                } else if (everything[count - 1].equals("NIL")) {
                    right = " and nil";
                } else if (everything[count - 1].equals("UMINUS") || everything[count - 1].equals("ADD")
                        || everything[count - 1].equals("SUB") || everything[count - 1].equals("MULT")
                        || everything[count - 1].equals("DIV") || everything[count - 2].equals("DCONST")) {
                    right = " and number";
                } else if ((everything[count - 2].equals("STRING") || (everything[count - 2].equals("CONCAT")))) {
                    right = " and string";
                }
            }
            if (both && everything[count - 3].equals("ID")) {
                for (int i = 0; i < poolCounter; i++) {
                    if (constPool[i].getNome().equals(everything[count - 2])) {
                        left = constPool[i].getTipo();
                        error = false;
                        break;
                    }
                }
                for (int i = 0; i < localConstPool.size(); i++) {
                    if (localConstPool.get(i).getNome().equals(everything[count - 2])) {
                        left = localConstPool.get(i).getTipo();
                        error = false;
                        break;
                    }
                }
                if (error) {
                    errorsArray[errors++] = "line " + line + ":" + charPosition + " error: variable " +
                            everything[count - 2] + " is not initialized";
                    return "";
                }
            } else if (both && everything[count - 4].equals("ID")) {
                for (int i = 0; i < poolCounter; i++) {
                    if (constPool[i].getNome().equals(everything[count - 3])) {
                        left = constPool[i].getTipo();
                        error = false;
                        break;
                    }
                }
                for (int i = 0; i < localConstPool.size(); i++) {
                    if (localConstPool.get(i).getNome().equals(everything[count - 3])) {
                        left = localConstPool.get(i).getTipo();
                        error = false;
                        break;
                    }
                }
                if (error) {
                    errorsArray[errors++] = "line " + line + ":" + charPosition + " error: variable " +
                            everything[count - 3] + " is not initialized";
                    return "";
                }
            } else if (both) {
                if ((everything[count - 2].equals("TRUE") || everything[count - 2].equals("FALSE")
                        || everything[count - 2].equals("GT") || everything[count - 2].equals("LT")
                        || everything[count - 2].equals("GEQ") || everything[count - 2].equals("LEQ")
                        || everything[count - 2].equals("EQ_N") || everything[count - 2].equals("EQ_B")
                        || everything[count - 2].equals("EQ_S") || everything[count - 2].equals("EQ_NIL")
                        || everything[count - 2].equals("NEQ_N") || everything[count - 2].equals("NEQ_B")
                        || everything[count - 2].equals("NEQ_S") || everything[count - 2].equals("NEQ_NIL")
                        || everything[count - 2].equals("NOT") || everything[count - 2].equals("OR")
                        || everything[count - 2].equals("AND"))

                        || everything[count - 3].equals("TRUE") || everything[count - 3].equals("FALSE")
                        || everything[count - 3].equals("GT") || everything[count - 3].equals("LT")
                        || everything[count - 3].equals("GEQ") || everything[count - 3].equals("LEQ")
                        || everything[count - 3].equals("EQ_N") || everything[count - 3].equals("EQ_B")
                        || everything[count - 3].equals("EQ_S") || everything[count - 3].equals("EQ_NIL")
                        || everything[count - 3].equals("NEQ_N") || everything[count - 3].equals("NEQ_B")
                        || everything[count - 3].equals("NEQ_S") || everything[count - 3].equals("NEQ_NIL")
                        || everything[count - 3].equals("NOT") || everything[count - 3].equals("OR")
                        || everything[count - 3].equals("AND")) {
                    left = "bool";
                } else if (everything[count - 2].equals("NIL") || everything[count - 3].equals("NIL")) {
                    left = "nil";
                } else if ((everything[count - 3].equals("DCONST")) || (everything[count - 4].equals("DCONST"))
                        || (everything[count - 2].equals("ADD")) || (everything[count - 3].equals("ADD"))
                        || (everything[count - 2].equals("MULT")) || (everything[count - 3].equals("MULT"))
                        || (everything[count - 2].equals("DIV")) || (everything[count - 3].equals("DIV"))
                        || (everything[count - 2].equals("SUB")) || (everything[count - 3].equals("SUB"))
                        || (everything[count - 2].equals("UMINUS")) || (everything[count - 3].equals("UMINUS"))) {
                    left = "number";
                } else if (count > 3 && everything[count - 3].equals("CALL")) {
                    for (int i = 0; i < funcs; i++) {
                        if (funcPool[i].getNome().equals(everything[count - 2])) {
                            right = funcPool[i].getTipo();
                            error = false;
                            break;
                        }
                    }
                } else if (count > 4 && everything[count - 4].equals("CALL")) {
                    for (int i = 0; i < funcs; i++) {
                        if (funcPool[i].getNome().equals(everything[count - 3])) {
                            right = funcPool[i].getTipo();
                            error = false;
                            break;
                        }
                    }
                } else if (everything[count - 3].equals("STRING") || (everything[count - 3].equals("CONCAT")) ||
                        everything[count - 4].equals("STRING") || (everything[count - 4].equals("CONCAT"))) {
                    left = "string";
                }
            } else {
                return right;
            }

            return left + right;
        }

        public void enterProg(marParser.ProgContext ctx) {
            counter();
            hashMaps();
        }

        public void enterArgList(marParser.ArgListContext ctx) { // guardar o numero de variaveis que tinhamos
            // para dps sabermos quantas variaveis tinhamos na arglist
            ArgList.push(StackPool.size());
        }

        public void exitMulDiv(marParser.MulDivContext ctx) { // MUL or div
            String types = getType(true, true, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
            if (!types.equals("")) {
                String[] parts = types.split(" and ");
                String left = parts[0];
                String right = parts[1];
                String left2 = StackPool.pop();
                String right2 = StackPool.pop();
                StackPool.push("number"); // stackpool auxiliar
                if (ctx.op.getText().equals("*")) {
                    if (left.equals("number") && left.equals(right)) {
                        everything[count++] = "MULT";
                    } else {
                        everything[count++] = "MULT";
                        errorsArray[errors] = "line " + ctx.getStart().getLine() + ":"
                                + ctx.getStop().getCharPositionInLine() +
                                " error: operator * is invalid between ";
                        errorsArray[errors++] += types;
                    }
                } else {
                    if (left.equals("number") && left.equals(right)) {
                        everything[count++] = "DIV";
                    } else {
                        everything[count++] = "DIV";
                        errorsArray[errors] = "line " + ctx.getStart().getLine() + ":"
                                + ctx.getStop().getCharPositionInLine() +
                                " error: operator / is invalid between ";
                        errorsArray[errors++] += types;
                    }
                }
            }
        }

        public void exitAddSub(marParser.AddSubContext ctx) { // Add or sub
            String types = getType(true, true, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
            if (!types.equals("")) {
                String[] parts = types.split(" and ");
                String left = parts[0];
                String right = parts[1];
                String left2 = StackPool.pop();
                String right2 = StackPool.pop();
                StackPool.push("number");
                if (ctx.op.getText().equals("+")) {
                    if (left.equals("string") && left.equals(right)) {
                        everything[count++] = "CONCAT";
                        everything[count++] = "concatenacao";
                    } else if (left.equals("number") && left.equals(right)) {
                        everything[count++] = "ADD";
                    } else {
                        errorsArray[errors] = "line " + ctx.getStart().getLine() + ":"
                                + ctx.getStop().getCharPositionInLine() +
                                " error: operator + is invalid between ";
                        errorsArray[errors++] += types;
                    }
                } else {
                    if (left.equals("number") && left.equals(right)) {
                        everything[count++] = "SUB";
                    } else {
                        errorsArray[errors] = "line " + ctx.getStart().getLine() + ":"
                                + ctx.getStop().getCharPositionInLine() +
                                " error: operator - is invalid between ";
                        errorsArray[errors++] += types;
                    }
                }
            }

        }

        public void exitAND(marParser.ANDContext ctx) { // exit de um AND
            String types = getType(true, true, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
            if (!types.equals("")) {
                String[] parts = types.split(" and ");
                String left = parts[0];
                String right = parts[1];
                String left2 = StackPool.pop();
                String right2 = StackPool.pop();
                StackPool.push("bool");
                if (left.equals("bool") && left.equals(right)) {
                    everything[count++] = "AND";
                } else {
                    errorsArray[errors] = "line " + ctx.getStart().getLine() + ":"
                            + ctx.getStop().getCharPositionInLine() +
                            " error: operator and is invalid between ";
                    errorsArray[errors++] += types;
                }
            }
        }

        public void exitOR(marParser.ORContext ctx) { // exit de um OR
            String types = getType(true, true, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
            if (!types.equals("")) {
                String[] parts = types.split(" and ");
                String left = parts[0];
                String right = parts[1];
                String left2 = StackPool.pop();
                String right2 = StackPool.pop();
                StackPool.push("bool");
                if (left.equals("bool") && left.equals(right)) {
                    everything[count++] = "OR";
                } else {
                    errorsArray[errors] = "line " + ctx.getStart().getLine() + ":"
                            + ctx.getStop().getCharPositionInLine() +
                            " error: operator and is invalid between ";
                    errorsArray[errors++] += types;
                }
            }
        }

        public void exitUseless(marParser.UselessContext ctx) {
            everything[count++] = "POP 1";
            ;
        }

        public void exitPrint(marParser.PrintContext ctx) { // Exit de um print
            String types = getType(false, true, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
            if (!types.equals("")) {
                String left = types.substring(5);
                if (left.equals("nil")) {
                    everything[count++] = "PRINT_NIL";
                } else if (left.equals("bool")) {
                    everything[count++] = "PRINT_B";
                } else if (left.equals("string")) {
                    everything[count++] = "PRINT_S";
                } else if (left.equals("number")) {
                    everything[count++] = "PRINT_N";
                }
            } else {
                everything[count++] = "PRINT_S";
            }
        }

        public void exitEqDif(marParser.EqDifContext ctx) { // EqDif
            String types = getType(true, true, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
            if (!types.equals("")) {
                String[] parts = types.split(" and "); // para ajudar a escrever dps a mensagem
                String left = parts[0];
                String right = parts[1];
                String left2 = StackPool.pop();
                String right2 = StackPool.pop();
                StackPool.push("bool");
                if (ctx.op.getText().equals("==")) {
                    if (left.equals("bool") && left.equals(right)) {
                        everything[count++] = "EQ_B";
                    } else if (left.equals("string") && left.equals(right)) {
                        everything[count++] = "EQ_S";
                    } else if (left.equals("nil") && left.equals(right)) {
                        everything[count++] = "EQ_NIL";
                    } else if (left.equals("number") && left.equals(right)) {
                        everything[count++] = "EQ_N";
                    } else {
                        errorsArray[errors] = "line " + ctx.getStart().getLine() + ":"
                                + ctx.getStop().getCharPositionInLine() +
                                " error: operator == is invalid between ";
                        errorsArray[errors++] += types;
                    }
                } else {
                    if (left.equals("bool") && left.equals(right)) {
                        everything[count++] = "NEQ_B";
                    } else if (left.equals("string") && left.equals(right)) {
                        everything[count++] = "NEQ_S";
                    } else if (left.equals("nil") && left.equals(right)) {
                        everything[count++] = "NEQ_NIL";
                    } else if (left.equals("number") && left.equals(right)) {
                        everything[count++] = "NEQ_N";
                    } else {
                        errorsArray[errors] = "line " + ctx.getStart().getLine() + ":"
                                + ctx.getStop().getCharPositionInLine() +
                                " error: operator == is invalid between ";
                        errorsArray[errors++] += types;
                    }
                }
            }
        }

        public void exitNeg(marParser.NegContext ctx) { // Neg
            String types = getType(false, true, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
            if (!types.equals("")) {
                String left = types.substring(5);
                String left2 = StackPool.pop();
                StackPool.push("number");
                if (ctx.op.getText().equals("-")) {
                    if (left.equals("number")) {
                        everything[count++] = "UMINUS";
                    } else {
                        errorsArray[errors] = "line " + ctx.getStart().getLine() + ":"
                                + ctx.getStop().getCharPositionInLine() +
                                " error: unary operator - is invalid for ";
                        errorsArray[errors++] += left;
                    }
                } else {
                    if (left.equals("bool")) {
                        everything[count++] = "NOT";
                    } else {
                        errorsArray[errors] = "line " + ctx.getStart().getLine() + ":"
                                + ctx.getStop().getCharPositionInLine() +
                                " error: unary operator not is invalid for ";
                        errorsArray[errors++] += left;
                    }
                }
            }
        }

        public void exitMinMai(marParser.MinMaiContext ctx) { // MinMai
            String types = getType(true, true, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
            if (!types.equals("")) {
                String[] parts = types.split(" and ");
                String left = parts[0];
                String right = parts[1];
                String left2 = StackPool.pop();
                String right2 = StackPool.pop();
                StackPool.push("bool");
                if (left.equals("number") && left.equals(right)) {
                    if (ctx.op.getText().equals("<")) {
                        everything[count++] = "LT";
                    } else if (ctx.op.getText().equals(">")) {
                        everything[count++] = "GT";
                    } else if (ctx.op.getText().equals("<=")) {
                        everything[count++] = "LEQ";
                    } else {
                        everything[count++] = "GEQ";
                    }
                } else {
                    errorsArray[errors] = "line " + ctx.getStart().getLine() + ":"
                            + ctx.getStop().getCharPositionInLine() +
                            " error: operator == is invalid between ";
                    errorsArray[errors++] += types;
                }
            }
        }

        public void exitNIL(marParser.NILContext ctx) { // exit de um NIL
            StackPool.push("nil");
            everything[count++] = "NIL";
        }

        public void exitString(marParser.StringContext ctx) { // Exit de uma String .
            StackPool.push("string");
            everything[count++] = "STRING";
            everything[count++] = ctx.STRING().getText();
        }

        public void exitBoolean(marParser.BooleanContext ctx) { // bool
            if (ctx.BOOLEAN().getText().equals("true")) {
                StackPool.push("bool");
                everything[count++] = "TRUE";
            } else {
                StackPool.push("bool");
                everything[count++] = "FALSE";
            }
        }

        public void exitNumber(marParser.NumberContext ctx) { // numero
            StackPool.push("number");
            everything[count++] = "DCONST";
            everything[count++] = ctx.NUMBER().getText();
        }

        public void exitID(marParser.IDContext ctx) { // IDs na grammar, o LOAD
            String ID = ctx.ID().getText();
            for (int i = 0; i < poolCounter; i++) { // global
                if (constPool[i].getNome().equals(ID)) {
                    StackPool.push(constPool[i].getTipo());
                    break;
                }
            }
            for (int i = 0; i < localConstPool.size(); i++) { // local
                if (localConstPool.get(i).getNome().equals(ID)) {
                    StackPool.push(localConstPool.get(i).getTipo());
                    break;
                }
            }
            everything[count++] = "ID";
            everything[count++] = ID;
        }

        public void enterWhileStmt(marParser.WhileStmtContext ctx) { // while enter
            everything[count++] = "JUMPF";
        }

        public void exitWhileStmt(marParser.WhileStmtContext ctx) { // while exit
            Boolean change = false;
            Boolean store = false;
            Boolean load = false;
            ArrayList<String> varStack = new ArrayList<String>();
            int toStartGood = 0;
            for (int i = count - 1; i > -1; i--) {
                if (everything[i].equals("JUMPF")) {
                    toStartGood = i;
                    break;
                }
            }
            everything[count++] = "JUMP";
            for (int i = toStartGood; i < count; i++) { // loop infinito check
                if (everything[i].equals("JUMP")) {
                    break;
                } else if (everything[i].equals("RETURN")) {
                    numberOfReturns--;
                    if (numberOfReturns == 0) {
                        ActualFunc.setReturning(false);
                    }
                } else if (everything[i].equals("ID") && !change) {
                    load = true;
                    varStack.add(everything[i + 1]);
                } else if (everything[i].equals("DO")) {
                    change = true;
                } else if (everything[i].equals("STORE") && change) {
                    for (int k = 0; k < varStack.size(); k++) {
                        for (int j = 0; j < poolCounterL; j++) {
                            if (constPoolL[j].getNome().equals(everything[i + 1]) && constPoolL[j].getNome().equals(varStack.get(k))) {
                                store = true;
                                break;
                            }
                        }
                        for (int j = 0; j < poolCounter; j++) { // dentro da global
                            if (constPool[j].getNome().equals(everything[i + 1]) && constPoolL[j].getNome().equals(varStack.get(k))) {
                                store = true;
                                break;
                            }
                        }
                    }
                }
            }
            for (int i = count - 1; i > -1; i--) {
                if (everything[i].equals("DO")) {
                    break;
                } else if (everything[i].equals("RETURN")) {
                    numberOfReturns--;
                    if (numberOfReturns == 0) {
                        ActualFunc.setReturning(false);
                    }
                }
            }
            if (load && !store) {
                errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                        + ctx.getStop().getCharPositionInLine() +
                        " error: looks like the while will to not end";
            }
            // else if (load && store){
            // errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
            // + ctx.getStop().getCharPositionInLine() +
            // " error: looks like the while will to not end";
            // }
        }

        public void exitReturnStmt(marParser.ReturnStmtContext ctx) { // return
            if (ActualFunc == null) {
                errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                        + ctx.getStop().getCharPositionInLine() +
                        " error: return should not be outside a function";
            } else { // ver se tem alguma expr o return
                if (ctx.expr() != null && ActualFunc.tipo != null) { // funcao e return, com args ambos
                    ActualFunc.setReturning(true);
                    String types = getType(false, true, ctx.getStart().getLine(),
                            ctx.getStop().getCharPositionInLine());
                    if (!types.equals("")) { // verificar se os tipos estão certos
                        String left = types.substring(5);
                        if (!left.equals(ActualFunc.tipo)) {
                            errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                                    + ctx.getStop().getCharPositionInLine() +
                                    " error: function " + ActualFunc.nome + " should return a value of type "
                                    + ActualFunc.tipo + ", not " + left;
                        }
                    }
                } else if (ctx.expr() == null && ActualFunc.tipo != null) {// return vazio, funcao com args
                    errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                            + ctx.getStop().getCharPositionInLine() +
                            " error: function " + ActualFunc.nome + " should return a value of type "
                            + ActualFunc.tipo;
                } else if (ctx.expr() != null && ActualFunc != null) { // tem argumentos, a funcao não tem
                    errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                            + ctx.getStop().getCharPositionInLine() +
                            " error: function " + ActualFunc.nome + " should not return a value";
                }

            }
            numberOfReturns++;
            everything[count++] = "RETURN";
        }

        public void exitParamList(marParser.ParamListContext ctx) { // params das funcs
            if (ctx.TYPES().size() > 0) {
                everything[count++] = "PARAMS";
                for (int i = 0; i < ctx.TYPES().size(); i++) {
                    everything[count] += ctx.TYPES(i).getText() + "," + ctx.ID(i).getText() + ",";
                }
                everything[count] = everything[count].replace("null", ""); // isto começava sempre com null..
                String[] parts = everything[count].split(",");
                int func = 0;
                for (int i = 0; i < funcs; i++) { // meter o numero de args na func
                    if (funcPool[i].getNome().equals(everything[count - 2])) {
                        funcPool[i].setArgs(parts.length / 2); // n de args
                        ActualFunc.setArgs(parts.length / 2);
                        funcPool[i].setLocalVars(parts.length / 2); // definir o array local na func
                        func = i;
                        break;
                    }
                }
                for (int i = 0; i < parts.length; i++) {
                    IDVar temp = new IDVar(parts[i++], parts[i]);
                    constPoolL[poolCounterL++] = temp; // add na const pool
                    localConstPool.add(temp);
                    funcPool[func].addLocalVars(temp); // add na func local
                }
                count++;
            }
        }

        public void exitFuncCall(marParser.FuncCallContext ctx) { // Function Call
            everything[count++] = "CALL";
            everything[count++] = ctx.ID().getText();
            int func = -1;
            for (int i = 0; i < funcs; i++) { // buscar a func que estamos a tratar
                if (funcPool[i].getNome().equals(everything[count - 1])) {
                    func = i;
                    break;
                }
            }
            if (func == -1) {
                errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                        + ctx.getStop().getCharPositionInLine() +
                        " error: function " + ctx.ID().getText() + " is not defined";
            }
            int nArgs = StackPool.size() - ArgList.pop();
            if (nArgs > 0 && func != -1) {
                int funcCounter = funcPool[func].getLocalVars().length;
                if (nArgs != funcCounter) {
                    errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                            + ctx.getStop().getCharPositionInLine() +
                            " error: " + ctx.ID().getText() + " has " + funcPool[func].getArgs() + " arguments, not "
                            + nArgs;
                } else {
                    for (int i = 0; i < nArgs; i++) {
                        String useful = StackPool.pop();
                        if (funcCounter != 0
                                && !funcPool[func].getLocalVars()[--funcCounter].getTipo().equals(useful)) {
                            // i tem de ser menor que o tamanho do array para não dar crash, diferente de 0,
                            // verificar se os tipos são iguais aos da func
                            errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                                    + ctx.getStop().getCharPositionInLine() +
                                    " error: actual parameter is of type " + useful + ", but type "
                                    + funcPool[func].getLocalVars()[funcCounter].getTipo() + " expected";
                            break;
                        }
                    }
                }
                StackPool.push(funcPool[func].getTipo());
            }
        }

        public void exitSoloCall(marParser.SoloCallContext ctx) { // Function Call
            everything[count++] = "CALL";
            everything[count++] = ctx.ID().getText();
        }

        public void enterFunc(marParser.FuncContext ctx) { // entrar na func
            everything[count++] = "FUNCSTART";
            everything[count++] = ctx.ID().getText();
            if (ctx.TYPES() != null) {
                funcPool[funcs++] = new IDVar(ctx.TYPES().getText(), ctx.ID().getText());
                ActualFunc = new IDVar(ctx.TYPES().getText(), ctx.ID().getText());
                ActualFunc.setReturning(false);
            } else {
                funcPool[funcs++] = new IDVar(null, ctx.ID().getText());
                ActualFunc = new IDVar(null, ctx.ID().getText());
            }
        }

        public void exitFunc(marParser.FuncContext ctx) { // sair da func
            everything[count++] = "FUNCEND";
            if (ActualFunc.returning != null && !ActualFunc.returning) { // função com args, sem return
                errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                        + ctx.getStop().getCharPositionInLine() +
                        " error: missing return in function " + ActualFunc.nome;
            }
            ActualFunc = null;
            for (int j = count - 1; j > -1; j--) {
                if (everything[j].equals("RETURN")) {
                    funcPool[funcs - 1].setReturning(true);
                    break;
                } else if (everything[j].equals("FUNCSTART")) {
                    funcPool[funcs - 1].setReturning(false);
                    break;
                }
            }
            numberOfReturns = 0;
        }

        public void exitDo(marParser.DoContext ctx) { // o DO do while
            String types = getType(false, true, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
            if (!types.equals("")) {
                String left = types.substring(5);
                if (left.equals("bool")) {
                } else {
                    errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                            + ctx.getStop().getCharPositionInLine() +
                            " error: if expression must be of type bool";
                }
            }
            everything[count++] = "DO";
        }

        // IfS whiles blocks
        public void enterIfThen(marParser.IfThenContext ctx) {
            everything[count++] = "IFSTART";
        }

        public void exitIfThen(marParser.IfThenContext ctx) { // tirar sempre a flag de return
            for (int i = count - 1; i > -1; i--) {
                if (everything[i].equals("THEN")) {
                    break;
                } else if (everything[i].equals("RETURN")) {
                    numberOfReturns--;
                    if (numberOfReturns == 0) {
                        ActualFunc.setReturning(false);
                    }
                }
            }
            everything[count++] = "IFEND";
        }

        public void enterIfBlock(marParser.IfBlockContext ctx) {
            everything[count++] = "IFSTART";
        }

        public void exitIfBlock(marParser.IfBlockContext ctx) { // tirar sempre a flag de return
            for (int i = count - 1; i > -1; i--) {
                if (everything[i].equals("THEN")) {
                    break;
                } else if (everything[i].equals("RETURN")) {
                    numberOfReturns--;
                    if (numberOfReturns == 0) {
                        ActualFunc.setReturning(false);
                    }
                }
            }
            everything[count++] = "IFEND";
        }

        public void enterElseBlock(marParser.ElseBlockContext ctx) {
            everything[count++] = "ELSESTART";
        }

        public void exitElseBlock(marParser.ElseBlockContext ctx) {
            Boolean first = false;
            Boolean second = false;
            Boolean change = false;
            int helpfulStart = 0;
            int localNumberOfReturns = 0; // no fim do primeiro for, tenho o numero de return do else
            for (int i = count - 1; i > -1; i--) {
                if (everything[i].equals("IFSTART")) {
                    helpfulStart = 0;
                    break;
                } else if (everything[i].equals("THEN") && change) { // termina
                    break;
                } else if (everything[i].equals("RETURN") && change) { // verifica o if
                    first = true;
                    localNumberOfReturns++;
                } else if (everything[i].equals("ELSESTART") && !change) { // verfiica o selse
                    change = true;
                } else if (everything[i].equals("RETURN") && !change) { // verificar o else
                    second = true;
                    localNumberOfReturns++;
                    numberOfReturns--;
                    if (numberOfReturns == 0) {
                        ActualFunc.setReturning(false);
                    }
                }
            }
            if (first && second) {
                ActualFunc.setReturning(true);
                numberOfReturns += localNumberOfReturns;
            }
            everything[count++] = "ELSEEND";
        }

        public void enterElseThen(marParser.ElseThenContext ctx) {
            everything[count++] = "ELSESTART";
        }

        public void exitElseThen(marParser.ElseThenContext ctx) {
            Boolean first = false;
            Boolean second = false;
            Boolean change = false;
            int helpfulStart = 0;
            int localNumberOfReturns = 0; // no fim do primeiro for, tenho o numero de return do else
            for (int i = count - 1; i > -1; i--) {
                if (everything[i].equals("IFSTART")) {
                    helpfulStart = 0;
                    break;
                } else if (everything[i].equals("THEN") && change) { // termina
                    break;
                } else if (everything[i].equals("RETURN") && change) { // verifica o if
                    first = true;
                    localNumberOfReturns++;
                } else if (everything[i].equals("ELSESTART") && !change) { // verfiica o selse
                    change = true;
                } else if (everything[i].equals("RETURN") && !change) { // verificar o else
                    second = true;
                    localNumberOfReturns++;
                    numberOfReturns--;
                    if (numberOfReturns == 0) {
                        ActualFunc.setReturning(false);
                    }
                }
            }
            if (first && second) {
                ActualFunc.setReturning(true);
                numberOfReturns += localNumberOfReturns;
            }
            everything[count++] = "ELSEEND";
        }

        // Then
        public void exitThen(marParser.ThenContext ctx) {
            String types = getType(false, true, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
            if (!types.equals("")) {
                String left = types.substring(5);
                if (left.equals("bool")) {
                } else {
                    errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                            + ctx.getStop().getCharPositionInLine() +
                            " error: if expression must be of type bool";
                }
            }
            everything[count++] = "THEN";
        }

        // types
        public void exitVar(marParser.VarContext ctx) {
            String ID = ctx.ID().getText();
            if (poolCounter < numbers2file.getGlobals()) { // criar variavel global, no sitio apropriado
                constPool[poolCounter++] = new IDVar(ctx.op.getText(), ID); // crirar variavel global, tipo e nome
            } else if (everything[count - 1].equals("BLOCKSTART")) { // variaveis locais
                everything[count++] = "LOCAL"; // escrever logo o local pq pelomenos 1 vamos ter
                everything[count++] = "-1"; // sitio para por o numero das locals
                constPoolL[poolCounterL++] = new IDVar(ctx.op.getText(), ID); // criar a variavel local
                localConstPool.add(new IDVar(ctx.op.getText(), ID));
                blockVariables[localvalue]++; // adicionar o numero de variveis locais desta função/bloco
                localNow.push(localNow.pop() + 1);
            } else { // caso já estejamos passado a primeira variavel, basta queriar e adicionar mais
                     // 1 ao counter
                localNow.push(localNow.pop() + 1);
                blockVariables[localvalue]++; // add mais 1, ao valor do numero de variaveis locais neste bloco
                constPoolL[poolCounterL++] = new IDVar(ctx.op.getText(), ID); // criar variavel local
                localConstPool.add(new IDVar(ctx.op.getText(), ID));
            }
        }

        public void exitStore(marParser.StoreContext ctx) {
            boolean error = true;
            String ID = ctx.ID().getText();
            String types = getType(false, true, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
            if (!types.equals("")) {
                String left = types.substring(5);
                for (int i = 0; i < poolCounter; i++) { // global
                    if (constPool[i].getNome().equals(ID)) {
                        if (constPool[i].getTipo().equals(left)) {
                            constPool[i].setInit(true);
                            everything[count++] = "STORE";
                            everything[count++] = ID;
                            error = false;
                            break;
                        } else {
                            errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                                    + ctx.getStop().getCharPositionInLine() +
                                    " error: cannot assign an expression of type " + left + " to a variable of type "
                                    + constPool[i].getTipo();
                            error = false;
                            break;
                        }
                    }
                }
                for (int i = 0; i < localConstPool.size(); i++) { // local
                    if (localConstPool.get(i).getNome().equals(ID)) {
                        if (localConstPool.get(i).getTipo().equals(left)) {
                            localConstPool.get(i).setInit(true);
                            everything[count++] = "STORE";
                            everything[count++] = ID;
                            error = false;
                            break;
                        } else {
                            errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                                    + ctx.getStop().getCharPositionInLine() +
                                    " error: cannot assign an expression of type " + left + " to a variable of type "
                                    + localConstPool.get(i).getTipo();
                            error = false;
                            break;
                        }
                    }
                }
                for (int i = 0; i < funcs; i++) { // local
                    if (funcPool[i].getNome().equals(ID)) {
                        errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                                + ctx.getStop().getCharPositionInLine() +
                                " error: " + ID + " is not a variable";
                        error = false;
                        break;
                    }
                }
                if (error) {
                    errorsArray[errors++] = "line " + ctx.getStart().getLine() + ":"
                            + ctx.getStop().getCharPositionInLine() +
                            " error: variable " + ID + " is not initialized ";
                }
            }
        }

        public void enterBlockStmt(marParser.BlockStmtContext ctx) { // para quando formos ao blockVariables estarmos a
                                                                     // trabalhos com o bloco certo
            if (ActualFunc != null && (everything[count - 2].equals("PARAMS"))) {
                localNow.push(ActualFunc.getArgs());
            } else {
                localNow.push(0);
            }
            everything[count++] = "BLOCKSTART";
            localvalue++;
        }

        public void exitBlockStmt(marParser.BlockStmtContext ctx) { //
            int whichLoad = 0;
            Boolean local = false;
            int times = localNow.pop();
            for (int i = 0; i < times; i++) {
                localConstPool.remove(localConstPool.size() - 1);
            }
            for (int i = 0; i < count; i++) { // ENCONTRAR O INICIO DO BLOCO QUE CORRESPONDE A ESTE QUE ESTAMOS
                                              // PRESTES A ANBADONAR, pois pode ter lá um local
                if ((everything[i].equals("LOCAL") && everything[i + 1].equals("-1")) && whichLoad == localvalue) {
                    // o numero desta função serve como indice no blockVariables
                    everything[i + 1] = " " + blockVariables[localvalue];
                    // SALVAR La O NUMERO DE LOCALS QUE HOUVE, que ja tem o sitio reservado
                    local = true; // local = true pois significa que existe um valor local, vai ser preciso dar
                                  // pop
                    break;
                } else if ((everything[i].equals("LOCAL") && everything[i + 1].equals("-1"))) {
                    // enquanto não é o local certo, função certa, bloco certo.
                    whichLoad++;
                }
            }
            everything[count++] = "BLOCKEND";
            if (local) {
                everything[count++] = "POP " + blockVariables[localvalue]; // retirar as variaveis locais
            }
            blockVariables[localvalue--] = 0;
        } // dar reset ao valor que temos lá de variaveis locais e andar para o indice
          // anterior, para passarmos a estar localizados na função anterior, se
          // ela existir, se não existir ficamos na base onde começou

        // sair do programa
        public void exitProg(marParser.ProgContext ctx) {
            everything[count++] = "HALT";
        }

        public void error() throws IOException {
            dataOutputStream = null;
        }

        // Finalizar o compilador
        public void complete() throws IOException {
            if (errors > 0) {
                System.out.println("... parsing done");
                for (int i = 0; i < errors; i++) {
                    System.out.println(errorsArray[i]);
                }
                System.out.println("... identification and type checking done");
                System.out.println(directoryPath + inputFileSave + " has " + errors + " semantic errors");
                System.exit(0);
            }

            int constant = 0;
            int numbers = 0;

            try {
                dataOutputStream = new DataOutputStream(new FileOutputStream(url));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            String[] consting = new String[numbers2file.getNumberConsts()];

            for (int i = 0; i < count; i++) {
                if (everything[i].equals("DCONST")) {
                    consting[numbers] = numbers++ + ": <NUMBER:" + Double.valueOf(everything[++i])
                            + ">";
                }
                if (everything[i].equals("STRING")) {
                    consting[numbers] = numbers++ + ": <STRING:" + everything[++i] + ">";
                }
            }

            String[] printing = new String[everything.length];

            constant = 0;
            numbers = 0;

            if (poolCounter > 0) {
                printing[numbers] = numbers++ + ": GLOBAL " + poolCounter;
            }

            Stack<Integer> jumpf = new Stack<Integer>(); // fim do while
            Stack<Integer> jump = new Stack<Integer>(); // inicio do while
            Stack<Integer> then = new Stack<Integer>(); // para fazer o jump do if
            Stack<Integer> funcJump = new Stack<Integer>(); // ter o numero das funções

            int oneJump = 0; // Colocar o numero do jump da section de funcoes
            int countFuncs = 0; // numero de funcs
            int argOfActualFunc = 0; // os argumentos da funcao atual
            int argsFunc = 0; // total de argumentos das funcoes somado
            Stack<Integer> localvalueToSkip = new Stack<Integer>(); // saber quantas variaveis vamos dar skip por
                                                                    // func
            int totalLocal = 0; // total de variaveis locais atualmente dentro de blocos ou funcs
            int totalLocal2 = 0; // para ter uma copia e usar na funcao
            Boolean insideFunc = false;
            int lb = 0;

            for (int i = 0; i < count; i++) {
                if (everything[i].equals("DCONST") || everything[i].equals("STRING")) {
                    printing[numbers] = numbers++ + ": CONST " + constant++;
                    i++;
                } else if (everything[i].equals("POP 1")) {
                    printing[numbers] = numbers++ + ": POP 1";
                } else if (everything[i].equals("LOCAL")) { // guarda o valor do numero de locals que vou ter
                    printing[numbers] = numbers++ + ": " + everything[i++] + everything[i];
                } else if (everything[i].equals("CALL")) {
                    for (int j = 0; j < funcs; j++) {
                        if (funcPool[j].getNome().equals(everything[i + 1])) { // VER QUAL É A FUNÇÃO QUE CHAMAMOS
                            funcJump.push(numbers);
                            printing[numbers] = numbers++ + ": CALL " + (((int) funcPool[j].getPos())); // ESCREVER
                                                                                                        // O CALL
                            if (!funcPool[j].getReturning()) { // função void, não tem return
                                if (!localvalueToSkip.isEmpty()) { // se tem variaveis locais
                                    printing[numbers] = numbers++ + ": POP "
                                            + (((int) funcPool[j].getArgs() + localvalueToSkip.peek()));
                                } else { // Nao tem return, nem variaveis ou seja é 1
                                    printing[numbers] = numbers++ + ": POP " + 1;
                                }
                            }
                            i++;
                            break;
                        }
                    }
                } else if (everything[i].equals("STOREG")) { // SO SKIP
                } else if (everything[i].equals("ARGLISTEND")) { // SO SKIP
                } else if (everything[i].equals("ARGLISTSTART")) {// SO SKIP
                } else if (everything[i].equals("DO")) { // while do, jump f do while
                    jumpf.push(numbers);
                    printing[numbers] = numbers++ + ": JUMPF ";
                } else if (everything[i].equals("THEN")) { // if then, jump f do if
                    then.push(numbers);
                    printing[numbers] = numbers++ + ": JUMPF ";
                } else if (everything[i].equals("JUMPF")) { // jump f só serve para ajudar la do outro lado
                    jump.push(numbers);
                } else if (everything[i].equals("JUMP")) { // while fim, jump do while
                    printing[numbers] = numbers++ + ": JUMP " + jump.pop();
                    printing[jumpf.pop()] += numbers;
                } else if (everything[i].equals("IFEND")) { // if end
                    if (!everything[i + 1].equals("ELSESTART"))
                        printing[then.pop()] += numbers;
                    else {
                        printing[then.pop()] += numbers + 1;
                    }
                } else if (everything[i].equals("IFSTART")) { // if start só serve para ajudar la do outro lado
                } else if (everything[i].equals("BLOCKSTART")) { // if start só serve para ajudar la do outro lado
                    if (everything[i + 1].equals("LOCAL")) { // guarda o valor do numero de locals que vou ter
                        localvalueToSkip.push(Integer.parseInt(everything[i + 2].trim()));
                    }
                    if (!localvalueToSkip.isEmpty()) { // do numero de arg da função atual
                        totalLocal += localvalueToSkip.peek() + argOfActualFunc; // numero de variaveis locais da
                                                                                 // função é o numero
                    } else {
                        totalLocal += argOfActualFunc;
                    }

                } else if (everything[i].equals("BLOCKEND")) { // if start só serve para ajudar la do outro lado
                    if (everything[i + 1].contains("POP") && count > i + 2
                            && !everything[i + 2].equals("FUNCEND")) {
                        // se tiver um pop signifca que tinhamos variaveis locais
                        String[] part = everything[i + 1].split(" "); // remover elas
                        pop(totalLocal - 1, Integer.parseInt(part[1]));
                    }
                    for (int j = 0; j < funcs; j++) {
                        if (funcPool[j].getNome().equals(everything[i + 1])) {
                            funcJump.push(numbers);
                            printing[numbers] = numbers++ + ": CALL " + (((int) funcPool[j].getPos()));
                            if (!funcPool[j].getReturning()) {
                                printing[numbers] = numbers++ + ": POP " + (((int) funcPool[j].getArgs()));
                            }
                            i++;
                            break;
                        }
                    }
                    if (insideFunc) {
                        totalLocal2 = totalLocal;
                    }
                    if (!localvalueToSkip.isEmpty()) { // de arg da função atual
                        totalLocal -= localvalueToSkip.peek() + argOfActualFunc; // localValue desta func , starts
                                                                                 // func é o numero
                        localvalueToSkip.pop();
                    } else {
                        totalLocal -= argOfActualFunc;
                    }
                } else if (everything[i].equals("ELSESTART")) { // ELSE START
                    then.push(numbers);
                    printing[numbers] = numbers++ + ": JUMP ";
                } else if (everything[i].equals("ELSEEND")) { // ELSE END
                    printing[then.pop()] += numbers;
                } else if (everything[i].equals("FUNCSTART")) { // INICIO DA FUNC
                    lb = 2;
                    insideFunc = true;
                    for (int j = 0; j < funcs; j++) {
                        if (funcPool[j].getNome().equals(everything[i + 1])) {
                            funcPool[j].setPos(numbers); // NÃO BATER NO JUMP E SIM DENTRO DA FUNC
                            funcJump.push(numbers);
                            argsFunc += funcPool[j].getArgs();
                            if (j == 0) {
                                oneJump = numbers;
                                printing[numbers] = numbers++ + ": JUMP ";
                                funcPool[j].setPos(numbers); // para ganhar mais um
                            }
                            argOfActualFunc = funcPool[countFuncs].getArgs();
                            i++;
                            break;
                        }
                    }
                } else if (everything[i].equals("FUNCEND")) { // FIM DA FUNC
                    // printing[funcJump.pop()] += numbers;
                    if (!funcPool[countFuncs].getReturning()) {
                        printing[numbers] = numbers++ + ": NIL";
                        printing[numbers] = numbers++ + ": RETURN " + funcPool[countFuncs].getArgs();
                    }
                    countFuncs++;
                    if (countFuncs == funcs) { // para no fim determinar onde acabaram as funções
                        printing[oneJump] += numbers;
                    }

                    if (totalLocal2 > 0) { // se tiver locais dessa funcao para remover
                        pop(totalLocal2 - 1, totalLocal2);
                    }
                    insideFunc = false;

                } else if (everything[i].equals("PARAMS")) {
                    i++;
                } else if (everything[i].equals("RETURN")) { // while fim, jump do while
                    printing[numbers] = numbers + ": RETURN ";
                    for (int j = i; j > -1; j--) {
                        if (everything[j].equals("FUNCSTART")) {
                            for (int l = 0; l < funcs; l++) {
                                if (funcPool[l].getNome().equals(everything[j + 1])) {
                                    printing[numbers++] += (((int) funcPool[l].getArgs()));
                                    break;
                                }
                            }
                            break;
                        }
                    }
                } else if (everything[i].equals("STORE")) { // STORE
                    for (int j = 0; j < totalLocal; j++) {
                        if (j < constPoolL.length && constPoolL[j] != null
                                && constPoolL[j].getNome().equals(everything[i + 1])) {
                            // variveis locais para dar store
                            if (j < argOfActualFunc && insideFunc) { // dentro da func e ser um args dela
                                printing[numbers] = numbers++ + ": STOREL "
                                        + ((int) j - argOfActualFunc);
                                i++;
                                break;
                            } else {
                                printing[numbers] = numbers++ + ": STOREL " + ((int) j + lb - argOfActualFunc);
                                i++;
                                break;
                            }
                        }
                    }
                    for (int j = 0; j < poolCounter; j++) { // globais
                        if (constPool[j].getNome().equals(everything[i + 1])) {
                            printing[numbers] = numbers++ + ": STOREG " + j;
                            i++;
                            break;
                        }
                    }
                } else if (everything[i].equals("ID")) { // LOAD
                    for (int j = 0; j < totalLocal; j++) {
                        if (j < constPoolL.length && constPoolL[j] != null
                                && constPoolL[j].getNome().equals(everything[i + 1])) {
                            if (j < argOfActualFunc && insideFunc) { // dentro da func e ser um args dela
                                printing[numbers] = numbers++ + ": LOADL "
                                        + ((int) j - argOfActualFunc);
                                i++;
                                break;
                            } else {
                                printing[numbers] = numbers++ + ": LOADL " + ((int) j + lb - argOfActualFunc);
                                i++;
                                break;
                            }
                        }
                    }
                    for (int j = 0; j < poolCounter; j++) { // dentro da global
                        if (constPool[j].getNome().equals(everything[i + 1])) {
                            printing[numbers] = numbers++ + ": LOADG " + j;
                            i++;
                            break;
                        }
                    }
                } else if (everything[i].equals("CONCAT")) {
                    printing[numbers] = numbers++ + ": " + everything[i];
                    i++;
                } else {
                    printing[numbers] = numbers++ + ": " + everything[i];
                }
            }

            dataOutputStream.writeInt(constant);
            int jkl = 0;

            while (consting[jkl] != null) {
                String temp = consting[jkl++];
                String[] parts = temp.split("<|>");
                parts = parts[1].split(":");
                if (parts[0].equals("STRING")) {
                    dataOutputStream.writeByte(usefulMap.get(parts[0]));
                    dataOutputStream.writeUTF(parts[1].replaceAll("\"", ""));
                } else {
                    dataOutputStream.writeByte(usefulMap.get(parts[0]));
                    dataOutputStream.writeDouble(Double.parseDouble(parts[1]));
                }
            }

            dataOutputStream.writeInt(numbers);

            jkl = 0;
            while (printing[jkl] != null) {
                String temp = printing[jkl++];
                String[] parts = temp.split(" ");
                if (parts.length == 2) {
                    dataOutputStream.writeByte(usefulMap.get(parts[1]));
                } else {
                    dataOutputStream.writeByte(usefulMap.get(parts[1]));
                    dataOutputStream.writeInt(Integer.parseInt(parts[2]));
                }
            }

            if (debug) {
                String directoryPathOutput = "../outputs/" + fileName.substring(0, fileName.indexOf("."))
                        + "-marCompiler-debug.txt";

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(directoryPathOutput))) {

                    writer.write("...parsing done" + "\n" +
                            "...identification and type checking done" + "\n" + "...code generation");
                    System.out.println("...parsing done" + "\n" +
                            "...identification and type checking done" + "\n" + "...code generation");
                    writer.newLine();
                    writer.write("Constant pool:");
                    writer.newLine();
                    System.out.println("Constant pool:");

                    jkl = 0;
                    while (consting[jkl] != null) {
                        System.out.println(consting[jkl]);
                        writer.write(consting[jkl++]);
                        writer.newLine();
                    }

                    writer.write("Generated assembly code:");
                    writer.newLine();
                    System.out.println("Generated assembly code:");

                    jkl = 0;
                    while (printing[jkl] != null) {
                        System.out.println(printing[jkl]);
                        writer.write(printing[jkl++]);
                        writer.newLine();
                    }
                    writer.write("Saving the constant pool and the bytecodes to " + url);
                    writer.newLine();
                    System.out.println("Saving the constant pool and the bytecodes to " + url);

                } catch (IOException e) {
                    System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
                }
            }

        }

    }

    public static void main(String[] args) throws Exception {
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
            inputFileSave = fileNameWithExtension;
            fileName = fileNameWithExtension + "bc";
        }
        if (args.length > 1) {
            if (args[1].equals("-debug")) {
                debug = true;
            }
        }
        InputStream is = System.in;
        try {
            if (inputFile != null) {
                is = new FileInputStream(inputFile);
            }
            CharStream input = CharStreams.fromStream(is);
            marLexer lexer = new marLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            marParser parser = new marParser(tokens);
            ParseTree tree = parser.prog();
            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(numbers2file, tree);

            translate evaluation = new translate();
            walker.walk(evaluation, tree);

            if (parser.getNumberOfSyntaxErrors() > 0) {
                evaluation.error();
                System.err.println("Oops! Looks like there are some errors in your code!"
                        + "\nWe are not compiling and bytecodes are not being saved!");
                System.exit(0);
            } else {
                evaluation.complete();
            }

            // System.out.println(eval.stack.pop());
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
}
