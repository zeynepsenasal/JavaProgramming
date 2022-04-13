package day31_Constructions;

public class BankAccount {
    public String acountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo (String acountHolder, long accountNumber, double balance) {
        this.acountHolder = acountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "acountHolder='" + acountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: " + balance);
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Deposit amount cannot be negative or zero");
        }

        balance += amount;
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
            return;
        }
        if(amount<=0){
            System.out.println("Deposit amount cannot be negative or zero");
        }

        balance -= amount;
    }



}
