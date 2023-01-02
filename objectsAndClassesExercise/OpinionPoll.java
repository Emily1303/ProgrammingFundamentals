package objectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    static class Person{

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfIterations = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numberOfIterations; i++) {
            String input = scanner.nextLine();
            String[] inputLine = input.split(" ");
            String name = inputLine[0];
            int age = Integer.parseInt(inputLine[1]);

            Person currentPerson = new Person(name, age);
            people.add(currentPerson);
        }

        for (Person item : people) {
            if (item.getAge() > 30) {
                System.out.printf("%s - %d%n", item.getName(), item.getAge());
            }
        }
    }
}
