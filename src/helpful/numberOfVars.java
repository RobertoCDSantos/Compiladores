package helpful;
import mar.*;

public class numberOfVars extends marBaseListener {
        int consts = 0;
        int instructions = 0;
        int globals = 0;
        int locals = 0;
        int func = 0;

        public void exitVar(marParser.VarContext ctx) {
            if (consts + (instructions - consts*2) == globals)
                globals++;
            else{
                locals++;
            }
            consts++;
            instructions++;
            instructions++;
        }
        public void exitParamList(marParser.ParamListContext ctx){
            if (ctx.TYPES().size() > 0) {
                locals += ctx.TYPES().size();
            }
            instructions++;
            instructions++;
        }
        public void exitArgList(marParser.ArgListContext ctx) {
            instructions++;
            instructions++;
        }
        public void enterBlockStmt(marParser.BlockStmtContext ctx){
            instructions++;
        }
        public void exitBlockStmt(marParser.BlockStmtContext ctx){
            instructions++;
            instructions++;
        }
        public void exitStore(marParser.StoreContext ctx) {
            instructions++;
            instructions++;
            consts++;
        }
         public void exitMulDiv(marParser.MulDivContext ctx) {
            instructions++;
        }
        public void exitAddSub(marParser.AddSubContext ctx) {
            instructions++;
        }
        public void exitReturnStmt(marParser.ReturnStmtContext ctx){
            instructions++;
        }

        public void exitUseless(marParser.UselessContext ctx){
            instructions++;
        }

        public void exitFuncCall(marParser.FuncCallContext ctx){
            instructions++;instructions++;
        }
        public void exitSoloCall(marParser.SoloCallContext ctx){
            instructions++;instructions++;
        }
        public void exitFunc(marParser.FuncContext ctx){
            instructions++;
        }
        public void enterFunc(marParser.FuncContext ctx){
            func++;
            instructions++;
            instructions++;
        }
        public void enterReturnStmt(marParser.ReturnStmtContext ctx){
            instructions++;
        }
        public void exitAND(marParser.ANDContext ctx) {
            instructions++;
        }
        public void exitOR(marParser.ORContext ctx) {
            instructions++;
        }
        public void exitPrint(marParser.PrintContext ctx) {
            instructions++;
        }
        public void exitEqDif(marParser.EqDifContext ctx) {
            instructions++;
        }
        public void exitNeg(marParser.NegContext ctx) {
            instructions++;
        }
        public void exitMinMai(marParser.MinMaiContext ctx) {
            instructions++;
        }
        public void exitNIL(marParser.NILContext ctx) {
            instructions++;
            instructions++;
            consts++;
        }
        public void exitString(marParser.StringContext ctx) {
            instructions++;
            instructions++;
            consts++;
        }
        public void exitBoolean(marParser.BooleanContext ctx) {
            instructions++;
            instructions++;
            consts++;
        }
        public void exitWhileStmt(marParser.WhileStmtContext ctx){
            instructions++;
        }
        public void enterWhileStmt(marParser.WhileStmtContext ctx){
            instructions++;
        }
        public void enterDo(marParser.DoContext ctx) {
            instructions++;
        }
        public void enterIfThen(marParser.IfThenContext ctx) {
            instructions++;
        }
        public void exitIfThen(marParser.IfThenContext ctx) {
            instructions++;
        }
        public void enterThen(marParser.ThenContext ctx) {
            instructions++;
        }
        public void exitNumber(marParser.NumberContext ctx) {
            consts++;
            instructions++;
            instructions++;
        }
        public void exitID(marParser.IDContext ctx) {
            instructions++;
            instructions++;
        }

        public void exitProg(marParser.ProgContext ctx) {
            instructions++;
        }
        public void enterIfBlock(marParser.IfBlockContext ctx) {
            instructions++;
        }
        public void exitIfBlock(marParser.IfBlockContext ctx) {
            instructions++;
        }
        public void enterElseBlock(marParser.ElseBlockContext ctx) {
            instructions++;
        }
        public void exitElseBlock(marParser.ElseBlockContext ctx) {
            instructions++;
        }
        public void enterElseThen(marParser.ElseThenContext ctx) {
            instructions++;
        }
        public void exitElseThen(marParser.ElseThenContext ctx) {
            instructions++;
        }
        public int getNumberConsts(){
            return consts*2;
        }
        public int getGlobals(){
            return globals;
        }
        public int getLocals(){
            return locals;
        }
        public int getFuncs(){
            return func;
        }
        public int getNumberInsts(){
            return instructions + consts * 2;
        }
}
