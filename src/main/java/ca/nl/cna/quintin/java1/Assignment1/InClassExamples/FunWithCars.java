package ca.nl.cna.quintin.java1.Assignment1.InClassExamples;

import java.util.Scanner;

public class FunWithCars {

    public static void main(String[] args) {
        System.out.println("Let's have fun with cars");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Make of the car: ");
        String make = input.nextLine();

        System.out.println("Enter the model of the car: ");
        String model = input.nextLine();

        System.out.println("Enter the year of the car: ");
        int year = input.nextInt();

        System.out.println("Enter the value of the car: ");
        double value = (input.nextDouble());

        Car car = new Car(make, model, year, value);

        System.out.printf("Car information: %s, %s from %d. Value: $%,.2f", car.getMake(), car.getModel(), car.getYear(), car.getValue());
    }
}
