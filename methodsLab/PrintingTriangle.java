package methodsLab;

import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        printTriangle(numberInput);
        printDecreasedRows(numberInput);
    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            columnsTriangle(1, i);
            System.out.println();
        }

    }

    public static void columnsTriangle(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }

    public static void printDecreasedRows(int n) {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
