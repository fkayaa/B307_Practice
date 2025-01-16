package day_04;

import java.util.Random;
import java.util.Scanner;

public class C03_whileLoop {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        // kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin

        Random rnd=new Random();
        int rndsayi =rnd.nextInt(101);//101'den kücük rastgele sayı üretir

        Scanner input=new Scanner(System.in);

       /* int tahminHakki=5;
        int yaptigiTahmin=0;
        while (tahminHakki>0){
            System.out.println("Lütfen tahminde bulunmak için 0-101 arasında bir sayi giriniz");
            int number=input.nextInt();
            yaptigiTahmin++;
            if (rndsayi>number){
                System.out.println("Daha büyük değer giriniz");
            } else if (rndsayi<number) {
                System.out.println("Daha küçük değer giriniz");
            }else {
                System.out.println("Tebrikler "+yaptigiTahmin+". tahminde doğru buldunuz ☻");
            break;
            }
            tahminHakki--;
            System.out.println("Kalan tahmin hakkınız : "+tahminHakki);
            if (tahminHakki==0){
                System.out.println("Tahmin hakkınız bitmiştir yeni 3 tahmin hakkı ister misin?" +
                        "\nevet icin 'e' \nhayır için 'h'");
                String str= input.next();
                if (str.equalsIgnoreCase("e")){
                    tahminHakki+=3;
                }else {
                    System.out.println("Görüşmek üzere tekrar bekleriz ♥");
                }
            }
        }*/






    }
}