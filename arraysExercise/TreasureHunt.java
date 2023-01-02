package arraysExercise;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasure = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();
        String[] newArray = new String[treasure.length + 1];

        while (!command.equals("Yohoho!")) {
            String[] command1 = command.split(" ");
            String firstCommand = command1[0];
            switch (firstCommand) {
                case "Loot":
                    for (int i = 1; i < command1.length; i++) {
                        String currentLoot = command1[i];
                        if (i + 1 < command1.length) {
                            for (int j = 0; j < treasure.length; j++) {
                                if (j < newArray.length - 1) {
                                    if (currentLoot.equals(treasure[j]) || currentLoot.equals(newArray[j])) {
                                        currentLoot = command1[i + 1];
                                    }
                                }
                            }

                            if (treasure.length < newArray.length) {
                                for (int k = 1; k < newArray.length; k++) {
                                    newArray[0] = currentLoot;
                                    newArray[k] = treasure[k - 1];
                                }
                                treasure = new String[newArray.length + 1];
                            } else {
                                for (int j = 1; j < treasure.length; j++) {
                                    treasure[0] = currentLoot;
                                    treasure[j] = newArray[j - 1];
                                }
                                newArray = new String[treasure.length + 1];
                            }
                        }
                    }
                    break;
                case "Drop":
                    if (command1.length == 2) {
                        if (treasure.length > newArray.length) {
                            treasure = new String[newArray.length];
                            int currentCommand = Integer.parseInt(command1[1]);
                            String removedLoot = newArray[currentCommand];
                            for (int i = 0; i < newArray.length; i++) {
                                if (i != currentCommand) {
                                    treasure[i] = newArray[i];
                                    if (i > currentCommand) {
                                        treasure[i - 1] = newArray[i];
                                    }
                                }
                                if (i == currentCommand) {
                                    treasure[treasure.length - 1] = newArray[i];
                                }
                            }
                        } else {
                        }
                    }
                    break;
                case "Steal":
                    break;
            }
            command = scanner.nextLine();
        }
    }
}



