package ca.nl.cna.quintin.java1.InClassAssignments.Assign4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for prime number calculator.
 *
 * @author quintin.tuck
 */
class PrimeNumberCalculatorTest {

    /**
     * isPrime. Checks the first 25 prime numbers to make sure primes are being identified correctly.
     */
    @Test
    void isPrime() {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        for (int num: primes) {
            assertTrue(PrimeNumberCalculator.isPrime(num));
        }
    }

    /**
     * notPrime. Checks a list of known non-prime numbers to make sure non-primes are identified correctly.
     */
    @Test
    void notPrime() {
        int[] notPrimes = {1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 21, 20, 22, 24, 25, 26, 27, 28, 30, 32, 33, 34, 35, 36, 38, 39, 40, 42, 44, 45, 46, 48, 49, 50, 51, 52, 54, 56, 55, 57, 58, 60, 63, 62, 64, 65, 66, 69,68, 70, 72, 75, 74, 76, 78, 77, 80};
        for (int number: notPrimes) {
            assertFalse(PrimeNumberCalculator.isPrime(number));
        }
    }

    /**
     * uniquePrimeFactorization. Test a known number and its known unique prime factors to verify the method is working properly.
     */
    @Test
    void uniquePrimeFactorization() {
        assertEquals("2 3 17 3389 ",PrimeNumberCalculator.getUniquePrimeFactorization(345678));
    }

    /**
     * uniquePrimeFactorizationList. Test known number and its known unique prime factors to verify the method is working correctly
     * and returns an ArrayList containing the unique prime factors.
     */
    @Test
    void uniquePrimeFactorizationList() {
        ArrayList<Integer> checkList = new ArrayList<>(){
            {
                add(2);
                add(3);
                add(17);
                add(3389);
            }
        };

        ArrayList<Integer> factorList = new ArrayList<>();

        assertEquals(checkList, PrimeNumberCalculator.getUniquePrimeFactorizationList(345678, factorList));
    }

    /**
     * primeFactorization. Gets the prime factors of a random number and multiplies them back together to check against the original number
     * to verify the method to get prime factors is working correctly.
     */
    @Test
    void primeFactorization() {
        Random random = new Random();
        int product = 1;
        int checkNumber = random.nextInt();
        ArrayList<Integer> factorList = new ArrayList<>();

        factorList = PrimeNumberCalculator.getUniquePrimeFactorizationList(checkNumber, factorList);

        for (Integer i: factorList) {
            product = product * i;
        }

        assertEquals(product, checkNumber);
    }
}