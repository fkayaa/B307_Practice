package interviewday_05;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount=new CheckingAccount(5000,"Ali Can");
        SavingsAccount savingsAccount=new SavingsAccount(10000,"Veli Han");

        System.out.println(checkingAccount.getAccountHolder());
        System.out.println(checkingAccount.getBalance());
        checkingAccount.deposit(10000);
        checkingAccount.accountType();

        System.out.println("-------------------------------");
        System.out.println(savingsAccount.getAccountHolder());
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(5000);
        savingsAccount.accountType();
    }
}