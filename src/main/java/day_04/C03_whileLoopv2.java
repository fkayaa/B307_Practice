package day_04;

import java.util.Random;
import java.util.Scanner;

public class C03_whileLoopv2 {
    public static void main(String[] args) {
        Random rnd=new Random();
        int rndsayi =rnd.nextInt(100)+1;//101'den kücük rastgele sayı üretir //0 dahil edilmez
        //int rndsayi =rnd.nextInt(101);//0 dahil edilir

        Scanner input=new Scanner(System.in);

        int sayac=0;
        for (int tahminHakki = 4; tahminHakki >=0 ; tahminHakki--) {
            System.out.println("Lütfen tahminde bulunmak için 0-101 arasında bir sayi giriniz");
            int sayi=input.nextInt();
            sayac++;
            if (rndsayi>sayi){
                System.out.println("Daha Büyük bir değer giriniz");
            } else if (rndsayi<sayi) {
                System.out.println("Daha Küçük bir değer giriniz");
            }else {
                System.out.println("Tebrikler "+sayac+". tahminde doğru buldunuz");
                break;
            }
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


        }
    }
}
