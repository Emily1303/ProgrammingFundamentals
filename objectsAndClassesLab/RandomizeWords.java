package objectsAndClassesLab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        while (words.size() > 0) {
            Random randomIndex = new Random();
            int number = randomIndex.nextInt(words.size());

            System.out.println(words.get(number));
            words.remove(number);
        }
    }
}
