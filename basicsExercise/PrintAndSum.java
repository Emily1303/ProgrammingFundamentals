package basicsExercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = startNumber; i <= endNumber ; i++) {
            sum = sum + i;
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
