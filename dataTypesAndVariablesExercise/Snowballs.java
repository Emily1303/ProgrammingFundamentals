package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double min = Double.MIN_VALUE;
        String result = "";
        for (int i = 1; i <= number; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > min) {
                min = snowballValue;
                result = String.format("%d : %d = %.0f (%d)", snowballSnow, snowballTime, snowballValue, snowballQuality);
            }
        }

        System.out.println(result);
    }
}
