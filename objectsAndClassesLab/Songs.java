package objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {

    static class Song {
        String typeList;
        String name;
        String time;

//        public Song(String typeList, String name, String time) {
//            this.typeList = typeList;
//            this.name = name;
//            this.time = time;
//        }


        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setTime(String time) {
            this.time = time;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            String[] inputLine = input.split("_");
            String type = inputLine[0];
            String name = inputLine[1];
            String time = inputLine[2];

            Song currentSong = new Song();
            currentSong.typeList = type;
            currentSong.name = name;
            currentSong.time = time;

            songs.add(currentSong);
        }

        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song item : songs) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : songs) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
