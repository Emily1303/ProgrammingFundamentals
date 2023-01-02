package objectsAndClassesExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student{

        private String firstName;
        private String lastName;
        private double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public double getGrade() {
            return this.grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", getFirstName(), getLastName(), getGrade());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            String[] inputLine = input.split(" ");
            String firstName = inputLine[0];
            String lastName = inputLine[1];
            double grade = Double.parseDouble(inputLine[2]);

            Student currentStudent = new Student(firstName, lastName, grade);
            studentsList.add(currentStudent);
        }

        studentsList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student item : studentsList) {
            System.out.println(item.toString());
        }
    }
}
