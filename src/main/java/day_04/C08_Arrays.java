package day_04;

import java.util.Scanner;

public class C08_Arrays {
    public static void main(String[] args) {
        /*
        5.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
        true veya false sonucu donen bir java kodu olusturun
         */
        String [] isimler={"Ali","Can","Veli","Han","Ömer","Faruk"};
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen aramak istediğiniz elemani giriniz");
        String arananIsim= input.nextLine();
        boolean sonuc=false;
        for (String isim:isimler) {
            if (isim.equalsIgnoreCase(arananIsim)){
                sonuc=true;
            }
        }
        System.out.println(sonuc);
    }
}