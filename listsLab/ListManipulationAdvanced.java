package listsLab;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            List<String> commandLine = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());

            String firstCommand = commandLine.get(0);
            switch (firstCommand) {
                case "Contains":
                    int number = Integer.parseInt(commandLine.get(1));
                    boolean isContained = numbers.contains(number);
                    if (isContained) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String secondWord = commandLine.get(1);
                    if (secondWord.equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (secondWord.equals("odd")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    String secondElement = commandLine.get(1);
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum = sum + numbers.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = commandLine.get(1);
                    int thirdNumber = Integer.parseInt(commandLine.get(2));
                    switch (condition) {
                        case "<":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) < thirdNumber) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) > thirdNumber) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) <= thirdNumber) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) >= thirdNumber) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;

            }

            command = scanner.nextLine();
        }
    }
}
