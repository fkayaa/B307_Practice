package day_02;

import java.util.Scanner;

public class C04_ternary {
    public static void main(String[] args) {
        //   verilen sayi 100'den buyukse sayi'nin karesini  alip yazdiran
        //   100'den kucukse " sayi 100'den buyuk olmalidir" yazdiran
        //   bir ternary olusturalim

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int sayi = input.nextInt();

        Object sonuc = sayi>100 ? (sayi*sayi) : "Sayı 100 den büyük olmalıdır.";
        System.out.println("sonuc = " + sonuc);


    }
}
