public class RunStudent {

    void runProgram(){
        Student student = new Student("Albert", 69);

        System.out.println(student);
    }
    public static void main(String[] args) {
        new RunStudent().runProgram();
    }
}