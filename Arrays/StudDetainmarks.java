/* student record that displays name and marks */

import java.util.Scanner;

public class StudDetainmarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        sc.nextLine();

        String[] name = new String[n];
        int[] age = new int[n];
        String[] gender = new String[n];
        String[] subject = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter age: ");
            age[i] = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter gender: ");
            gender[i] = sc.nextLine();

            System.out.print("Enter subject: ");
            subject[i] = sc.nextLine();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();

            sc.nextLine();
        }

        System.out.println("\n===== Student Details =====");

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Name    : " + name[i]);
            System.out.println("Age     : " + age[i]);
            System.out.println("Gender  : " + gender[i]);
            System.out.println("Subject : " + subject[i]);
            System.out.println("Marks   : " + marks[i]);
        }

        sc.close();
    }
}
