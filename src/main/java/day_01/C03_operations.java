package day_01;

public class C03_operations {
    public static void main(String[] args) {
        //aritmatik operatorler(matematiksel işlemler)
        //mantıksal operatorler
        //karşılaştırma operatorler
        //atama operatorleri
        //artırma azaltma operatorleri



        boolean sonuc1 = 5 > 4 && 7 < 9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println(sonuc1);//true

        boolean sonuc2 = 5 > 4 && 7 > 9 && 6 + 3 == 9 && 5 + 2 != 8;//&& kullanıyorsam tek bir false yakaladıktan sonra devamına bakılmasına gerek yok.
        System.out.println(sonuc2);//false

        boolean sonuc3 = 5 > 4 & 7 > 9 & 6 + 3 == 9 & 5 + 2 != 8;//& kullanıyorsam butun ifadeleri kontrol etmeliyim
        System.out.println(sonuc3);//false

        boolean sonuc4 = 5 > 4 | 7 > 9 | 6 + 3 == 9 & 5 + 2 != 8;//
        System.out.println(sonuc4);//true


        int sayi1 = 40;
        int sayi2 = 60;
        int sayi3 = 30;

        System.out.println(sayi1 > 30 && sayi1 < 70);//true

        System.out.println(sayi3 < 100 || sayi2 > 80);//true

        System.out.println(sayi2 >= 60 && sayi3 != 70);//true

        System.out.println(sayi3 != sayi2 && sayi2 > sayi1);//true

        System.out.println(sayi2 < 30 || sayi2 > 50 && sayi2 == 70);//false


    }
}