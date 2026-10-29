package sprint1;

import java.util.Scanner;

public class CodingChallenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text to format:");
        String text = scanner.nextLine();

        String[] words = text.split(" ");
        String result = "";

        for (String word : words) {
            if (word.length() > 2 && word.startsWith("_") && word.endsWith("_")) {
                // _word_ -> WORD
                word = word.substring(1, word.length() - 1).toUpperCase();
            } else if (word.length() > 2 && word.startsWith("#") && word.endsWith("#")) {
                // #word# -> word
                word = word.substring(1, word.length() - 1).toLowerCase();
            }
            result = result + word + " ";
        }

        System.out.println(result.trim());
    }
}
