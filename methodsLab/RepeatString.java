package methodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String result = repeatedString(text, n);
        System.out.println(result);
    }

    public static String repeatedString(String repeatedText, int number) {
        String result = "";
        for (int i = 1; i <= number; i++) {
            result = result + repeatedText;
        }

        return result;
    }
}
