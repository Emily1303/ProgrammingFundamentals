package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (firstPlayer.size() > 0 || secondPlayer.size() > 0) {
            if (firstPlayer.get(0) > secondPlayer.get(0)) {
                int firstPlayerCard = firstPlayer.get(0);
                int secondPlayerCard = secondPlayer.get(0);
                firstPlayer.remove(0);
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
                secondPlayer.remove(0);

                if (firstPlayer.size() == 0) {
                    break;
                } else if (secondPlayer.size() == 0) {
                    break;
                }

            } else if (secondPlayer.get(0) > firstPlayer.get(0)) {
                int secondPlayerCard = secondPlayer.get(0);
                int firstPlayerCard = firstPlayer.get(0);
                secondPlayer.remove(0);
                secondPlayer.add(secondPlayerCard);
                secondPlayer.add(firstPlayerCard);
                firstPlayer.remove(0);

                if (firstPlayer.size() == 0) {
                    break;
                } else if (secondPlayer.size() == 0) {
                    break;
                }

            } else if (firstPlayer.get(0).equals(secondPlayer.get(0))) {
                firstPlayer.remove(0);
                secondPlayer.remove(0);

                if (firstPlayer.size() == 0) {
                    break;
                } else if (secondPlayer.size() == 0) {
                    break;
                }
            }
        }

        if (firstPlayer.size() > 0) {
            int result = sumAndPrintTheSumOfTheWinningCards(firstPlayer);
            System.out.printf("First player wins! Sum: %d", result);
        } else {
            int result = sumAndPrintTheSumOfTheWinningCards(secondPlayer);
            System.out.printf("Second player wins! Sum: %d", result);
        }


    }

    public static int sumAndPrintTheSumOfTheWinningCards (List<Integer> list) {
        int sum = 0;
        for (int item : list) {
            sum = sum + item;
        }

        return sum;
    }
}
