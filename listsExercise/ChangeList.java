package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            List<String> commandLine = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());

            String firstElement = commandLine.get(0);
            switch (firstElement) {
                case "Delete":
                    int secondElement = Integer.parseInt(commandLine.get(1));
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == secondElement) {
                            numbers.remove(i);
                        }
                    }
                    break;
                case "Insert":
                    int secondNumber = Integer.parseInt(commandLine.get(1));
                    int thirdElement = Integer.parseInt(commandLine.get(2));
                    numbers.add(thirdElement, secondNumber);
                    break;
            }
            command = scanner.nextLine();
        }
        printListOfNumbers(numbers, " ");
    }

    public static void printListOfNumbers (List<Integer> list, String delimiter) {
        for (int item : list) {
            System.out.print(item + delimiter);
        }
    }
}
