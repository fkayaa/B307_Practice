package day_05;

import java.util.Arrays;

public class C03_odev {
    public static void main(String[] args) {
         /*
         Asagidaki multi dimensional array'in
         ic array'lerindeki tum elemanlarin toplamini birer birer bulan
         ve herbir sonucu yeni bir array'in elemani yapan
         ve yeni array'i ekrana yazdiran bir program yaziniz
         Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
         */

        int [][]arrayler={{1,2,3},{4,5},{6, 7},{8,9,10}};//4
        int [] d=new int[arrayler.length];//4
        int toplam=0;
        for (int i = 0; i < arrayler.length; i++) {
            for (int a:arrayler[i]){
                toplam+=a;
            }
            d[i]=toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(d));
    }
}