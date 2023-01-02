package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            List<String> commandLine = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());

            String firstWord = commandLine.get(0);

            switch (firstWord) {
                case "Add":
                    int number1 = Integer.parseInt(commandLine.get(1));
                    numbers.add(number1);
                    break;
                case "Insert":
                    int number2 = Integer.parseInt(commandLine.get(1));
                    int index1 = Integer.parseInt(commandLine.get(2));
                    if (index1 >= 0 && index1 < numbers.size()) {
                        numbers.add(index1, number2);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int index2 = Integer.parseInt(commandLine.get(1));
                    if (index2 >= 0 && index2 < numbers.size()) {
                        numbers.remove(index2);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String secondWord = commandLine.get(1);
                    int count = Integer.parseInt(commandLine.get(2));
                    switch (secondWord) {
                        case "left":
                            for (int i = 1; i <= count; i++) {
                                int firstNumberOfList = numbers.get(0);
                                numbers.remove(0);
                                numbers.add(firstNumberOfList);
                            }
                            break;
                        case "right":
                            for (int i = 1; i <= count; i++) {
                                int lastNumberOfList = numbers.get(numbers.size() - 1);
                                numbers.remove(numbers.size() - 1);
                                numbers.add(0, lastNumberOfList);
                            }
                            break;
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        printNumbersOfList(numbers, " ");
    }

    public static void printNumbersOfList (List<Integer> list, String delimiter) {
        for (int item : list) {
            System.out.print(item + delimiter);
        }
    }
}
