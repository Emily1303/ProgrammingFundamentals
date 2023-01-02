package methodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandLine = command.split(" ");
            String firstCommand = commandLine[0];
            switch (firstCommand) {
                case "exchange":
                    int index = Integer.parseInt(commandLine[1]);
                    int[] newArray = new int[numbers.length];
                    if (index >= 0 && index <= numbers.length - 1) {
                        newArray = givesTheNewArrayAfterTheExchange(numbers, newArray, index);
                        numbers = newArray;
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String secondCommand = commandLine[1];
                    int indexOfMaxNumber = givesTheIndexOfTheMaxNumber(numbers, secondCommand);
                    int countEven1 = 0;
                    int countOdd1 = 0;
                    for (int item : numbers) {
                        if (item % 2 == 0) {
                            countEven1++;
                        } else {
                            countOdd1++;
                        }
                    }
                    if (countEven1 == 0 && secondCommand.equals("even")) {
                        System.out.println("No matches");
                    } else if (countOdd1 == 0 && secondCommand.equals("odd")) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(indexOfMaxNumber);
                    }
                    break;
                case "min":
                    String secondCommand2 = commandLine[1];
                    int indexOfMinNumber = givesTheIndexOfTheMinNumber(numbers, secondCommand2);
                    int countEven = 0;
                    int countOdd = 0;
                    for (int element : numbers) {
                        if (element % 2 == 0) {
                            countEven++;
                        } else {
                            countOdd++;
                        }
                    }
                    if (countEven == 0 && secondCommand2.equals("even")) {
                        System.out.println("No matches");
                    } else if (countOdd == 0 && secondCommand2.equals("odd")) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(indexOfMinNumber);
                    }
                    break;
                case "first":
                    int count = Integer.parseInt(commandLine[1]);
                    String thirdCommand = commandLine[2];
                    int countZeroElements1 = 0;
                    if (count > numbers.length) {
                        System.out.println("Invalid count");
                    } else {
                        int[] newArray1 = new int[count];
                        newArray1 = givesTheArrayOfTheFirstCountIntegers(numbers, count, thirdCommand);
                        for (int item : newArray1) {
                            if (item == 0) {
                                countZeroElements1++;
                            }
                        }

                        if (newArray1.length == 1) {
                            System.out.println("[" + newArray1[0] + "]");
                        } else if (!(countZeroElements1 == count)) {
                            System.out.print("[" + newArray1[0] + ", ");
                            for (int i = 1; i < newArray1.length - 1; i++) {
                                System.out.print(newArray1[i] + ", ");
                            }
                            System.out.println(newArray1[newArray1.length - 1] + "]");
                        }
                    }
                    break;
                case "last":
                    int countLast = Integer.parseInt(commandLine[1]);
                    String lastCommand = commandLine[2];
                    int countZeroElements = 0;
                    if (countLast > numbers.length) {
                        System.out.println("Invalid count");
                    } else {
                        int[] newArray2 = new int[countLast];
                        newArray2 = givesTheArrayOfTheLastCountIntegers(numbers, countLast, lastCommand);
                        for (int element : newArray2) {
                            if (element == 0) {
                                countZeroElements++;
                            }
                        }

                        if (newArray2.length == 1) {
                            System.out.println("[" + newArray2[0] + "]");
                        }else if (!(countZeroElements == countLast)) {
                            System.out.print("[" + newArray2[0] + ", ");
                            for (int i = 1; i < newArray2.length - 1; i++) {
                                System.out.print(newArray2[i] + ", ");
                            }
                            System.out.println(newArray2[newArray2.length - 1] + "]");
                        }
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.print("[" + numbers[0] + ", ");
        for (int i = 1; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[numbers.length - 1] + "]");
    }

    private static int[] givesTheNewArrayAfterTheExchange(int[] numbers, int[] newArray, int index) {
        int count = 0;
        for (int j = index + 1; j < numbers.length; j++) {
            newArray[count] = numbers[j];
            count++;
        }

        for (int i = 0; i <= index; i++) {
            newArray[count] = numbers[i];
            count++;
        }

        return newArray;
    }

    private static int givesTheIndexOfTheMaxNumber(int[] numbers, String secondCommand) {
        int maxNum = Integer.MIN_VALUE;
        int indexOfMaxNumber = 0;
        if (secondCommand.equals("even")) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    if (maxNum < numbers[i]) {
                        maxNum = numbers[i];
                        indexOfMaxNumber = i;
                    } else if (maxNum == numbers[i]) {
                        indexOfMaxNumber = i;
                    }
                }
            }
        } else if (secondCommand.equals("odd")) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    if (maxNum < numbers[i]) {
                        maxNum = numbers[i];
                        indexOfMaxNumber = i;
                    } else if (maxNum == numbers[i]) {
                        indexOfMaxNumber = i;
                    }
                }
            }
        }

        return indexOfMaxNumber;
    }

    private static int givesTheIndexOfTheMinNumber(int[] numbers, String secondCommand) {
        int minNum = Integer.MAX_VALUE;
        int indexOfMinNumber = 0;
        if (secondCommand.equals("even")) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    if (minNum > numbers[i]) {
                        minNum = numbers[i];
                        indexOfMinNumber = i;
                    } else if (minNum == numbers[i]) {
                        indexOfMinNumber = i;
                    }
                }
            }
        } else if (secondCommand.equals("odd")) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    if (minNum > numbers[i]) {
                        minNum = numbers[i];
                        indexOfMinNumber = i;
                    } else if (minNum == numbers[i]) {
                        indexOfMinNumber = i;
                    }
                }
            }
        }

        return indexOfMinNumber;
    }

    private static int[] givesTheArrayOfTheFirstCountIntegers(int[] numbers, int count, String thirdCommand) {
        int countOfEven = 0;
        int[] newArray = new int[count];
        int index = 0;
        int countOfOdd = 0;
        if (thirdCommand.equals("even")) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    countOfEven++;
                }
            }

            if (count <= countOfEven) {
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 == 0) {
                        newArray[index] = numbers[i];
                        index++;
                        count--;

                        if (count == 0) {
                            break;
                        }
                    }
                }
            } else if (countOfEven == 0) {
                System.out.println("[]");
            } else if (count > countOfEven) {
                newArray = new int[countOfEven];
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 == 0) {
                        newArray[index] = numbers[i];
                        index++;
                        countOfEven--;

                        if (countOfEven == 0) {
                            break;
                        }
                    }
                }
            }

        } else if (thirdCommand.equals("odd")) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    countOfOdd++;
                }
            }

            if (count <= countOfOdd) {
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 != 0) {
                        newArray[index] = numbers[i];
                        index++;
                        count--;

                        if (count == 0) {
                            break;
                        }
                    }
                }
            } else if (countOfOdd == 0) {
                System.out.println("[]");
            } else if (count > countOfOdd) {
                newArray = new int[countOfOdd];
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 != 0) {
                        newArray[index] = numbers[i];
                        index++;
                        countOfOdd--;

                        if (countOfOdd == 0) {
                            break;
                        }
                    }
                }
            }
        }

        return newArray;
    }

    private static int[] givesTheArrayOfTheLastCountIntegers(int[] numbers, int count, String lastCommand) {
        int countOfEven = 0;
        int[] newArray = new int[count];
        int countOfOdd = 0;
        if (lastCommand.equals("even")) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    countOfEven++;
                }
            }

            if (count <= countOfEven) {
                for (int i = numbers.length - 1; i >= 0; i--) {
                    if (numbers[i] % 2 == 0) {
                        newArray[count - 1] = numbers[i];
                        count--;

                        if (count == 0) {
                            break;
                        }
                    }
                }
            } else if (countOfEven == 0) {
                System.out.println("[]");
            } else if (count > countOfEven) {
                newArray = new int[countOfEven];
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 == 0) {
                        newArray[count - 1] = numbers[i];
                        count--;
                        countOfEven--;

                        if (countOfEven == 0) {
                            break;
                        }
                    }
                }
            }

        } else if (lastCommand.equals("odd")) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    countOfOdd++;
                }
            }

            if (count <= countOfOdd) {
                for (int i = numbers.length - 1; i >= 0; i--) {
                    if (numbers[i] % 2 != 0) {
                        newArray[count - 1] = numbers[i];
                        count--;

                        if (count == 0) {
                            break;
                        }
                    }
                }
            } else if (countOfOdd == 0) {
                System.out.println("[]");
            } else if (count > countOfOdd) {
                newArray = new int[countOfOdd];
                for (int i = numbers.length - 1; i >= 0; i--) {
                    if (numbers[i] % 2 != 0) {
                        newArray[countOfOdd - 1] = numbers[i];
                        count--;
                        countOfOdd--;

                        if (countOfOdd == 0) {
                            break;
                        }
                    }
                }
            }
        }

        return newArray;
    }
}
