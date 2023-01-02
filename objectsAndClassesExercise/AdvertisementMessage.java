package objectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number0fMessages = Integer.parseInt(scanner.nextLine());

        List<String> phrases = new ArrayList<>();
        phrases.add("Excellent product.");
        phrases.add("Such a great product.");
        phrases.add("I always use that product.");
        phrases.add("Best product of its category.");
        phrases.add("Exceptional product.");
        phrases.add("I can’t live without this product.");

        List<String> events = new ArrayList<>();
        events.add("Now I feel good.");
        events.add("I have succeeded with this product.");
        events.add("Makes miracles. I am happy of the results!");
        events.add("I cannot believe but now I feel awesome.");
        events.add("Try it yourself, I am very satisfied.");
        events.add("I feel great!");

        List<String> authors = new ArrayList<>();
        authors.add("Diana");
        authors.add("Petya");
        authors.add("Stella");
        authors.add("Elena");
        authors.add("Katya");
        authors.add("Iva");
        authors.add("Annie");
        authors.add("Eva");

        List<String> cities = new ArrayList<>();
        cities.add("Burgas");
        cities.add("Sofia");
        cities.add("Plovdiv");
        cities.add("Varna");
        cities.add("Ruse");

        Random rnd = new Random();
        for (int i = 0; i < number0fMessages; i++) {
            if (phrases.size() == 0 || events.size() == 0 || authors.size() == 0 || cities.size() == 0) {
                break;
            } else {
                int numberPhrases = rnd.nextInt(phrases.size());
                int numberEvents = rnd.nextInt(events.size());
                int numberAuthors = rnd.nextInt(authors.size());
                int numberCities = rnd.nextInt(cities.size());

                System.out.printf("%s %s %s - %s%n", phrases.get(numberPhrases), events.get(numberEvents),
                        authors.get(numberAuthors), cities.get(numberCities));

                phrases.remove(numberPhrases);
                events.remove(numberEvents);
                authors.remove(numberAuthors);
                cities.remove(numberCities);
            }
        }
    }
}
