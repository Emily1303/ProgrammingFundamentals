package objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {

    static class Student {

        String firstName;
        String lastName;
        String age;
        String town;

        public Student(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
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

            Student currentStudent = new Student(firstName, lastName, age, town);
            boolean isTheStudentAlreadyInTheList = isTheStudentInTheList(students, firstName, lastName);
            int indexWithTheSameStudent = 0;
            if (!isTheStudentAlreadyInTheList) {
                students.add(currentStudent);
            } else {
                Student theSameStudent = currentStudent;
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getFirstName().equals(firstName) && students.get(i).getLastName().equals(lastName)) {
                        indexWithTheSameStudent = i;
                    }
                }

                students.get(indexWithTheSameStudent).firstName = theSameStudent.getFirstName();
                students.get(indexWithTheSameStudent).lastName = theSameStudent.getLastName();
                students.get(indexWithTheSameStudent).age = theSameStudent.getAge();
                students.get(indexWithTheSameStudent).town = theSameStudent.getTown();
            }

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();
        for (Student item : students) {
            if (item.getTown().equals(city)) {
                System.out.printf("%s %s is %s years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }

    public static boolean isTheStudentInTheList(List<Student> students, String firstName, String lastName) {
        boolean isThereTheSameStudent = false;
        for (Student item : students) {
            if (item.getFirstName().equals(firstName) && item.getLastName().equals(lastName)) {
                isThereTheSameStudent = true;
            }
        }

        return isThereTheSameStudent;
    }
}
