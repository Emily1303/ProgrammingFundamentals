package associativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Integer> productsMap = new LinkedHashMap<>();
        Map<String, Double> resultMap = new LinkedHashMap<>();

        while (!command.equals("buy")) {
            String[] commandLine = command.split(" ");
            String product = commandLine[0];
            double price = Double.parseDouble(commandLine[1]);
            int quantity = Integer.parseInt(commandLine[2]);

            if (!productsMap.containsKey(product)) {
                productsMap.put(product, quantity);
            } else {
                int currentQuantity = productsMap.get(product);
                productsMap.put(product, currentQuantity + quantity);
            }

            double currentPrice = productsMap.get(product) * price;
            resultMap.put(product, currentPrice);

            command = scanner.nextLine();
        }

        resultMap.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}
