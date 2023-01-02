package com.company;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        for (int i = number2; i <= 10 ; i++) {
            int result = number * i;
            System.out.printf("%d X %d = %d%n", number, i, result);
        }

        if (number2 > 10) {
            System.out.printf("%d X %d = %d", number, number2, number * number2);
        }
    }
}
