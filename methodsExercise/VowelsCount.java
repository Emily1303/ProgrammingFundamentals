package methodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int countOfVowels = 0;

        countOfVowels = giveTheNumberOfVowelsInAWord(word, countOfVowels);
        System.out.println(countOfVowels);
    }

    public static int giveTheNumberOfVowelsInAWord(String input, int count) {
        String newInput = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char symbol = newInput.charAt(i);
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }

        return count;
    }
}
