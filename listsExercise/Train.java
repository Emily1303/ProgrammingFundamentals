package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxPeople = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            List<String> commandLine = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());

            String word = commandLine.get(0);
            if (word.equals("Add")) {
                int numberOfPeople = Integer.parseInt(commandLine.get(1));
                wagons.add(numberOfPeople);
            } else {
                int people = Integer.parseInt(word);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + people <= maxPeople) {
                        wagons.set(i, wagons.get(i) + people);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        printNumberOfPeopleInTheWagons(wagons, " ");
    }

    public static void printNumberOfPeopleInTheWagons (List<Integer> list, String delimiter) {
        for (int item : list) {
            System.out.print(item + delimiter);
        }
    }
}
