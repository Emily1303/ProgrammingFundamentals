package dataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);
        for (int i = 1; i <= number; i++) {
            BigDecimal currentNumber = new BigDecimal(scanner.nextLine());
            sum = sum.add(currentNumber);
        }

        System.out.println(sum);
    }
}
