package arraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[number];
        int[] secondArray = new int[number];

        for (int i = 1; i <= number; i++) {
            String[] row = scanner.nextLine().split(" ");
            int firstElement = Integer.parseInt(row[0]);
            int secondElement = Integer.parseInt(row[1]);
            if (i % 2 == 0) {
                secondArray[i - 1] = firstElement;
                firstArray[i - 1] = secondElement;
            } else {
                firstArray[i - 1] = firstElement;
                secondArray[i - 1] = secondElement;
            }
        }

        for (int item : firstArray) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (int item : secondArray) {
            System.out.print(item + " ");
        }
    }
}
