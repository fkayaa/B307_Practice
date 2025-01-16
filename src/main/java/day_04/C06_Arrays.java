package day_04;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
            /*
        3.soru Verilen arrayin tum elemanlarini bir soldaki konuma tasiyacak
        bir program yazin. Ornek; array ((1,2,3,4,5)) ise output (2,3,4,5,1) olacak
        */
        String array[]={"4","2","3","5","1"};


        System.out.println(Arrays.toString(array));
        //fori
        String a=array[0];
        for (int i = 0; i < array.length-1; i++) {
            array[i]=array[i+1];
            System.out.println(Arrays.toString(array));
        }
        array[array.length-1]=a;
        System.out.println(Arrays.toString(array));


    }
}