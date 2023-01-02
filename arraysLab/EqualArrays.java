package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstSum = 0;
        boolean areDifferent = false;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == secondArr[i]) {
                firstSum = firstSum + firstArr[i];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areDifferent = true;
                break;
            }
        }

        if (!areDifferent) {
            System.out.printf("Arrays are identical. Sum: %d", firstSum);
        }
    }
}
