package textProcessingExercise;

import java.util.Locale;
import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputLine = input.split("\\\\");
        String lastItem = inputLine[inputLine.length - 1];
        String fileName = lastItem.split("\\.")[0];
        String extension = lastItem.split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
