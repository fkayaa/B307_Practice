package day_02;

import java.util.Scanner;

public class C02_nestedIf {
    public static void main(String[] args) {
        // bir kisinin kan bagisinda bulunup bulunamayacigini kontrol ediniz .
        // yas:18 ve uzeri olmali
        // kilo : 50 ve  üstü olmali


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz.");
        byte age = input.nextByte();

        if (age>=18){
            System.out.println("Lütfen kilonuzu giriniz.");
            double kilo = input.nextDouble();

            if (kilo>=50){
                System.out.println("Lütfen aşağıdaki formu doldurunuz.");
                System.out.println("..................................");
            }else {
                System.out.println("Kilonuz kan vermeye uygun değil.");
            }
        }else {
            System.out.println("Yaşınız kan vermeye uygun değil.");
        }

    }
}
