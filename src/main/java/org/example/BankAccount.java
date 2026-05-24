package org.example;

public class BankAccount {
    // Protected permet aux classes enfants d'y accéder directement
    protected String account;
    protected double balance;

    // Constructeur par défaut
    public BankAccount() {
    }

    // Constructeur avec paramètres
    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    // Getters et Setters pour lire et définir les attributs
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}