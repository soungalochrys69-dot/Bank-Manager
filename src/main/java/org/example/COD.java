package org.example;

public class COD extends BankAccount {
    private int durationMonths; // Attribut spécifique (durée de blocage des fonds)

    public COD(String account, double balance, int durationMonths) {
        super(account, balance);
        this.durationMonths = durationMonths;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }
}