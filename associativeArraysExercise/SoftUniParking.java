package associativeArraysExercise;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Map<String, String> people = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String command = scanner.nextLine();
            List<String> commandLine = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());

            String firstWord = commandLine.get(0);
            switch (firstWord) {
                case "register":
                    String userName1 = commandLine.get(1);
                    String plateNumber = commandLine.get(2);

                    if (!people.containsKey(userName1)) {
                        System.out.printf("%s registered %s successfully%n", userName1, plateNumber);
                        people.put(userName1, plateNumber);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", people.get(userName1));
                    }

                    break;
                case "unregister":
                    String userName2 = commandLine.get(1);

                    if (!people.containsKey(userName2)) {
                        System.out.printf("ERROR: user %s not found%n", userName2);
                    } else {
                        System.out.printf("%s unregistered successfully%n", userName2);
                        people.remove(userName2);
                    }

                    break;
            }
        }

        people.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
