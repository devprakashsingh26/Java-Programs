
import java.util.Scanner;

class Person {

    String name;
    int age;
    String gender;

    void getPersonDetails(Scanner sc) {

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter gender: ");
        gender = sc.nextLine();
    }

    void displayPersonDetails() {

        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
    }
}

class Student extends Person {

    String subject;
    int marks;

    void getStudentDetails(Scanner sc) {

        System.out.print("Enter subject: ");
        subject = sc.nextLine();

        System.out.print("Enter marks: ");
        marks = sc.nextInt();
    }

    void displayStudentDetails() {

        displayPersonDetails();

        System.out.println("Subject: " + subject);
        System.out.println("Marks  : " + marks);
    }
}

class Teacher extends Person {

    String subject;
    int experience;

    void getTeacherDetails(Scanner sc) {

        System.out.print("Enter subject taught: ");
        subject = sc.nextLine();

        System.out.print("Enter experience in years: ");
        experience = sc.nextInt();
    }

    void displayTeacherDetails() {

        displayPersonDetails();

        System.out.println("Subject    : " + subject);
        System.out.println("Experience : " + experience + " years");
    }
}

public class hierarchicalinheritance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Enter Student Details =====");

        Student s1 = new Student();

        s1.getPersonDetails(sc);
        s1.getStudentDetails(sc);

        System.out.println("\n===== Student Details =====");
        s1.displayStudentDetails();

        sc.nextLine();

        System.out.println("\n===== Enter Teacher Details =====");

        Teacher t1 = new Teacher();

        t1.getPersonDetails(sc);
        t1.getTeacherDetails(sc);

        System.out.println("\n===== Teacher Details =====");
        t1.displayTeacherDetails();

        sc.close();
    }
}
