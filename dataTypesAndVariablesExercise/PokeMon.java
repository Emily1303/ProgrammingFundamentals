package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int targetsCount = 0;
        int currentPower = power;
        while (currentPower >= distance) {
            currentPower = currentPower - distance;
            targetsCount++;

            double percentage = power * 0.50;
            if (currentPower == percentage) {
                if (exhaustionFactor > 0) {
                    currentPower = currentPower / exhaustionFactor;
                }
            }
        }

        System.out.println(currentPower);
        System.out.println(targetsCount);
    }
}
