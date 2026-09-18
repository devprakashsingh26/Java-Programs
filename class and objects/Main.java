
import java.util.Scanner;

class Student {

    String name;
    int age;
    String gender;
    int marks;

    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Marks  : " + marks);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter student name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter age: ");
        s1.age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter gender: ");
        s1.gender = sc.nextLine();

        System.out.print("Enter marks: ");
        s1.marks = sc.nextInt();

        s1.display();

        sc.close();
    }
}
