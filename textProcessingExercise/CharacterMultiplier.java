package textProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputLine = input.split("\\s+");
        String firstWord = inputLine[0];
        String secondWord = inputLine[1];

        int resultSum = givesTheSumOfTheMultipliedCharacters(firstWord, secondWord);
        System.out.println(resultSum);

    }

    private static int givesTheSumOfTheMultipliedCharacters(String firstWord, String secondWord) {
        int totalSum = 0;
        if (firstWord.length() > secondWord.length()) {
            for (int i = 0; i < secondWord.length(); i++) {
                int symbol1 = firstWord.charAt(i);
                int symbol2 = secondWord.charAt(i);
                int multipliedSymbols = symbol1 * symbol2;
                totalSum = totalSum + multipliedSymbols;
            }

            for (int i = secondWord.length(); i < firstWord.length(); i++) {
                int currentSymbol = firstWord.charAt(i);
                totalSum = totalSum + currentSymbol;
            }

        } else if (secondWord.length() > firstWord.length()) {
            for (int i = 0; i < firstWord.length(); i++) {
                int symbol3 = firstWord.charAt(i);
                int symbol4 = secondWord.charAt(i);
                int multipliedSymbols = symbol3 * symbol4;
                totalSum = totalSum + multipliedSymbols;
            }

            for (int i = firstWord.length(); i < secondWord.length(); i++) {
                int currentSymbol = secondWord.charAt(i);
                totalSum = totalSum + currentSymbol;
            }

        } else {
            for (int i = 0; i < firstWord.length(); i++) {
                int symbol5 = firstWord.charAt(i);
                int symbol6 = secondWord.charAt(i);
                int multipliedSymbols = symbol5 * symbol6;
                totalSum = totalSum + multipliedSymbols;
            }
        }

        return totalSum;
    }
}
