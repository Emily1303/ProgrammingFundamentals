package dataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);

        boolean isLower = Character.isLowerCase(symbol);
        boolean isUpper = Character.isUpperCase(symbol);
        if (isLower) {
            System.out.println("lower-case");
        } else if (isUpper) {
            System.out.printf("upper-case");
        }
    }
}
