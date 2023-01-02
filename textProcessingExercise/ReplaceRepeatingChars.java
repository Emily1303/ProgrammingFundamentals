package textProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder newLine = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (i + 1 <= input.length() - 1) {
                if (input.charAt(i + 1) != currentSymbol) {
                    newLine.append(currentSymbol);
                }
            } else {
                newLine.append(input.charAt(input.length() - 1));
            }

        }

        System.out.println(newLine);
    }
}
