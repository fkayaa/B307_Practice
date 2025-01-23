package interviewday_05;
//vadesiz hesap
public class CheckingAccount extends BankAccount{


    public CheckingAccount(double balance, String accountHolder) {
        super(balance, accountHolder);
    }


    @Override
    public void accountType() {
        System.out.println("Vadesiz Hesaptır.");
    }

}