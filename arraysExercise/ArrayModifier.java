package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] command1 = command.split(" ");
            if (command1.length == 1) {
                String typeOfCommand = command1[0];
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = numbers[i] - 1;
                }
            } else {
            String typeOfCommand = command1[0];
            int firstIndex = Integer.parseInt(command1[1]);
            int secondIndex = Integer.parseInt(command1[2]);

            switch (typeOfCommand) {
                case "swap":
                    int firstElement = numbers[firstIndex];
                    int secondElement = numbers[secondIndex];
                    numbers[firstIndex] = secondElement;
                    numbers[secondIndex] = firstElement;
                    break;
                case "multiply":
                    int firstElement1 = numbers[firstIndex];
                    int secondElement1 = numbers[secondIndex];
                    int product = firstElement1 * secondElement1;
                    numbers[firstIndex] = product;
                    break;
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[numbers.length - 1]);
            }
        }
    }
}
