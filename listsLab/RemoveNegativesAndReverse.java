package listsLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            numbers.removeIf(e -> e < 0);
        }

        boolean isEmpty = numbers.isEmpty();
        if (isEmpty) {
            System.out.println("empty");
        } else {
            printReversedNumbers(numbers);
        }
    }

    public static void printReversedNumbers (List<Integer> list) {
        Collections.reverse(list);
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
