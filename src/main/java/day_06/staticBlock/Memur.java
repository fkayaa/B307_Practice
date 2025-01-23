package day_06.staticBlock;

import java.util.Scanner;

public class Memur {
    public int id;

    public String name;
    private static int sayac;

    public Memur(){
//        this.id=sayac;
//        sayac++;
    }

    public Memur(String name) {
//        this.id=sayac;
//        sayac++;
        this.name = name;
    }

    {//instance block obje oluşturuldugunda cağrılır
        System.out.println("instance block calıstı!!");
        this.id=sayac;
        sayac++;
    }

    static {//static block her seyden herkesten once calsiir ve icerisine sadece static variablelari kabul eder
        //statick block genellikle bir deger atamasi olacaksa kullanilir.
        System.out.println("Static block calıstı!!");
        sayac=100;
    }

}