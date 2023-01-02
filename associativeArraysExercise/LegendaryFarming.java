package associativeArraysExercise;

import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Integer> legendaryItems = new LinkedHashMap<>();
        legendaryItems.put("shards", 0);
        legendaryItems.put("fragments", 0);
        legendaryItems.put("motes", 0);

        Map<String, Integer> junkItems = new LinkedHashMap<>();

        boolean isExist = false;
        while (true) {
            List<String> commandLine = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());

            for (int i = 0; i < commandLine.size(); i = i + 2) {
                int quantity = Integer.parseInt(commandLine.get(i));
                String item = commandLine.get(i + 1).toLowerCase();

                if (item.equals("shards") || item.equals("fragments") || item.equals("motes")) {
                    int currentQuantity = legendaryItems.get(item);
                    legendaryItems.put(item, currentQuantity + quantity);
                } else {
                    if (!junkItems.containsKey(item)) {
                        junkItems.put(item, quantity);
                    } else {
                        int currentJunk = junkItems.get(item);
                        junkItems.put(item, currentJunk + quantity);
                    }
                }

                if (legendaryItems.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    int newQuantity1 = legendaryItems.get("shards") - 250;
                    legendaryItems.put("shards", newQuantity1);
                    isExist = true;
                    break;
                } else if (legendaryItems.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    int newQuantity2 = legendaryItems.get("fragments") - 250;
                    legendaryItems.put("fragments", newQuantity2);
                    isExist = true;
                    break;
                } else if (legendaryItems.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    int newQuantity3 = legendaryItems.get("motes") - 250;
                    legendaryItems.put("motes", newQuantity3);
                    isExist = true;
                    break;
                }

            }

            if (isExist) {
                break;
            }

            command = scanner.nextLine();
        }

        legendaryItems.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
        junkItems.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }
}
