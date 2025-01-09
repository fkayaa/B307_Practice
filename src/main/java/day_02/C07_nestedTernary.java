package day_02;

import java.util.Scanner;

public class C07_nestedTernary {
    public static void main(String[] args) {
        //nested : iç içe geçmiş yapılar
        //Ternary :ikili kontrol (if-else)

        //bir sayının pozitif veya negatif olup olmadığını ve
        //aynı zamanda tek mi çift mi olduğunu belirleyin

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz.");

        int sayi = input.nextInt();

        //nested ternary ile :
        String sonuc = sayi==0?"Sayı Nötr Çifttir" : sayi>0 ? ((sayi%2==0)?("Pozitif Çifttir"):("Pozitif Tektir")) : ((sayi%2==0)?("Negatif Çifttir"):("Negatif Tektir"));
        System.out.println("sonuc = " + sonuc);

        //if-else ile:
        if (sayi>0){
            if (sayi%2==0){
                System.out.println("Pozitif Çifttir");
            }else{
                System.out.println("Pozitif Tektir");
            }
        } else if (sayi ==0) {
            System.out.println("Sayı Nötr Çifttir");
        } else {
            if (sayi%2==0){
                System.out.println("Negatif Çifttir");
            }else {
                System.out.println("Negatif Tektir");
            }
        }

    }
}
