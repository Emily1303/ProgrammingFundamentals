package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int source = Integer.parseInt(scanner.nextLine());

        int sumOfSpices = 0;
        int days = 0;
        while (source >= 100) {
            int spicesForADay = source - 26;
            sumOfSpices = sumOfSpices + spicesForADay;
            source = source - 10;
            days++;
        }

        if (sumOfSpices >= 26) {
            sumOfSpices = sumOfSpices - 26;
        }

        System.out.println(days);
        System.out.println(sumOfSpices);
    }
}
