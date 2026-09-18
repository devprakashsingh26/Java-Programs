/* binary search but instead of using sorting, validate the array as sorted by asking the user that the key is greater and sorted */

import java.util.Scanner;

public class BinarysortedSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in sorted order:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Is the array sorted? (yes/no): ");
        String answer = sc.next();

        if (!answer.equalsIgnoreCase("yes")) {
            System.out.println("Binary search cannot be performed.");
            System.out.println("Please enter a sorted array.");
            return;
        }

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int position = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                position = mid;
                break;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (position != -1) {
            System.out.println("Key found at position: " + (position + 1));
        } else {
            System.out.println("Key not found.");
        }

        sc.close();
    }
}
