package day_04;

import java.util.Arrays;

public class C07_Arrays {
    public static void main(String[] args) {
         /*
        4.soru Verilen bir int array'deki
        en buyuk sayiyi yazdiran bir java kodu olusturun.
        */
        int[] sayi={454,212,83,0,47,5555,25,33,17,7,3,9,67,-93,-54};
        System.out.println("Sıralamadan önce  : " + Arrays.toString(sayi));


        //1.yol
        //Arrays.sort(sayi);//kucukten buyuge dogru sıralama
        //System.out.println("Max sayi : "+sayi[sayi.length-1]);

        //2.yol Math.max+döngü yardımı ile bulunabilir





        //todo ÖDEV!!!!
        
        //2.yol Math.max+döngü yardımı ile bulunabilir

      int max = sayi[0];
      for (int w : sayi) {

          max = Math.max(max , w);

      }
        System.out.println("maximum sayı  = " + max);

    }
}

