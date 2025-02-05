package day_07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exception {
    public static void main(String[] args) {
        //kullanıcıdan 2 tam sayi değeri alıp bölme işlemi gerçekleştiriniz
        Scanner input=new Scanner(System.in);

        try{
            System.out.println("Lütfen birinci tam sayiyi giriniz");
            int sayi1= getInput(input);//exception döndürmeden geçerli bir değer donduren method

            System.out.println("Lütfen ikinci tam sayiyi giriniz");
            int sayi2=getInput(input);

            System.out.println("Sonuç : "+sayi1/sayi2);

        }catch (ArithmeticException e){
            System.out.println("Hata : Sıfıra bölme yapılamaz!!!");
        }catch (Exception e){
            System.out.println("Beklenmeyen bir exception ile karşılaşıldı"+e.getMessage());
        }finally {
            System.out.println("Programı sonlandırılıyor");
            input.close();//kaynakları kapatma!!!
        }

    }

    private static int getInput(Scanner input) {
        while (true){
            try {
                return input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Geçersiz giriş!! Lütfen bir tam sayi değeri giriniz");
                input.nextLine();
            }
        }
    }
}