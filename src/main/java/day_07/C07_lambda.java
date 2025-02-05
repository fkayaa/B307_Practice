package day_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_lambda {
    public static void main(String[] args) {
        //3)Bir list'teki “tekrarsiz","7'den buyuk" elemanlarin "karelerinin"
        // "toplamını" hesaplayan method oluşturun
        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,7,11,23,12,14,47,58,91,37,37,23,8,11,1,23,23,8));
        yedidenBuyukKareToplam(mylist);

    }

    private static void yedidenBuyukKareToplam(List<Integer> mylist) {
        int topl=mylist.stream().distinct().filter(t->t>7).map(t->t*t).reduce(0, Integer::sum);
        mylist.stream().distinct().filter(t->t>7).map(t->t*t).forEach(System.out::println);

        System.out.println("Toplam : "+topl);
    }
}