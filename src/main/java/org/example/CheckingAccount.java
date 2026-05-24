package org.example;

public class CheckingAccount extends BankAccount {
    private double limit; // Découvert autorisé par exemple

    public CheckingAccount(String account, double balance, double limit) {
        // Appelle le constructeur de la classe parente (BankAccount)
        super(account, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}