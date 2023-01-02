package methodsExercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        if (symbol1 < symbol2) {
            printTheCharactersBetweenTheTwoSymbols(symbol1, symbol2);
        } else {
            printTheCharactersBetweenTheTwoSymbols(symbol2, symbol1);
        }
    }

    private static void printTheCharactersBetweenTheTwoSymbols (char firstSymbol, char secondSymbol) {
        for (int i = firstSymbol + 1; i < secondSymbol; i++) {
            char currentSymbol = (char) i;
            System.out.print(currentSymbol + " ");
        }
    }
}
