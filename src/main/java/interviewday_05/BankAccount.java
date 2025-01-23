package interviewday_05;

public class BankAccount {
    //ikisi icinde ortak olarak pasif ozellikler
    private double balance;//bakiye
    private String accountHolder;//hesap sahibi

    public BankAccount(double balance, String accountHolder) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    //ikisi icinde ortak olan ve aynı işlemi yapan aktif ozellikler
    //para yatırma
    public void deposit(double amount){
        if (amount>0){
            this.balance+=amount;
            System.out.println(amount+" Tl yatırıldı. yeni bakiye : "+balance+" Tl");
        }else {
            System.out.println("Yatırılacak miktar 0'dan büyük olmak zorundadır");
        }
    }

    //para cekme ÖDEV!!!
    //bakiye Görüntüleme ÖDEV!!!

    //ikisi icinde ortak olan ve farkli işlem yapan aktif özellikler
    //abs method
    public abstract void accountType();


    //getter-setter
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}
