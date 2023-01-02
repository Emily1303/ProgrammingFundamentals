package basicsExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            char currentSymbol = username.charAt(i);
            password = password + currentSymbol;
        }

        String input = scanner.nextLine();
        int diffPassCount = 0;
        boolean moreDiffPass = false;
        while (!input.equals(password)) {
            diffPassCount++;
            if (diffPassCount == 4) {
                moreDiffPass = true;
                break;
            }

            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }

        if (moreDiffPass) {
            System.out.printf("User %s blocked!", username);
        } else {
            System.out.printf("User %s logged in.", username);
        }
    }
}
