package listsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("end")) {
            List<String> commandLine = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());

            String word = commandLine.get(0);
            switch(word) {
                case "Add":
                    int number = Integer.parseInt(commandLine.get(1));
                    numbers.add(number);
                    break;
                case "Remove":
                    int number1 = Integer.parseInt(commandLine.get(1));
                    numbers.remove(Integer.valueOf(number1));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(commandLine.get(1));
                    numbers.remove(index);
                    break;
                case "Insert":
                    int number2 = Integer.parseInt(commandLine.get(1));
                    int index1 = Integer.parseInt(commandLine.get(2));
                    numbers.add(index1, number2);
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
