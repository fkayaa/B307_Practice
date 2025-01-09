package interviewday_02;

import java.util.Scanner;

public class C03_InterviewQuestion {
    public static void main(String[] args) {
         /*
        Print Reverse number in  java program
        Bir sayiyi tersten yazdıran programi yazınız
         */
        /*
        714532
        235417
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen ters cevirmek istediginiz sayiyi giriniz");
        int number= input.nextInt();
        int newNumber=0;

        for (int i = number; i>0 ; i/=10) {
            newNumber*=10;
            newNumber=newNumber+i%10;
            System.out.println("ters : "+newNumber);
        }

    }
}
