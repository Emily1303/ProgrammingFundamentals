package objectsAndClassesExercise;

import javax.naming.NameNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {

    static class Vehicle {

        private String typeOfVehicle;
        private String model;
        private String color;
        private int horsePower;

        public Vehicle(String typeOfVehicle, String model, String color, int horsePower) {
            this.typeOfVehicle = typeOfVehicle;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getTypeOfVehicle() {
            return this.typeOfVehicle;
        }

        public String getModel() {
            return this.model;
        }

        public String getColor() {
            return this.color;
        }

        public int getHorsePower() {
            return this.horsePower;
        }

        @Override
        public String toString() {
            String newType = "";
            if (getTypeOfVehicle().equals("car")) {
                newType = "Car";
            } else if (getTypeOfVehicle().equals("truck")) {
                newType = "Truck";
            }

            return String.format("Type: %s%n" +
                    "Model: %s%n" +
                    "Color: %s%n" +
                    "Horsepower: %d", newType, getModel(), getColor(), getHorsePower());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehiclesList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputLine = input.split(" ");
            String typeOfVehicle = inputLine[0];
            String model = inputLine[1];
            String color = inputLine[2];
            int horsePower = Integer.parseInt(inputLine[3]);

            Vehicle currentVehicle = new Vehicle(typeOfVehicle, model, color, horsePower);
            vehiclesList.add(currentVehicle);

            input = scanner.nextLine();
        }

        String command = scanner.nextLine();
        while (!command.equals("Close the Catalogue")) {
            for (Vehicle item : vehiclesList) {
                if (item.getModel().equals(command)) {
                    if (item.getTypeOfVehicle().equals("car")) {
                        System.out.println(item.toString());
                        break;
                    } else {
                        System.out.println(item.toString());
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        int sumHorsePowerCars = 0;
        int sumHorsePowerTrucks = 0;
        int countCars = 0;
        int countTrucks = 0;

        for (Vehicle item : vehiclesList) {
            if (item.getTypeOfVehicle().equals("car")) {
                countCars++;
                sumHorsePowerCars = sumHorsePowerCars + item.getHorsePower();
            } else if (item.getTypeOfVehicle().equals("truck")) {
                countTrucks++;
                sumHorsePowerTrucks = sumHorsePowerTrucks + item.getHorsePower();
            }
        }



        double averageCarsHorsePower = giveAverageHorsePower(countCars, sumHorsePowerCars);
        double averageTrucksHorsePower = giveAverageHorsePower(countTrucks, sumHorsePowerTrucks);

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarsHorsePower);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTrucksHorsePower);


    }

    private static double giveAverageHorsePower(int count, int sumOfHorsePower) {
        double averageHorsePower = sumOfHorsePower * 1.0 / count;

        if (sumOfHorsePower == 0) {
            averageHorsePower = 0;
        }

        return averageHorsePower;
    }
}
