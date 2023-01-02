package listsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        DecimalFormat df = new DecimalFormat("0.#");
        for (int i = 0; i < numbers.size() - 1; i++) {
            double sum = 0;
            double firstNumber = numbers.get(i);
            double secondNumber = numbers.get(i + 1);
            if (firstNumber == secondNumber) {
                sum = numbers.get(i) + numbers.get(i + 1);
                numbers.remove(i + 1);
                numbers.set(i, sum);
                i = -1;
            }
        }

        for (double item : numbers) {
            System.out.print(df.format(item) + " ");
        }
    }
}
