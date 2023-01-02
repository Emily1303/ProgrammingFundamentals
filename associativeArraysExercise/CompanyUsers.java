package associativeArraysExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> companiesMap = new LinkedHashMap<>();

        while (!command.equals("End")) {
            String[] commandLine = command.split(" -> ");
            String company = commandLine[0];
            String id = commandLine[1];

            if (!companiesMap.containsKey(company)) {
                companiesMap.put(company, new ArrayList<>());
                companiesMap.get(company).add(id);
            } else {
                if (!companiesMap.get(company).contains(id)) {
                    companiesMap.get(company).add(id);
                }
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companiesMap.entrySet()) {
            System.out.println(entry.getKey());
            for (String item : entry.getValue()) {
                System.out.printf("-- %s%n", item);
            }
        }

    }
}
