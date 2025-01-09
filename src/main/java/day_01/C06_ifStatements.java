package day_01;

import java.util.Scanner;

public class C06_ifStatements {
    public static void main(String[] args) {
        //if eğer demektir , else değilse demektir.

        //Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        //1.adım scanner objesi olusturmak
        Scanner input=new Scanner(System.in);

        //2.adım kullanıcan bilgi almak icin bilgi verelim
        System.out.println("Lütfen bir tam sayi giriniz. ☻");

        //3.adım uygun bir variable'a atamam gerekiyor
        int sayi= input.nextInt();

        //4.adım kontrol işlemi yapmak
        if (sayi%2==0){
            System.out.println("Çifttir");
        }else {
            System.out.println("Tektir");
        }

        //else if degilse eger

        //-----------------------------------------------------------------

        //Kullanicidan alinan bir sayinin pozitif,
        //negatif veya notr oldugunu kontrol eden kodu yaziniz


        //1.adım scanner objesi olusturmak fakat halihazırda zaten bir tane var o zmn olusturmaya gerek yok
        //Scanner input1=new Scanner(System.in);


        //2.adım bilgi ver ki bilgi alabil.
        System.out.println("Lütfen bir sayi giriniz");

        //3.adım uygun bir variable'a atamak
        double number= input.nextDouble();

        //4.adım kontrol sağlamak
        if (number>0){
            System.out.println("Bu sayi pozitiftir");
        } else if (number<0) {
            System.out.println("Bu sayi negatiftir");
        }else {
            System.out.println("Nötrdür");
        }



    }
}