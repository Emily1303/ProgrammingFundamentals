package associativeArraysExercise;

import java.util.*;
import java.util.stream.Collectors;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> studentsMap = new LinkedHashMap<>();

        while (!command.equals("end")) {
            List<String> commandLine = Arrays.stream(command.split(" : "))
                    .collect(Collectors.toList());

            String course = commandLine.get(0);
            String student = commandLine.get(1);

            if (!studentsMap.containsKey(course)) {
                studentsMap.put(course, new ArrayList<>());
                studentsMap.get(course).add(student);
            } else {
                studentsMap.get(course).add(student);
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : studentsMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            for (String item : entry.getValue()) {
                System.out.printf("-- %s%n", item);
            }
        }

    }
}
