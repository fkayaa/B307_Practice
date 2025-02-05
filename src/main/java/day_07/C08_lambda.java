package day_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_lambda {
    public static void main(String[] args) {
        /*
       4)bir listedeki elemanlardan 3'e bolunenlerin
       ilk once kupunu alıp sonra bunlarin toplamını bulan bir method olusturun
       */
        List<Integer> mylist=new ArrayList<>
                (Arrays.asList(1,7,11,23,12,14,47,58,91,37,37,23,8,11,1,23,23,8));
        uceBolunenKupToplami(mylist);
        int a=5;
        double b=a;
        //Double c=a;

    }

    private static void uceBolunenKupToplami(List<Integer> mylist) {
        int sum=mylist.stream().filter(t->t%3==0).map(t->(int)Math.pow(t,3)).reduce(0, Integer::sum);
        double topl=mylist.stream().filter(t->t%3==0).map(t->Math.pow(t,3)).reduce(0.0, Double::sum);
        System.out.println("sonuc1 : "+sum);
        System.out.println("sonuc2 : "+topl);
    }
}