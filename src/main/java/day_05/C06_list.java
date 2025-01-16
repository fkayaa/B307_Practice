package day_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C06_list {
    public static void main(String[] args) {
         /*
        icinde 200 tane birbirinden farkli 1000'den kucuk pozitif tamsayi olan bir list olusturun  1-1000

        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
        */

        List<Integer>mylist=new ArrayList<>();
        Random rnd=new Random();
        Scanner input=new Scanner(System.in);

        while (mylist.size()<200) {
            int sayi= rnd.nextInt(1001);
            if (!mylist.contains(sayi)){
                mylist.add(sayi);
            }
        }

        // for (int i = 1; i <=200 ; i++) {//200+tekrar eden sayilar kadar
        //     {
        //         int sayi= rnd.nextInt(1001);
        //         if (!mylist.contains(sayi)){
        //             mylist.add(sayi);
        //         }else {
        //            i--;
        //         }
        //     }
        // }
/*
        System.out.println(mylist.size());
        System.out.println(mylist);
*/
        System.out.println("Lütfen listede var olup olmadıgı kontrol etmek istediginiz sayiyi giriniz");
        int sayi= input.nextInt();
        if (mylist.contains(sayi)){
            System.out.println("Evet aradıgınız sayi listede var!!");
        }else {
            System.out.println("Hayır aradıgınız sayi listede yok!!");
        }

    }
}