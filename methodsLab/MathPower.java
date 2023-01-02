package methodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double result = calculateMathPower(number, power);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    public static double calculateMathPower (double number, int power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        return result;
    }
}
