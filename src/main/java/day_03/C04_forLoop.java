package day_03;

public class C04_forLoop {
    public static void main(String[] args) {

        /*





         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *


         *//*
        //1.yol
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
*//*
        //2.yol
        for (int i = 1; i <=5 ; i++) {
            System.out.println("* * * * *");
        }

        //3.yol
        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=5 ; j++) {sutun
                System.out.print("* ");
            }
            System.out.println();
        }

        */


        /*

        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .

        *//*

        int satir=5;

        for (int bulsatir = 1; bulsatir <=satir ; bulsatir++) {

            for (int yildiz = satir-bulsatir; yildiz>0 ; yildiz--) {//yıldız
                System.out.print("* ");
            }

            for (int nokta = bulsatir; nokta >0 ; nokta--) {
                System.out.print(". ");
            }
            System.out.println();

        }

*/

        /*

         * * * * *
         * . . . *
         * . . . *
         * . . . *
         * * * * *

         */

        int satir=10;

        for (int bulsatir = 1; bulsatir <=satir ; bulsatir++) {//bulunduğumuz satırı temsil ediyor
            if (bulsatir==1||bulsatir==satir){//bulundugum satir eğer ilk satır veya son satir ise
                for (int yildiz = satir; yildiz >0 ; yildiz--) {
                    System.out.print("* ");
                }

            }else {//diğer satırlarda
                System.out.print("* ");
                for (int i = satir-2; i >0 ; i--) {
                    System.out.print(". ");
                }
                System.out.print("* ");

            }
            System.out.println();

        }


    }
}