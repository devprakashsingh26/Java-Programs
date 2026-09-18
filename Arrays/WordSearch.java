/* take a paragraph as input, store each word in the blocks of an array, now take a key to display and count the appearances of that key */

import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        String[] words = paragraph.split(" ");

        System.out.print("Enter the word to search: ");
        String key = sc.nextLine();

        int count = 0;

        System.out.println("The word '" + key + "' appears at:");

        for (int i = 0; i < words.length; i++) {

            if (words[i].equalsIgnoreCase(key)) {
                System.out.println("Position: " + (i + 1));
                count++;
            }
        }

        System.out.println("Total appearances of '" + key + "': " + count);

        sc.close();
    }
}
