package basicsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coins = scanner.nextLine();

        double sum = 0;
        while (!coins.equals("Start")) {
            double coin = Double.parseDouble(coins);
            if (coin == 0.1) {
                sum = sum + 0.1;
            } else if (coin == 0.2) {
                sum = sum + 0.2;
            } else if (coin == 0.5) {
                sum = sum + 0.5;
            } else if (coin == 1) {
                sum = sum + 1;
            } else if (coin == 2) {
                sum = sum + 2;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }

            coins = scanner.nextLine();
        }

        String input = scanner.nextLine();

        double price = 0;
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    price = 2.0;
                    if (sum >= 2.0) {
                        sum = sum - 2.0;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if (sum >= 0.7) {
                        sum = sum - 0.7;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (sum >= 1.5) {
                        sum = sum - 1.5;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (sum >= 0.8) {
                        sum = sum - 0.8;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    price = 1.0;
                    if (sum >= 1.0) {
                        sum = sum - 1.0;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }

            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);
    }
}
