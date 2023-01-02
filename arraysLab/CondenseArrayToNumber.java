package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers =Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] newNum = new int[numbers.length - 1];
        boolean isLess = false;

        while (numbers.length > 1) {
            newNum = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length; i++) {
                if (i + 1 < numbers.length) {
                    newNum[i] = numbers[i] + numbers[i + 1];
                }
            }

            if (newNum.length > 1) {
                numbers = new int[newNum.length - 1];
                for (int i = 0; i < newNum.length; i++) {
                    if (i + 1 < newNum.length) {
                        numbers[i] = newNum[i] + newNum[i + 1];
                    }
                }
            } else {
                isLess = true;
                break;
            }
        }

        if (isLess) {
            System.out.println(newNum[0]);
        } else {
            System.out.println(numbers[0]);
        }
    }
}
