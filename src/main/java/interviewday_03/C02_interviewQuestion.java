package interviewday_03;

import java.util.Scanner;

public class C02_interviewQuestion {
    public static void main(String[] args) {
        // bir cümlenin kelimelerini sayacak, her kelimeyi ters çevirecek kodu yazınız
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String str= input.nextLine();

        String kelimeler[]=str.split(" ");

        //cümledeki kelime sayısını verir
        System.out.println("Cümledeki kelime sayisi : "+kelimeler.length);

        System.out.println("Kelimelerin ters çevrilmiş hali : ");
        for (String kelime:kelimeler) {

            for (int i = kelime.length()-1; i >=0 ; i--) {
                System.out.print(kelime.charAt(i));
            }
            System.out.print(" ");
        }


    }
}
