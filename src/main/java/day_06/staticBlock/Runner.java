package day_06.staticBlock;

public class Runner {
    public static void main(String[] args) {
        Memur memur1=new Memur("Ali");
        Memur memur2=new Memur();
        Memur memur3=new Memur("Veli");
        System.out.println("memur1.id = " + memur1.id);//3568
        System.out.println("memur2.id = " + memur2.id);//3569
        System.out.println("memur3.id = " + memur3.id);//3570

    }
}