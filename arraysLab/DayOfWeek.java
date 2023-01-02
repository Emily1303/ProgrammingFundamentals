package arraysLab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        String[] dayOfWeek = new String [] {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        if (input < 1 || input > dayOfWeek.length) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(dayOfWeek[input - 1]);
        }
    }
}
