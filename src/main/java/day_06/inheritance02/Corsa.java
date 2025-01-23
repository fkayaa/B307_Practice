package day_06.inheritance02;

public class Corsa extends Opel{
    public String model="Corsa";
    public String renk;//başlangıç değeri cunku her objede değişik olabilir
    public String hiz="Corsa arabalar max. hız 200KM";
    public String yakit="Corsa arabalar benzin-lpgLidir";

    public void motor(){
        System.out.println("Corsa arabalar cevreci motor kullanmaktadır!!");
    }
    public void vitesSayisi(){
        System.out.println("Corsa arabalar 5 vitese sahiptir");
    }

}