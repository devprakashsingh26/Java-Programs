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

    void getStudentDetails(Scanner sc) {

        System.out.print("Enter subject: ");
        subject = sc.nextLine();
    }

    void displayStudentDetails() {

        displayPersonDetails();

        System.out.println("Subject: " + subject);
    }
}


class Result extends Student {

    int marks;

    void getResultDetails(Scanner sc) {

        System.out.print("Enter marks: ");
        marks = sc.nextInt();
    }

    void displayResultDetails() {

        displayStudentDetails();

        System.out.println("Marks  : " + marks);
    }
}


public class multilevelinheritance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        Result r1 = new Result();

        System.out.println("Enter Student Details:");

        
        r1.getPersonDetails(sc);

       
        r1.getStudentDetails(sc);

        
        r1.getResultDetails(sc);

        
        System.out.println("\n===== Student Result =====");

        r1.displayResultDetails();

        sc.close();
    }
}
