import java.util.Scanner;

public class PlaceValueWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int place = 1;

        while (temp >= 10) {
            temp = temp / 10;
            place = place * 10;
        }

        System.out.println("Place value breakdown:");

        while (place > 0) {
            int digit = num / place;
            int value = digit * place;

            System.out.println(digit + " x " + place + " = " + value);

            num = num % place;
            place = place / 10;
        }

        sc.close();
    }
}