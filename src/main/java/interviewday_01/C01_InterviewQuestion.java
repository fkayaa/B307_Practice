package interviewday_01;

import java.util.Scanner;

public class C01_InterviewQuestion {

    public static void main(String[] args) {
         /*//Interview question
         How to convert Fahrenheit  to Celsius
         Program in java
          */
         /*//Interview sorusu
        java'da nasıl fahrenheit celcius'a cevrilir
          */


        double derece;
        Scanner input = new Scanner(System.in);
        System.out.println("dereceyi fahrenheit olarak giriniz.");
        derece= input.nextDouble();

        double celcius = (derece-32)/180*100;
        System.out.println("Celcius cinsinden derece : " + celcius);
        System.out.println("Celcius cinsinden derece : "+String.format("%.2f",derece));


    }



}
