package listsLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        List<Double> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        List<Double> resultList = new ArrayList<>();

        if (firstList.size() > secondList.size()) {
            for (int i = 0; i < secondList.size(); i++) {
                double firstNumber = firstList.get(i);
                double secondNumber = secondList.get(i);
                resultList.add(firstNumber);
                resultList.add(secondNumber);
            }
            resultList.addAll(firstList.subList(secondList.size(), firstList.size()));
        } else if (secondList.size() > firstList.size()) {
            for (int i = 0; i < firstList.size(); i++) {
                double firstNum = firstList.get(i);
                double secondNum = secondList.get(i);
                resultList.add(firstNum);
                resultList.add(secondNum);
            }
            resultList.addAll(secondList.subList(firstList.size(), secondList.size()));
        } else {
            for (int i = 0; i <= firstList.size() - 1; i++) {
                double firstElement = firstList.get(i);
                double secondElement = secondList.get(i);
                resultList.add(firstElement);
                resultList.add(secondElement);
            }
        }

        printListOfNumbers(resultList, " ");
    }

    public static void printListOfNumbers(List<Double> resultList, String delimiter) {
        DecimalFormat df = new DecimalFormat("0.#");
        for (double item : resultList) {
            System.out.print(df.format(item) + delimiter);
        }
    }
}
