package methodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int sum = sumOfFirstTwoIntegers(number1, number2);
        int subtract = subtractThirdIntegerFromSum(number3, sum);

        System.out.println(subtract);
    }

    private static int sumOfFirstTwoIntegers(int number1, int number2) {
        return number1 + number2;
    }

    private static int subtractThirdIntegerFromSum(int number3, int sum) {
        return sum - number3;
    }
}
