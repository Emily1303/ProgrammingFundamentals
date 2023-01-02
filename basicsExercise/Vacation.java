package basicsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleInGroup = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;
        switch (dayOfWeek) {
            case "Friday":
                switch (typeOfGroup) {
                    case "Students":
                        price = peopleInGroup * 8.45;
                        break;
                    case "Business":
                        price = peopleInGroup * 10.90;
                        break;
                    case "Regular":
                        price = peopleInGroup * 15;
                        break;
                }
                break;
            case "Saturday":
                switch (typeOfGroup) {
                    case "Students":
                        price = peopleInGroup * 9.80;
                        break;
                    case "Business":
                        price = peopleInGroup * 15.60;
                        break;
                    case "Regular":
                        price = peopleInGroup * 20;
                        break;
                }
                break;
            case "Sunday":
                switch (typeOfGroup) {
                    case "Students":
                        price = peopleInGroup * 10.46;
                        break;
                    case "Business":
                        price = peopleInGroup * 16;
                        break;
                    case "Regular":
                        price = peopleInGroup * 22.50;
                        break;
                }
                break;
        }

        if (typeOfGroup.equals("Students") && peopleInGroup >= 30) {
            price = price - price * 0.15;
        } else if (typeOfGroup.equals("Business") && peopleInGroup >= 100) {
            switch (dayOfWeek) {
                case "Friday":
                    price = price - 10 * 10.90;
                    break;
                case "Saturday":
                    price = price - 10 * 15.60;
                    break;
                case "Sunday":
                    price = price - 10 * 16;
                    break;
            }
        } else if (typeOfGroup.equals("Regular") && peopleInGroup >= 10 && peopleInGroup <= 20) {
            price = price - price * 0.05;
        }

        System.out.printf("Total price: %.2f", price);
    }
}
