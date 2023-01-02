package listsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        int sizeOfList = numbers.size();
        int count = 0;

        if (sizeOfList > 1) {
            count++;
            for (int j = 0; j < numbers.size(); j++) {
                double firstNumber = numbers.get(j);
                double secondNumber = numbers.get(numbers.size() - 1);
                double sum = firstNumber + secondNumber;
                numbers.set(j, sum);
                numbers.remove(numbers.size() - 1);

                if (count >= sizeOfList / 2) {
                    printListOfNumbers(numbers, " ");
                    break;
                } else {
                    count++;
                }
            }
        } else {
            printListOfNumbers(numbers, " ");
        }
    }

    public static void printListOfNumbers(List<Double> list, String delimiter) {
        DecimalFormat df = new DecimalFormat("0.#");
        for (double item : list) {
            System.out.print(df.format(item) + delimiter);
        }
    }
}
