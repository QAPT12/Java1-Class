package ca.nl.cna.quintin.java1.InClassAssignments.Assign4;

import java.util.Scanner;

import static ca.nl.cna.quintin.java1.InClassAssignments.Assign4.PrimeNumberCalculator.getUniquePrimeFactorization;
import static ca.nl.cna.quintin.java1.InClassAssignments.Assign4.PrimeNumberCalculator.isPrime;

public class FunWithPrimeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("'Fun' with Prime Numbers!");
        System.out.println("""
                1. Print all primes between 1 and a number.
                2. Print all primes between two numbers.
                3. Print unique prime factorization of a number.
                4. Print unique prime factorization of all numbers up to a limit.
                """);

        System.out.println("Enter choice: ");

        int userChoice = input.nextInt();

        if(userChoice == 1){

            System.out.print("Enter a number: ");

            int userNum = input.nextInt();

            for (int i = 1; i <= userNum ; i++) {
                if(isPrime(i)){
                    System.out.printf("%d ", i);
                }
            }
        } else if (userChoice == 2) {

            System.out.print("Enter first number: ");
            int startNum = input.nextInt();

            System.out.print("Enter second number: ");
            int endNum = input.nextInt();

            for (int i = startNum; i <= endNum; i++) {
                if(isPrime(i)){
                    System.out.printf("%d ", i);
                }
            }
        } else if (userChoice == 3) {

            System.out.print("Enter number: ");
            int userNum = input.nextInt();

            getUniquePrimeFactorization(userNum);

        } else if (userChoice == 4) {

            System.out.print("Enter limit: ");
            int userLimit = input.nextInt();

            for (int i = 1; i <= userLimit; i++) {
                System.out.printf("\n the prime factorization of %d is: ", i);
                getUniquePrimeFactorization(i);
            }

        } else {
            System.out.println("Invalid option.");
        }

    }
}
