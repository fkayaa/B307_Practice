package day_06.inheritance;

public class Parent {

    public static String name="Ali";
    public static String lastName="Can";

    public static void method1(){
        System.out.println("Parent classtaki static olan method 1");
    }
    public static void method2(){
        System.out.println("Parent classtaki static olan method 2");
    }

    public int yas=22;//instance

    public void method3(){
        System.out.println("Parent classtaki static olmayan method 3");
    }
    public void method4(){
        System.out.println("Parent classtaki static olmayan method 4");
    }

    public Parent(int yas) {
        this.yas = yas;
    }

    public Parent() {
    }
}