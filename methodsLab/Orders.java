package methodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String orderInput = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (orderInput) {
            case "coffee":
                printCoffeePrice(quantity);
                break;
            case "water":
                printWaterPrice(quantity);
                break;
            case "coke":
                printCokePrice(quantity);
                break;
            case "snacks":
                printSnacksPrice(quantity);
                break;
        }
    }

    public static void printCoffeePrice (int quantity) {
        double result = 1.50 * quantity;
        System.out.printf("%.2f", result);
    }

    public static void printWaterPrice (int quantity) {
        double result = 1.0 * quantity;
        System.out.printf("%.2f", result);
    }

    public static void printCokePrice (int quantity) {
        double result = 1.40 * quantity;
        System.out.printf("%.2f", result);
    }

    public static void printSnacksPrice (int quantity) {
        double result = 2.0 * quantity;
        System.out.printf("%.2f", result);
    }
}
