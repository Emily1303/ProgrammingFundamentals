package methodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        double result = giveTheDivisionOfTheFactorialsOf2Numbers(number1, number2);
        System.out.printf("%.2f", result);
    }

    private static double giveTheDivisionOfTheFactorialsOf2Numbers(int num1, int num2) {
        long firstFactorial = 1;
        for (int i = 1; i <= num1; i++) {
            firstFactorial = firstFactorial * i;
        }

        long secondFactorial = 1;
        for (int i = 1; i <= num2; i++) {
            secondFactorial = secondFactorial * i;
        }

        return firstFactorial * 1.0 / secondFactorial;
    }
}
