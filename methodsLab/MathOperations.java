package methodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.##");

        switch (operator) {
            case "/":
                double resultInt = divideNumbers(firstNum, secondNum);
                System.out.println(df.format(resultInt));
                break;
            case "*":
                double result1 = multiplyNumbers(firstNum, secondNum);
                System.out.println(df.format(result1));
                break;
            case "+":
                double result2 = addNumbers(firstNum, secondNum);
                System.out.println(df.format(result2));
                break;
            case "-":
                double result3 = subtractNumbers(firstNum, secondNum);
                System.out.println(df.format(result3));
                break;
        }
    }

    public static double divideNumbers(int firstNumber, int secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }

    public static double multiplyNumbers(int firstNumber, int secondNumber) {
        double result = firstNumber * secondNumber;
        return result;
    }

    public static double addNumbers(int firstNumber, int secondNumber) {
        double result = firstNumber + secondNumber;
        return result;
    }

    public static double subtractNumbers(int firstNumber, int secondNumber) {
        double result = firstNumber - secondNumber;
        return result;
    }
}
