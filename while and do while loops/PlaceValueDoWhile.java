import java.util.Scanner;

public class PlaceValueDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int place = 1;

        do {
            int digit = temp % 10;
            int value = digit * place;

            System.out.println(digit + " x " + place + " = " + value);

            temp = temp / 10;
            place = place * 10;

        } while (temp > 0);

        sc.close();
    }
}