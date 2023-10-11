package cna.nl.ca.quintin.java1.Assignment1.InClassExamples;
import java.util.Scanner;

public class FunWithSavingsAccount {

    public static void main(String[] args) {
        System.out.println("Fun with savings account");

        SimpleSavingsAccount savingsAccount = new SimpleSavingsAccount("Quintin Tuck");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount to deposit into account: ");

        double amount = input.nextDouble();

        savingsAccount.deposit(amount);

        System.out.printf("Account belongs to %s \nBalance is %.2f", savingsAccount.getName(), savingsAccount.getBalance());
    }
}
