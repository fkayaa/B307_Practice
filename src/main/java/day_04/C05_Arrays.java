package day_04;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        /*
        2.soru bir array olusturun ve
        olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
       */

        int [] sayilar={3,93,18,34,41,38,1907,77,55,44,25,7,58};
        System.out.println("Sıralamadan önce  : "+Arrays.toString(sayilar));
        //1.yol
        Arrays.sort(sayilar);//natural order(doğal sıralama)
        System.out.println("Sıralamadan sonra : "+Arrays.toString(sayilar));

        //2.yol döngü kullanılarakta yapılabilir
        //todo gelcek haftaya ödev!!!



    }
}
