package day_01;

public class C02_concatination {
    public static void main(String[] args) {
        /*
        Java da '+' sembolu iki sayi arasinda kullanılıyorsa "toplama islemi" olur
        Java da '+' sembolu iki string ya da bir string ve bir sayi arasında kullanılıyorsa concatination işlemi olur.
        concat. islemi birleştirme yapar
        //Not: Concatenation islemlerinde Java matematikteki islem onceligini kullanir
        //Java daima yukarıdan asagıya ve soldan sag dogru ilerler islemleri yapar
         */
        /*
        matematikteki islem oncelikleri :
        1)parantez ici islemleri yapar
        2)us alma islemleri yapılır
        3)carpma ve bolme islemleri
        4)toplama ve cıkarma islemleri
        5)eger ayni oncelige sahipse soldan saga dogru islemler sirasiyla yapılır.
         */

        String ifade1="Ali Can ";

        char ifade2='?';

        String ifade3="topu bana ";

        String ifade4=" kere atar mısın";

        int ifade5=3;

        int ifade6=6;

        //yukarıdaki ifadelerle anlamlı bir cumle olusturalım

        System.out.println(ifade1 + ifade3 + ifade5 + ifade6 + ifade4 + ifade2);
        //Ali Can topu bana 9 kere atar mısın?

        //Ali Can topu bana 36 kere atar mısın?

    }
}