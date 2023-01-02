package listsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<String> productsLine = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
           String products = scanner.nextLine();
           productsLine.add(products);
        }

        printOrderedProducts(productsLine, number);
    }

    public static void printOrderedProducts (List<String> list, int number) {
        Collections.sort(list);
        for (int i = 0; i < number; i++) {
            System.out.print(i + 1 + "." + list.get(i));
            System.out.println();
        }
    }
}
