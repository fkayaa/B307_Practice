package day_05;

public class C02_odev {
    public static void main(String[] args) {
           /*
        4.soru Verilen bir int array'deki
        en buyuk sayiyi yazdiran bir java kodu olusturun.
        */// Math.max+döngü yardımı ile bulunabilir

        int[] sayi={454,212,83,0,47,5555,25,33,17,7,3,9,67,-93,-54};

        int arraydekiMaxSayi=maxSayi(sayi);
        System.out.println("arraydekiMaxSayi = " + arraydekiMaxSayi);

    }

    public static int maxSayi(int[] sayi) {
        int max=sayi[0];

        for (int number:sayi){
            max=Math.max(max,number);
        }
        return max;
    }
}