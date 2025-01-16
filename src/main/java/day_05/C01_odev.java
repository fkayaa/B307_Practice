package day_05;

import java.util.Arrays;

public class C01_odev {
    public static void main(String[] args) {
         /*
        2.soru bir array olusturun ve
        olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
        dongu kullanarak yada Arrays.sort() methodunu kullanmadan
       */
        int [] sayilar={3,93,18,34,41,38,1907,77,55,44,25,7,58};
        sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
    }


    //public static void sort(int [] array){//kendi sort methodum
    //    int n= array.length;//n=eleman sayisi
    //    //dizi boyunca karşılaştırma yapıyorz
    //    for (int i = 0; i < n-1 ; i++) {
    //        for (int j = 0; j < n-i-1; j++) {//daha az döngü
    //            //swap işlemi
    //            if (array[j]>array[j+1]){
    //                int temp=array[j];
    //                array[j]=array[j+1];
    //                array[j+1]=temp;
    //            }
    //            System.out.println(Arrays.toString(array));
    //        }
    //    }
    //}//bu method en büyük değeri en sona koyarak calısıyor!!!



    public static void sort(int [] sayilar){//kendi sort methodum
        int a;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i + 1; j < sayilar.length; j++) {
                if (sayilar[i] > sayilar[j]) {
                    a = sayilar[i];
                    sayilar[i] = sayilar[j];
                    sayilar[j] = a;
                }
                System.out.println(Arrays.toString(sayilar));
            }
        }

    }//bu method en kucuk degeri en başa koyarak calısıyor!!!
}