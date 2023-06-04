package javaSessions.OOPS.encapsulation;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setAccountNumber("10003330111");
        bankAccount.setBalance(650000.00);
        bankAccount.setOwnerName("avinash");

        bankAccount.printStatement();
        bankAccount.deposit(150000);
        bankAccount.printStatement();
        bankAccount.withdraw(300000);
        bankAccount.printStatement();

    }
}
