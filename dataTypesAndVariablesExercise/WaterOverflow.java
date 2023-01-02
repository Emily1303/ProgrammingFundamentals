package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            sum = sum + liters;
            if (sum > 255) {
                sum = sum - liters;
                System.out.println("Insufficient capacity!");
                continue;
            }
        }

        System.out.println(sum);
    }
}
