
import java.util.Scanner;

public class WordLengthSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '
                    && (i == 0 || str.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        String[] words = new String[count];

        int index = 0;
        String word = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                if (!word.equals("")) {
                    words[index] = word;
                    index++;
                    word = "";
                }
            }
        }

        if (!word.equals("")) {
            words[index] = word;
        }

        for (int i = 0; i < words.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < words.length; j++) {

                if (words[j].length() < words[min].length()) {
                    min = j;
                } else if (words[j].length() == words[min].length()
                        && words[j].compareTo(words[min]) < 0) {
                    min = j;
                }
            }

            String temp = words[i];
            words[i] = words[min];
            words[min] = temp;
        }

        System.out.println("Words sorted by length:");

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }

        sc.close();
    }
}
