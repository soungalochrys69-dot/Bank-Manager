package org.example;

    public class Main {
        public static void main(String[] args) {
            // 1. Création des instances des 3 classes enfants
            CheckingAccount checking = new CheckingAccount("CH-9876", 1500.0, 500.0);
            SavingsAccount savings = new SavingsAccount("SV-4321", 5000.0, 2.5);
            COD cod = new COD("COD-1111", 10000.0, 12);

            // 2. Vérification de la lecture des attributs hérités (account et balance)
            System.out.println("--- Lecture Initiale ---");
            System.out.println("Checking -> Compte: " + checking.getAccount() + " | Solde: " + checking.getBalance() + "€ | Limite: " + checking.getLimit() + "€");
            System.out.println("Savings  -> Compte: " + savings.getAccount() + " | Solde: " + savings.getBalance() + "€");
            System.out.println("COD      -> Compte: " + cod.getAccount() + " | Solde: " + cod.getBalance() + "€");

            // 3. Modification des attributs (Setters)
            checking.setAccount("CH-NEW-9999");
            checking.setBalance(1200.50);
            System.out.println("\n--- Après Modification ---");
            System.out.println("Checking modifié -> Compte: " + checking.getAccount() + " | Nouveau Solde: " + checking.getBalance() + "€");
        }
    }