# BankManager - Application de Gestion Bancaire

##  Description du Projet
Ce projet est une application console développée en **Java 21** mettant en pratique les concepts fondamentaux de la **Programmation Orientée Objet (POO)**. 

L'objectif est de modéliser un système bancaire à travers une architecture de classes structurée, illustrant les piliers de la POO :
* **L'Héritage** : Réutilisation et spécialisation des comportements à partir d'une classe parente.
* **L'Encapsulation** : Protection des données via des attributs privés/protégés et des accesseurs (`Getters` / `Setters`).

---

##  Architecture et Structure POO

Le projet repose sur une classe mère et trois classes filles spécialisées :

* **`BankAccount`** (Classe Parente) : Regroupe les attributs communs à tous les comptes : `account` (numéro de compte) et `balance` (solde).
* **`CheckingAccount`** (Classe Enfant) : Spécialisation pour les comptes courants, intégrant une limite de découvert (`limit`).
* **`SavingsAccount`** (Classe Enfant) : Spécialisation pour les comptes d'épargne, intégrant un taux d'intérêt (`interestRate`).
* **`COD`** (*Certificat de Dépôt* - Classe Enfant) : Spécialisation pour les comptes à terme, incluant une durée de blocage des fonds (`durationMonths`).

### Spécifications Techniques :
* Les attributs de la classe parente utilisent le modificateur de visibilité `protected` pour permettre un accès direct et optimisé aux classes enfants, tout en restant encapsulés vis-à-vis de l'extérieur.
* La classe `Main` instancie chaque type de compte, manipule leurs états via les constructeurs, et valide la lecture/écriture des données.

---

## Structure des Fichiers

Le projet utilise l'arborescence standardisée de **Maven** / **IntelliJ** :

```text
BankManager/
├── .gitignore
├── pom.xml
└── src/
    └── main/
        └── java/
            └── org/
                └── example/
                    ├── BankAccount.java
                    ├── CheckingAccount.java
                    ├── SavingsAccount.java
                    ├── COD.java
                    └── Main.java
