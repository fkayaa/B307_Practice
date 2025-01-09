package interviewday_02;

import java.util.Scanner;

public class C02_InterviewQuestion {
    public static void main(String[] args) {
        // Kullanıcıdan bir pozitif tamsayı alın.
        // Bu sayıya kadar olan sayılardan asal sayıları bulmak için bir döngü kullanın.

        // Programın sonunda, asal sayıları ve toplam asal sayı miktarını yazdırın.
        // Ek olarak, asal sayılar arasındaki en büyük asal sayıyı da belirleyin ve yazdırın.

        //1.adım scanner
        Scanner input=new Scanner(System.in);

        //2.adım kullanıcıya bilgi
        System.out.println("Lütfen pozitif bir tamsayi giriniz");

        //3.adım
        int tamsayi= input.nextInt();

        int count=0;
        int largestPrime=0;
        int sayac=0;
        //4.adım
        if (tamsayi>1){
            for (int i = 2; i <=tamsayi ; i++) {//sırasıyla 2'den tamsayıya
                //for ve icinde kontrol
                //kendisine veya 1'e bolunme
                for (int j = 2; j <=Math.sqrt(i) ; j++) {
                    if (i%j==0){//asal değildir
                        sayac++;//tam bolen sayı oldugu surece artıcak
                    }
                }
                if (sayac==0){
                    System.out.println("Asal sayilardır : "+i);
                    count++;
                    largestPrime=i;
                }
                sayac=0;
            }
            System.out.println("toplam asal sayi : "+count);
            System.out.println("En büyük Asal Sayi : "+largestPrime);
        }else {
            System.out.println("Lütfen 1'den büyük bir sayi giriniz 🤔");
        }
    }
}
