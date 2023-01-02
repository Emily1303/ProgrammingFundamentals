package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double volume = 1;
        double min = Double.MIN_VALUE;
        String lastModel = "";
        for (int i = 1; i <= number; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > min) {
                min = volume;
                lastModel = model;
            }
        }
        System.out.println(lastModel);
    }
}
