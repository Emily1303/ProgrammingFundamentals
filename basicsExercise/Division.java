package basicsExercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String text = "";
        if (number % 10 == 0) {
            text = "The number is divisible by 10";
        } else if (number % 7 == 0) {
            text = "The number is divisible by 7";
        } else if (number % 6 == 0) {
            text = "The number is divisible by 6";
        } else if (number % 3 == 0) {
            text = "The number is divisible by 3";
        } else if (number % 2 == 0) {
            text = "The number is divisible by 2";
        } else {
            text = "Not divisible";
        }

        System.out.println(text);
    }
}
