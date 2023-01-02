package objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student {

        String firstName;
        String lastName;
        String age;
        String town;

//        public Student (String firstName, String lastName, String age, String town) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.age = age;
//            this.town = town;
//        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAge() {
            return this.age;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getTown() {
            return this.town;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] inputLine = input.split(" ");
            String firstName = inputLine[0];
            String lastName = inputLine[1];
            String age = inputLine[2];
            String town = inputLine[3];

            Student currentStudent = new Student();
            currentStudent.firstName = firstName;
            currentStudent.lastName = lastName;
            currentStudent.age = age;
            currentStudent.town = town;

            students.add(currentStudent);

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();
        for (Student item : students) {
            if (item.getTown().equals(city)) {
                System.out.printf("%s %s is %s years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }
}
