package arraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int[] people = new int[count];
        int sum = 0;
        for (int i = 0; i < count; i++) {
            people[i] = Integer.parseInt(scanner.nextLine());
            sum = sum + people[i];
            System.out.print(people[i] + " ");
        }

        System.out.println();
        System.out.println(sum);
    }
}
