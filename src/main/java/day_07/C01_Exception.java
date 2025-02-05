package day_07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exception {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");

        try {
            int age = input.nextInt();
            System.out.println(10/age);
        }catch (InputMismatchException e){
            System.out.println("Lütfen sayı ile belirtiniz ");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("payda 0 olamaz");
        }

        System.out.println("kodumuz çalışmaya devam ediyor mu?");


        // AritmeticException : sifira bolme basta olmak uzere matematiksel hatalari belirtir
        // NullpointerException : Henüz deger atamasi yapmadigmiz degiskenler uzerinde islem yapmaya calisirsak dondurur
        // IndexOutOfBoundsException: Hatalı indeks erişimlerinde fırlatılır.
        // ClassCastException: Geçersiz tür dönüşümü işlemlerinde fırlatılır.
        // IllegalArgumentException: Metoda verilen parametrelerden biri hatalı olduğunda fırlatılır.
        // NumberFormatException: Bir String değerini sayısal bir türe dönüştürmeye çalıştığımızda, eğer String değer düzgün bir sayı ifade etmiyorsa fırlatılır.
        // ArrayIndexOutOfBoundsException: Bir dizinin aralığı dışında elemanına erişmeye çalışıldığında fırlatılır.
        // StringIndexOutOfBoundsException: Bir String index'inin disina cikarsak aldigimiz hata
        // UnsupportedOperationException: Desteklenmeyen bir iş yapmaya çalışıldığında fırlatılır.
        // StackOverFlowException: uygulama çok yuklenirsek karşılaşırız.


    }
}