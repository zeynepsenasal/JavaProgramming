package day31_Constructions;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Zeynep Saltık", 12345, 2000);

        account1.deposit(200);
        account1.checkBalance();

        account1.withdraw(1000);
        account1.checkBalance();

    }
}
