package objectsAndClassesExercise;

import java.util.Scanner;

public class Articles {

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

        public void edit(String newContent) {
            this.content = newContent;
        }

        public void changeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        public void rename(String newTitle) {
            this.title = newTitle;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int number = Integer.parseInt(scanner.nextLine());

        String[] inputLine = input.split(", ");
        String title = inputLine[0];
        String content = inputLine[1];
        String author = inputLine[2];

        Article currentArticle = new Article(title, content, author);

        for (int i = 0; i < number; i++) {
            String command = scanner.nextLine();
            String[] commandLine = command.split("\\: ");

            String firstCommand = commandLine[0];
            switch (firstCommand) {
                case "Edit":
                    String newContent = commandLine[1];
                    currentArticle.edit(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = commandLine[1];
                    currentArticle.changeAuthor(newAuthor);
                    break;
                case "Rename":
                    String newTitle = commandLine[1];
                    currentArticle.rename(newTitle);
                    break;
            }
        }

        System.out.println(currentArticle.toString());
    }
}
