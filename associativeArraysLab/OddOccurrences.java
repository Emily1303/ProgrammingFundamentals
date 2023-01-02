package associativeArraysLab;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lineInput = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        Map<String, Integer> wordsMap = new LinkedHashMap<>();

        for (int i = 0; i < lineInput.size(); i++) {
            String currentKey = lineInput.get(i).toLowerCase();

            Integer value = wordsMap.get(currentKey);
            if (!wordsMap.containsKey(currentKey)) {
                wordsMap.put(currentKey, 1);
            } else {
                wordsMap.put(currentKey, value + 1);
            }
        }

        List<String> resultList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", resultList));
    }
}
