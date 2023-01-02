package associativeArraysLab;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> newMap = new TreeMap<>();
        for (double currentKey : numbers) {
//            Integer value = newMap.get(currentKey);
//            if (!newMap.containsKey(currentKey)) {
//                newMap.put(currentKey, 1);
//            } else {
//                newMap.put(currentKey, value + 1);
//            }


            if (!newMap.containsKey(currentKey)) {
                newMap.putIfAbsent(currentKey, 0);
            }

            int value = newMap.get(currentKey);
            newMap.put(currentKey, value + 1);
        }

        for (Map.Entry<Double, Integer> entry : newMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
