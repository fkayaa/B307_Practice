package day_01;
import java.util.Scanner;
public class C05_scanner {
    public static void main(String[] args) {
        //Soru : Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini(uzun*kısa*yukselik) hesaplayip yazdirin

        //1. adım scanner objesi olusturma
        Scanner input=new Scanner(System.in);
/*--> 1. YOL
        //2.adım bilgi vericez ki bilgi alabilelim
        System.out.println("Lütfen hesaplamak istediginiz dikdortgenler prizmasının kısa kenarını giriniz");

        //3.adım degerimizi kavanoza(variable'a)koymak
        float kisaKenar= input.nextFloat();

        //4.adım uzun kenarı isteyelim
        System.out.println("Lütfen hesaplamak istediginiz dikdortgenler prizmasının uzun kenarını giriniz");

        //5.adım degerimizi kavanoza(variable'a)koymak
        float uzunKenar= input.nextFloat();

        //6.adım yukseklik isteyelim
        System.out.println("Lütfen hesaplamak istediginiz dikdortgenler prizmasının yuksekligi giriniz");

        //7.adım degerimiz kavanoza(variable'a)koymak
        float yukseklik= input.nextFloat();

        //8.adım sonucu yazdıralım
        System.out.println("Sonuç : "+yukseklik*uzunKenar*kisaKenar);
*/
        //todo : ÖDEV!!! kısa kenarın uzun kenardan büyük girilme durumunu kontrol ediniz if yapısı kullanarak ☺


        //--> 2. YOL

        //2.adım kullancıdan bilgi istemek icin bilgi veriyorduk
        System.out.println("Lütfen hesaplamak istediğiniz dikdortgenler prizmasının sırasıyla kısa , uzun kenar ve yükseklik olucak sekilde giriniz");


        float kisaKenar= input.nextFloat()
                ,uzunKenar= input.nextFloat()
                ,yukseklik= input.nextFloat();

        if (kisaKenar>uzunKenar){
            System.out.println("Lütfen geçerli bir değer giriniz");
        }else {
            System.out.println("sonuc :" + yukseklik*uzunKenar*kisaKenar);
        }

        System.out.println("Sonuç : "+yukseklik*uzunKenar*kisaKenar);
        // input.close();



    }
}