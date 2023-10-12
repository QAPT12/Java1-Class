package ca.nl.cna.quintin.java1.InClassAssignments.Assign4;

import java.util.Scanner;

import static ca.nl.cna.quintin.java1.InClassAssignments.Assign4.PrimeNumberCalculator.isPrime;

public class FunWithPrimeNumbers {

    public static void main(String[] args) {

        System.out.println("'Fun' with Prime Numbers!");
        System.out.println("Enter number to check if prime: ");

        Scanner input = new Scanner(System.in);

        int userNum = input.nextInt();

        System.out.printf("%n is prime: %b", isPrime(userNum));
    }
}
