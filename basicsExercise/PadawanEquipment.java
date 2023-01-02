package basicsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double pricePerSaber = Double.parseDouble(scanner.nextLine());
        double pricePerRobe = Double.parseDouble(scanner.nextLine());
        double pricePerBelt = Double.parseDouble(scanner.nextLine());

        double moreSabers = Math.ceil(students * 10 / 100.0);
        double totalSabers = students + moreSabers;
        double totalPriceSabers = totalSabers * pricePerSaber;

        int freeBeltsCount = 0;
        for (int i = 1; i <= students; i++) {
            if (i % 6 == 0) {
                freeBeltsCount++;
            }
        }

        int totalBelts = students - freeBeltsCount;
        double totalPriceBelts = totalBelts * pricePerBelt;
        double totalPriceRobes = students * pricePerRobe;
        double sum = totalPriceSabers + totalPriceBelts + totalPriceRobes;
        double diff = Math.abs(sum - money);

        if (money >= sum) {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }
    }
}
