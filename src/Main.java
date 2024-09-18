public class Main {

    public static void main(String[] args) {
        LogicProgram logicProgram = new LogicProgram();
        int[][] student = logicProgram.fillSudent();
        logicProgram.printStudent(student);
        logicProgram.printMidValue(student);
        logicProgram.printUniqueValue(student);
    }
}