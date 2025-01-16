package day_04;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
         /*
    1.soru bir array olusturun ve olusturdugunuz arraydeki
    tum elemanları yazdırın
    */
        String [] isimler={"Ali","Can","Veli","Han","Ömer","Faruk"};
        System.out.println("isimler = " + isimler);//Arrays classı yardımcı class
        System.out.println(Arrays.toString(isimler));
        System.out.println("isimler.length = " + isimler.length);

        for (String isim:isimler) {
            System.out.println(isim);
        }

    }
}
