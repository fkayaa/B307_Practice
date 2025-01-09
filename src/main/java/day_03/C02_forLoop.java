package day_03;

public class C02_forLoop {
    public static void main(String[] args) {
        // belirtilen sayının 1 den 10 a kadar çarpım sonuclarını yazınız.

       /*

       int n = 6;
        for (int i = 1; i <11 ; i++) {

            System.out.println(i +" * "+n + " = "  + i * n );

        }

        */


        //uygulamaya bir güncelleme geldi 10x10lük bir carpım tablosu olusturalım


        for (int i = 1; i <=10 ; i++) {//10 tane tekrari tekrarlayan döngü
            for (int j = 1; j <=10 ; j++) {//1 sayinin 1-10'a kadar carpimlarını bulan dongu
                System.out.print(j+" * "+ i +" = "+ i*j + "\t");
            }
            System.out.println("\n------------------------------------------------");

        }

    }

}

