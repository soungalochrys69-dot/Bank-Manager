package org.example;

public class SavingsAccount extends BankAccount {
    private double interestRate; // Attribut spécifique pour l'épargne (ex: taux d'intérêt)

    public SavingsAccount(String account, double balance, double interestRate) {
        super(account, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
