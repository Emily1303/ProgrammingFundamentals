package listsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int iterations = Integer.parseInt(scanner.nextLine());

        List<String> names = new ArrayList<>();

        for (int i = 1; i <= iterations; i++) {
            String input = scanner.nextLine();
            List<String> inputLine = Arrays.stream(input.split(" "))
                    .collect(Collectors.toList());

            String nameOfPerson = inputLine.get(0);
            String element = inputLine.get(2);

            boolean isInTheList = names.contains(nameOfPerson);

            if (element.equals("going!")) {
                if (!isInTheList) {
                    names.add(nameOfPerson);
                } else {
                    System.out.printf("%s is already in the list!%n", nameOfPerson);
                }
            } else if (element.equals("not")) {
                if (isInTheList) {
                    names.remove(nameOfPerson);
                } else {
                    System.out.printf("%s is not in the list!%n", nameOfPerson);
                }
            }
        }

        printNamesOfTheGuests(names);
    }

    public static void printNamesOfTheGuests (List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}
