import java.util.Arrays;
import java.util.Scanner;

public class Student {
    Scanner in = new Scanner(System.in);
    String name;
    int studentId;
    int[] grades = new int[7];

    Student(String assignedName, int id){
        name = assignedName;
        studentId = id;
        System.out.print("Enter Grades: ");
        for (int i = 0; i < grades.length; i++) {
            grades[i] = in.nextInt();
        }
    }
    @Override
    public String toString() {
        return "Name: " + name +
                "\nStudentId: " + studentId +
                "\nGrades: " + Arrays.toString(grades);
    }
}