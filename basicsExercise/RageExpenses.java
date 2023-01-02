package basicsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

//        int headsetCount = lostGames / 2;
//        int mouseCount = lostGames / 3;
//        int keyboardCount = lostGames / 6;
//        int displayCount = lostGames / 12;
//        double totalHeadsetPrice = headsetPrice * headsetCount;
//        double totalMousePrice = mousePrice * mouseCount;
//        double totalKeyboardPrice = keyboardPrice * keyboardCount;
//        double totalDisplayPrice = displayPrice * displayCount;
//
//        double sum = totalDisplayPrice + totalHeadsetPrice + totalKeyboardPrice + totalMousePrice;
//
//        System.out.printf("Rage expenses: %.2f lv.", sum);

        int headsetCount = 0;
        int mouseCount  = 0;
        int keyboardCount = 0;
        int displayCount = 0;
        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                headsetCount++;
            }

            if (i % 3 == 0) {
                mouseCount++;
            }

            if (i % 6 == 0) {
                keyboardCount++;
            }

            if (i % 12 == 0) {
               displayCount++;
            }
        }

        double totalHeadsetPrice = headsetPrice * headsetCount;
        double totalMousePrice = mousePrice * mouseCount;
        double totalKeyboardPrice = keyboardPrice * keyboardCount;
        double totalDisplayPrice = displayPrice * displayCount;
        double sum = totalDisplayPrice + totalKeyboardPrice + totalMousePrice + totalHeadsetPrice;

        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}
