package associativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Integer> resourceMap = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            String resource = command;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resourceMap.containsKey(resource)) {
                resourceMap.put(resource, quantity);
            } else {
                int currentQuantity = resourceMap.get(resource);
                resourceMap.put(resource, currentQuantity + quantity);
            }

            command = scanner.nextLine();
        }

        resourceMap.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }
}
