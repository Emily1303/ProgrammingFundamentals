package associativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> countSymbols = new LinkedHashMap<>();

        for (char symbol : input.toCharArray()) {
            if (symbol != ' ') {
                if (!countSymbols.containsKey(symbol)) {
                    countSymbols.put(symbol, 1);
                } else {
                    int values = countSymbols.get(symbol);
                    countSymbols.put(symbol, values + 1);
                }

            }
        }

        countSymbols.entrySet().forEach(entry -> System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue()));
    }
}
