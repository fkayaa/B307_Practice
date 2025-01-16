package day_05;

import java.util.List;

public class C05_list {
    public static void main(String[] args) {
        // bir listede ortalamanin ustunde olan eleman sayisini bulunuz
        List<Double> mylist=List.of(1.5,3.14,1.8,57.57,37.0,13.5);
        //elemanların toplamı
        //eleman sayisi
        double sum=0;
        for (double a:mylist){
            sum+=a;
        }
        double ort=sum/mylist.size();
        System.out.println(ort);//19.085

        int sayac=0;

        for (double a:mylist){
            if (a>ort){
                sayac++;
            }
        }
        System.out.println("sayac = " + sayac);

    }
}