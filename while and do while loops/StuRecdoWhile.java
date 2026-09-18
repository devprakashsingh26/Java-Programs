
import java.util.Scanner;

public class StuRecdoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String choice;

        do {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter marks in Subject 1: ");
            int mark1 = sc.nextInt();

            System.out.print("Enter marks in Subject 2: ");
            int mark2 = sc.nextInt();

            System.out.print("Enter marks in Subject 3: ");
            int mark3 = sc.nextInt();

            double average = (mark1 + mark2 + mark3) / 3.0;

            System.out.println("\n--- Student Details ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Average Marks: " + average);

            sc.nextLine();

            System.out.print("\nDo you want to enter another student? (yes/no): ");
            choice = sc.nextLine();

            System.out.println();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Student Management System Closed.");
        sc.close();
    }
}