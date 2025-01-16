package interviewday_03;

import java.util.Arrays;
import java.util.Scanner;

public class C03_interviewQuestion {

    public static void main(String[] args) {
        /*
    Bir metin içinde kullanıcıdan alınan bir kelimenin
    kaç kez geçtiğini sayan bir Java kodu yazın.
    Metin büyük/küçük harf duyarlı olmamalıdır.
    Örnek girdi olarak 'Java, Java, and java!' verildiğinde kullanıcı java girerse,
    çıktı olarak 3 verilmelidir
     */
        String cumle="Java,Java, and java!";

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen bir kelime giriniz");

        String str= input.next().toLowerCase();

        //1.yol array olmadan
        cumle=cumle.toLowerCase();//büyük kücük duyarsız olması
/*
        int count=0;//kelimelerimi sayıcak
        int index=0;//indexlerimi sayıcak
        while((index=cumle.indexOf(str,index))!=-1){
            count++;
            System.out.println("artirmadan once : "+index);
            System.out.println("----------------------");
            index+=str.length();
            System.out.println("artirdiktan sonra : "+index);
            System.out.println("----------------------------------");
        }
        System.out.println("Toplam kelime sayisi : "+count);
*/
        //"Java, Java, and java!"
        //2.yol array olunca
        cumle=cumle.replaceAll("[^a-z]"," ");//"Java,Java, and java!"->"Java Java  and java "
        cumle=cumle.replace("  "," ");//"Java Java  and java "->"Java Java and java "
        String kelimeler[]=cumle.split(" ");
        //System.out.println(Arrays.toString(kelimeler));
        int sayac=0;
        for (String kelime:kelimeler) {
            if (str.equals(kelime)){
                sayac++;
            }
        }
        System.out.println("bu kelimeden "+sayac+" tane vardır!");



    }
}
