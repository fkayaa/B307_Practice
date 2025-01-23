package interviewday_05;


public class SavingsAccount extends BankAccount{

    public SavingsAccount(double balance, String accountHolder) {
        super(balance, accountHolder);
    }

    @Override
    public void accountType() {
        System.out.println("Bu hesap bir vadeli hesaptır");
    }
}