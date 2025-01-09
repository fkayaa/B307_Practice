package day_02;

import java.util.Scanner;

public class C01_odev {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan 100 uzerinden notunu isteyin.
        // Not'u harf sistemine cevirip yazdirin.

        // 50’den kucukse "D",
        // =50  <60 arasi "C",
        // =60  <80 arasi "B",
        // =80’nin uzerinde ise "A"

        //1.Scanner obj olustur
        Scanner input = new Scanner(System.in);

        //2.adım kullanıcıya bilgi verelim
        System.out.println("Lütfen 100 üzerinden notunuzu giriniz");

        //3.adım uygun bir variable a atayalım
        double not = input.nextDouble();

        //4.adım kontrol

        if(not<0 || not>100){
            System.out.println("Geçersiz bir değer girdiniz.Lütfen tekrar giriniz.");
        }else if (not<50){
            System.out.println("Notunuz : D");

        } else if (not<60) {
            System.out.println("Notunuz : C");

        } else if (not<80) {
            System.out.println("Notunuz : B");

        }else {
            System.out.println("Notunuz : A");
        }


    }
}
