package methodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        switch (command) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                int result = getMax(firstNum, secondNum);
                System.out.println(result);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMax(firstString, secondString));
                break;
        }
    }

    public static int getMax(int firstNumber, int secondNumber) {
        int result = 0;
        if (firstNumber > secondNumber) {
            result = firstNumber;
        } else {
            result = secondNumber;
        }

        return result;
    }

    public static char getMax(char firstChar, char secondChar) {
        char result = 0;
        if (firstChar > secondChar) {
            result = firstChar;
        } else {
            result = secondChar;
        }

        return result;
    }

    public static String getMax(String firstString, String secondString) {
        String result = "";
        if (firstString.compareTo(secondString) > 0) {
            result = firstString;
        } else {
            result = secondString;
        }

        return result;
    }
}
