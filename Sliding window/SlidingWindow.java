
import java.util.Scanner;

public class SlidingWindow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size: ");
        int k = sc.nextInt();

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum = windowSum + arr[i];
        }

        int maxSum = windowSum;
            
          for (int i = k; i < n; i++) {

            
            windowSum = windowSum - arr[i - k] + arr[i];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        System.out.println("Maximum sum of " + k + " consecutive elements is: " + maxSum);
        sc.close(); 

    }
}   

