package day_04;

import java.util.Scanner;

public class C02_whileLoop {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        /*
        ternary-> kaç defa dönecegi belli mi ? (for) :(en az bir kere calışmalı mı?(do while):(while))
         */
        //1.adım
        Scanner input=new Scanner(System.in);

        //2.adım
        int sayi=0;
        int toplam=0;

        //3.adım
   /*     do {
            //4.adım
            System.out.println("Lütfen toplamak istediginiz sayilari giriniz siz 0'a basıncaya kadar toplamaya devam edicek ☻");
            sayi= input.nextInt();
            toplam+=sayi;
        }while (sayi!=0);
                System.out.println("Toplam : "+toplam);

*/

   /*     while(true){
            System.out.println("Lütfen toplamak istediginiz sayilari giriniz siz 0'a basıncaya kadar toplamaya devam edicek ☻");
            sayi= input.nextInt();
            toplam+=sayi;
            if (sayi==0){
                break;
            }
        }
        System.out.println("Toplam : "+toplam);
*/

    }
}