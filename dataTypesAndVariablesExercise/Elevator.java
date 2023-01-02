package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = people / capacity;
        int anotherPeople = people % capacity;

        if (anotherPeople <= capacity && anotherPeople > 0) {
            courses = courses + 1;
        }

        System.out.println(courses);
    }
}
