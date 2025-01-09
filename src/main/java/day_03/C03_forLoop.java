package day_03;

import java.util.Scanner;

public class C03_forLoop {
    public static void main(String[] args) {
        // kullanicidan 10'dan kucuk bir tam sayi isteyin ve girilen sayinin faktoryelini bulun.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 10 dan küçük bir tam sayı giriniz");

        int sayi = input.nextInt();
        int carpim = 1;
        String str = sayi + "! = ";
        if (sayi<0 || sayi>10) {
            System.out.println("Lütfen geçerli bir sayı giriniz.");
        }
        else {
            for (int i = sayi; i >1; i--) {
                str = str +i+"*";
                carpim *= i;

            }
            System.out.println(str+"1 = "+carpim);
        }


        //todo biz hesap makinesi olusturduk ,olusturdugumuz hesap makinesine ekleyelim--eklendi day02 de C03_switch  te


    }
}
