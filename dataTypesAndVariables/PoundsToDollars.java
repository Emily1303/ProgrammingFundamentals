package dataTypesAndVariables;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        double pounds = Double.parseDouble(scanner.nextLine());
//        double dollars = pounds * 1.36;

        float pounds = Float.parseFloat(scanner.nextLine());
        float dollars = pounds * 1.36f;

        System.out.printf("%.3f", dollars);
    }
}
