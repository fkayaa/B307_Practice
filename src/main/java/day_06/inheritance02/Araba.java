package day_06.inheritance02;

public class Araba {
    //Araba classında Tüm arabalar için ortak olarak aktif ve pasif ozellikler

    //pasif özellikler
    public String hareket="Arabalar tekerlek ile hareket eder";
    public String hiz="Arabalar motor gücüne göre hızlanır";
    public String yakit="Arabalar farklı türde yakıt türüne sahiptir";
    public String marka="Arabalar üretildikleri firmanin markasına sahiptir";

    //aktif özellikler
    public void motor(){
        System.out.println("Arabalar motorlar sayesinde calışır");
    }
    public void fren(){
        System.out.println("Arabalar yavaşlamak için fren kullanır");
    }

}