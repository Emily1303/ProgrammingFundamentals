package methodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (commandInput) {
            case "add":
                printAddNumbers(firstNum, secondNum);
                break;
            case "multiply":
                printMultiplyNumbers(firstNum, secondNum);
                break;
            case "subtract":
                printSubtractNumbers(firstNum, secondNum);
                break;
            case "divide":
                printDivideNumbers(firstNum, secondNum);
                break;
        }
    }

    public static void printAddNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }

    public static void printMultiplyNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        System.out.println(result);
    }

    public static void printSubtractNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        System.out.println(result);
    }

    public static void printDivideNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        System.out.println(result);
    }
}
