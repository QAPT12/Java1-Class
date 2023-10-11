package ca.nl.cna.quintin.java1.InClassExamples;
public class SimpleSavingsAccount {

    private String name;
    private double balance;

    public SimpleSavingsAccount(String name) {
        this.name = name;
        this.balance = 0;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
}
