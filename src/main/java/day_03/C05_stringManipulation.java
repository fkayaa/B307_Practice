package day_03;

import java.util.Scanner;

public class C05_stringManipulation {
    public static void main(String[] args) {
                  /*
    Kullanicidan email adresini girmesini isteyin,
    mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
    @gmail.com ile bitiyorsa "Email adresiniz kaydedildi"
    @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
    bosluk karakteri varsada hata mesaji verin
*/
        //1.adım
        Scanner input=new Scanner(System.in);
        //2.adım
        System.out.println("Lütfen bir email adresi giriniz ☻");
        //3.adım
        String mail=input.nextLine();
        //4.adım kontrollere başlayabiliriz
        if (!mail.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz!!");
        } else if (mail.contains(" ")) {
            System.out.println("Mail boşluk karakteri iceremez");
        } else if (mail.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("Lütfen yazımı kontrol ediniz");
        }

    }
}