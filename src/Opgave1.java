import java.util.Scanner;

public class Opgave1 {
    String name;
    int age;
    Scanner in = new Scanner(System.in);

    Opgave1(String assignedName, int a){
        name = assignedName;
        age = a;
        hasBirthday();
    }

    @Override
    public String toString() {
        return "Opgave1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    void hasBirthday(){
        age = age + 1;
    }
}
