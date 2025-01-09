package day_02;

import java.util.Scanner;

public class C06_ternary {
    public static void main(String[] args) {
        //bir sayinin tek mi cift oldugunu kontrol ediniz

        //Koşul ?(true code) :(false code);

        //1.adım
        Scanner input=new Scanner(System.in);

        //2.adım bilgi almak için bilgi ver
        System.out.println("Lütfen bir tam sayi giriniz");

        //3.adım uygun bir variable'a atayalım
        int sayi= input.nextInt();

        //4.adım kontrolu

        String sonuc=sayi%2==0?"Cift sayi":"Tek Sayi";
        System.out.println("sonuc = " + sonuc);




    }
}
