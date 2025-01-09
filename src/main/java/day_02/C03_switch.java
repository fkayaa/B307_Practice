package day_02;

import java.util.Scanner;

public class C03_switch {
    public static void main(String[] args) {
        //Toplama, Çıkarma, Çarpma, Bölme , kalan Hesaplama ve us alma
        // 2 sayi ile işlem yapan basit bir Hesap Makinesi oluşturun:

        //1.adım Scanner
        Scanner input = new Scanner(System.in);

        //2.adım kullanıcıya bilgi verme
        System.out.println("Lütfen işlem yapmak istediğiniz operatörü seçiniz :" +
                "\n Toplamak için : +" +
                "\n Çıkarmak için : - " +
                "\n Bölmek için : / " +
                "\n Çarpmak için : * " +
                "\n Kalan Hesabı için : %" +
                "\n Üs almak için : ^" +
                "\n faktöriyel için : !");

        //3.adım uygun variable
        char operator = input.next().charAt(0);

        //TODO daha detaylı
        //4.adım kontrol ve işlem

        switch (operator) {//+
            case '+':
                System.out.println("Lütfen toplamak istediğiniz 2 sayıyı giriniz.");

                System.out.println("Sayıların toplamı : "+ (input.nextDouble()+input.nextDouble()));

                break;
            case '-':
                System.out.println("Lütfen çıkarmak istediğiniz 2 sayıyı giriniz.");

                System.out.println("Sayıların farkı : "+ Math.abs(input.nextDouble()-input.nextDouble()));

                break;
            case '%':
                System.out.println("Lütfen kalan hesaplamasını yapmak istediginiz 2 sayiyi giriniz");
                //paydanin 0 olma durumu var
                double num3= input.nextDouble();
                double num4= input.nextDouble();

                if (num4!=0){
                    System.out.println("Bolumden kalan : "+num3%num4);
                }else {
                    System.out.println("Payda 0 Olamaz!!!!");
                }
                break;

            case '*':
                System.out.println("Lütfen çarpmak istediğiniz 2 sayıyı giriniz.");

                System.out.println("Sayıların çarpımı : "+ (input.nextDouble()*input.nextDouble()));
                break;
            case '/':
                System.out.println("Lütfen kalanını istediğiniz 2 sayıyı giriniz.");

                //payda 0 olamaz.
                double a= input.nextDouble();
                double b= input.nextDouble();
                if (b != 0){
                    System.out.println("Sayıların bölümü : " +a/b);
                }else {
                    System.out.println("Payda 0 olamaz");
                }
                break;
            case '^':
                System.out.println("Lütfen taban ve üs değerlerini giriniz.");
                System.out.println("Sonuç : " +Math.pow(input.nextDouble(),input.nextDouble()));
                break;
            case '!':
                System.out.println("Lütfen faktöriyelini almak istediğiniz 10 dan küçük bir tam sayı giriniz");
                int sayi = input.nextInt();
                int carpim = 1;
                String str = sayi + "! = ";
                if (sayi<0 || sayi>10) {
                    System.out.println("Lütfen geçerli bir sayı giriniz.");
                }
                else {
                    for (int i = sayi; i >1; i--) {
                        str = str +i+"*";
                        carpim *= i;

                    }
                    System.out.println(str+"1 = "+carpim);
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir operatör giriniz ☺");
                break;

        }


    }
}
