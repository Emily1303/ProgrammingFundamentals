package textProcessingExercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();
        for (char symbol : input.toCharArray()) {
            int currentSymbol = (int) symbol;
            char newSymbol = (char) (currentSymbol + 3);
            encryptedText.append(newSymbol);
        }

        System.out.println(encryptedText);
    }
}
