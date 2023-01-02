package associativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Map<String, Double> students = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            double sum = 0;
            int count = 1;

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(name)) {
                students.put(name, grade);
            } else {
                double currentGrade = students.get(name);
                count++;
                sum = sum + currentGrade + grade;
                students.put(name, sum / count);
            }
        }

        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
            }
        }

    }
}
