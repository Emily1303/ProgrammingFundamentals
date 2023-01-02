package arraysLab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] StringArr = input.split(" ");

        for (int i = 0; i < StringArr.length / 2; i++) {
            String currentString = StringArr[i];
            StringArr[i] = StringArr[StringArr.length - 1 - i];
            StringArr[StringArr.length - 1 - i] = currentString;
        }

        System.out.println(String.join(" ", StringArr));
    }
}
