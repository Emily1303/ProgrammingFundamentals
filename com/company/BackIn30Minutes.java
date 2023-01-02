package com.company;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (hour * 60) + minutes + 30;
        int finalHours = allMinutes / 60;
        int finalMinutes = allMinutes % 60;

        if (finalHours > 23) {
            finalHours = 0;
        }

        System.out.printf("%d:%02d", finalHours, finalMinutes);
    }
}
