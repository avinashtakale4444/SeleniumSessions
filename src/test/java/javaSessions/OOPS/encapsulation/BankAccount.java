package javaSessions.OOPS.encapsulation;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double balance) {
        this.balance = this.balance + balance;
    }
    public void withdraw(double balance) {
        this.balance = this.balance - balance;
    }
    public void printStatement(){
        System.out.println("Owner :"+ownerName+"\n"+"AccountNumber :"+accountNumber+"\n"+"Balance :"+balance);
    }

}
