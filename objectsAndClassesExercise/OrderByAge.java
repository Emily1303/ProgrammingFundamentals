package objectsAndClassesExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

    static class Person1 {

        private String name;
        private String id;
        private int age;

        public Person1(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public String getId() {
            return this.id;
        }

        public int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person1> people1List = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputLine = input.split(" ");
            String name = inputLine[0];
            String id = inputLine[1];
            int age = Integer.parseInt(inputLine[2]);

            Person1 currentPerson1 = new Person1(name, id, age);
            people1List.add(currentPerson1);

            input = scanner.nextLine();
        }

        people1List.sort(Comparator.comparing(Person1::getAge));
        for (Person1 item : people1List) {
            System.out.println(item.toString());
        }
    }
}
