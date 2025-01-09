package interviewday_01;

public class C02_InterviewQuestion {
    public static void main(String[] args) {
        /*
         Java'da 2 degisken nasıl değiştirilir?
         How to swap 2 variables in Java?
         */
        int a=5;
        int b=10;

        System.out.println("a = " + a);//5
        System.out.println("b = " + b);//10

        // System.out.println("1. swap işleminden sonra : ");
        //1.yol

        //   int c=a;//c=5;
        //   a=b;//a=10;
        //   b=c;//b=5;

        //  System.out.println("a = " + a);//10
        //  System.out.println("b = " + b);//5
/*
        System.out.println("2. swap işleminden sonra : ");

        //2.yol
        a=a+b;//a=15;
        b=a-b;//b=5;
        a=a-b;//a=10;

        System.out.println("a = " + a);//10
        System.out.println("b = " + b);//5

*/
        //3.yol
        //Mantıksal XOR
        /*
        0 ^ 0 = 0
        0 ^ 1 = 1
        1 ^ 0 = 1
        1 ^ 1 = 0
         */
        System.out.println("3. swap işleminden sonra : ");

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a = " + a);//10
        System.out.println("b = " + b);//5
    }
}