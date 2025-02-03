package interviewday_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class C01_interviewquestion {
    public static void main(String[] args) {
        /*
        Lambda nedir?
        -> lambda operatoru
        daha fonksiyonel kodlar yazmayı sağlarız
        daha kısa ve daha verimli kodlar yazması sağlarız
        Örnek:
         //"Bir tamsayı listesindeki pozitif sayıların karelerini hesaplayan bir Java metodu yazın.
        // Lambda ifadelerini ve akış (stream) API'sini kullanarak bu işlemi gerçekleştirin."

        Lambda Listlerde nasıl kullanılır?
        stream akışına alarak
        eğerki bir fonksiyon cağrılarak işlem yaptırılmak istenirse bu durumda
        t ->(lambda operatoru) kullanarak elemanlarımız uzerinde
        manipulation işlemlerini gerçekleştirdik



         */
        List<Integer>number= Arrays.asList(1,2,3,4,5,6,7,8,9,-1,-2,-3,4,-877,-64,-43,32,-32,-66);
        kareHesapla(number);
    }

    public static void kareHesapla(List<Integer> number) {
        List<Integer>newList=number.stream().
                filter(t -> t>0).
                map(t->t*t).
                collect(Collectors.toList());
        System.out.println(newList);
    }

//    public static void kareHesapla(List<Integer> number) {
//        List<Integer>newlist=new ArrayList<>();
//        for (int a:number) {
//            if (a>0){
//                newlist.add(a*a);
//            }
//        }
//        System.out.println("List : "+newlist);
//    }

}