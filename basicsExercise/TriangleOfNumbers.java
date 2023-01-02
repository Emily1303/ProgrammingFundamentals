package basicsExercise;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;
        boolean isBigger = false;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                if (number > n) {
                    isBigger = true;
                    break;
                }
                System.out.print(number + " ");
                if (i == j) {
                    number++;
                }
            }

            if (isBigger) {
                break;
            }
            System.out.println();
        }
    }
}
