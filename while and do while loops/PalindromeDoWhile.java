import java.util.Scanner;

public class PalindromeDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        do {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;

        } while (num > 0);

        if (original == reverse) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        sc.close();
    }
}
