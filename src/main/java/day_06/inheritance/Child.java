package day_06.inheritance;

import java.util.Scanner;




public class Child extends Parent{
    public int yas=5;
    public static String name="Veli";
    public int grade=60;

    @Override
    public void method4() {
        System.out.println("Childda bulunan static olmayan method 4");
    }
    public void method5() {
        System.out.println("Childda bulunan static olmayan method 5");
    }

    public static void main(String[] args) {
        System.out.println(name);//Veli
        System.out.println(Child.lastName);//Can
        Child.method1();
        Child.method2();

        System.out.println(Parent.name);//Ali
        System.out.println(lastName);//Can
        Parent.method1();
        Parent.method2();

        //yukarıkiler icin obje olusturmama gerek yok!!!
        //static özellikler class ismi ile direkt olarak cağrılır
        //static özellikleri genellikle ya yardımcı class olusturmak icin ya da class icerisinde ayarlama yapmak icin kullanılır
        Parent parent=new Parent();
        Child child=new Child();
        System.out.println(parent.yas);//22
        System.out.println(child.yas);//5

        parent.method4();//Parent classtaki static olmayan method 4
        child.method4();//Childda bulunan static olmayan method 4
        child.method3();//Parent classtaki static olmayan method 3
        //obje.method1();//kullanımı tercih edilmez!!!

        //TUR ESNEKLIGI
        Parent obje1 = new Child();  //parent in tum ozelliklerini al
        //eger bir guncelleme yani override olduysa da guncellenmis halini almaya yarar


        System.out.println(obje1.yas);//22
        obje1.method3();
        obje1.method4();

    }
}