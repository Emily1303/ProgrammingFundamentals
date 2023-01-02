package methodsExercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String result = giveTheMiddleCharacters(word);

        System.out.println(result);

    }

    private static String giveTheMiddleCharacters(String input) {
        String result = "";
        if (input.length() % 2 != 0) {
            int currentSymbol = input.length() / 2;
            char symbol = input.charAt(currentSymbol);
            result = "" + symbol;
        } else {
            int currentNumber1 = input.length() / 2 - 1;
            int currentNumber2 = input.length() / 2;
            char symbol1 = input.charAt(currentNumber1);
            char symbol2 = input.charAt(currentNumber2);
            result = "" + symbol1 + symbol2;
        }

        return result;
    }
}
