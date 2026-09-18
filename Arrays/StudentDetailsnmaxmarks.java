/* take two arrays, one for names and one for marks and print the name of the student which acquired the most marks */
import java.util.Scanner;

public class StudentDetailsnmaxmarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int m = sc.nextInt();

        sc.nextLine();

        String[] names = new String[n];
        int[] ages = new int[n];
        String[] genders = new String[n];

        String[] subjects = new String[m];

        int[] maxMarks = new int[m];

        int[][] marks = new int[n][m];

        System.out.println("\nEnter subject names:");

        for (int j = 0; j < m; j++) {
            System.out.print("Subject " + (j + 1) + ": ");
            subjects[j] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Name: ");
            names[i] = sc.nextLine();

            System.out.print("Age: ");
            ages[i] = sc.nextInt();

            sc.nextLine();

            System.out.print("Gender: ");
            genders[i] = sc.nextLine();

            for (int j = 0; j < m; j++) {
                System.out.print("Marks in " + subjects[j] + ": ");
                marks[i][j] = sc.nextInt();
            }

            sc.nextLine();
        }

        for (int j = 0; j < m; j++) {

            maxMarks[j] = marks[0][j];

            for (int i = 1; i < n; i++) {

                if (marks[i][j] > maxMarks[j]) {
                    maxMarks[j] = marks[i][j];
                }
            }
        }

        System.out.println("\n===== Highest Marks =====");

        for (int j = 0; j < m; j++) {

            for (int i = 0; i < n; i++) {

                if (marks[i][j] == maxMarks[j]) {
                    System.out.println(
                            subjects[j] + " : "
                            + names[i] + " ("
                            + maxMarks[j] + " marks)"
                    );
                }
            }
        }

        sc.close();
    }
}
