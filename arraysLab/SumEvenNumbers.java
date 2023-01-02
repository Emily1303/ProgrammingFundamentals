package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
//        for (int item:numbersArr) {
//            if (item % 2 == 0) {
//                sum = sum + item;
//            }
//        }

        for (int i = 0; i < numbersArr.length; i++) {
            int currentNumber = numbersArr[i];
            if (currentNumber % 2 == 0) {
                sum = sum + currentNumber;
            }
        }

        System.out.println(sum);
    }
}
