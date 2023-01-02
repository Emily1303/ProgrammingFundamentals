package objectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {

    static class Article {

        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return this.title;
        }

        public String getContent() {
            return this.content;
        }

        public String getAuthor() {
            return this.author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<Article> articlesList = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            String[] inputLine = input.split(", ");
            String title = inputLine[0];
            String content = inputLine[1];
            String author = inputLine[2];

            Article currentArticle = new Article(title, content, author);
            articlesList.add(currentArticle);
        }

        String command = scanner.nextLine();

        for (Article item : articlesList) {
            System.out.println(item.toString());
        }
    }
}
