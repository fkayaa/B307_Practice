package day_01;

public class C01_variables {
    public static void main(String[] args) {//psvm-main
        //2 tanedirler primitive ve non-primitive olmak üzere icersinde kucuk degerler saklanır
        //pasif özellikleri

        /*
        Not 1 : primitive data type'lar java tarafından olusturulmustur,biz olusturamıyoruz
        Not 2 : primitive data type'larin isimlerinin tum harfleri kücük harften olusur
        Not 3 : primitive data type'larin her biri memory(hafiza'da) farklı yer kaplar
        Not 4 : primitive data type'lar sadece icerisine girilen degeri korur.

        PRIMITIVE:
        Tam Sayilar :
        byte
        short
        int
        long

        ondalıklı sayilar :
        float
        double

        karakter için :
        char

        mantıksal operator :
        boolean

        NON-PRIMITIVE :
        String
        C01_variables
        Wrapper-classlar
        Scanner
        ve tüm olusturulmuş ve olusturulan classlar!!!




         */

        //iki sayinin toplamini yeni bir degere atayanizi ve yazdiriniz

        int a=5;
        double b=4.3;

        double c=a+b;

        System.out.println("toplam = " + c);
        //eğer ondalıklı sayi ile işlem yapılıyorsa double dondurur

        //eğer tam sayi ile işlem yapıyorsam int dondurur(long hariç)
/*
        short x=2;
        short y=7;

        int sum=x+y;
        System.out.println("sum = " + sum);

*/
        //ayni sayilari toplayip sadece tam kismini alin

        //type casting--> neden önerilmez!!!
        int     d  =  (int)  (a+b);//9,3
        System.out.println("d = " + d);//9


        double x=55.7;
        double y=22.9;

        int e= (int)x + (int)y;//77
        System.out.println("e = " + e);

        int k=(int) (x+y);//78 //100 TL kayıp bundan kaynaklı onerilmez!!!
        System.out.println("k = " + k);

        double f= x+y;
        System.out.println("f = " + f);



    }
}