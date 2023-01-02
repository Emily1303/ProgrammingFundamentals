package textProcessingExercise;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal firstNumber = new BigDecimal(scanner.nextLine());
        BigDecimal secondNumber = new BigDecimal(scanner.nextLine());
        BigDecimal sum = firstNumber.multiply(secondNumber);

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(sum));
    }
}
