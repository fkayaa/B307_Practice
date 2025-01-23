package day_06.inheritance02;

public class Runner {
    public static void main(String[] args) {
        Corsa araba1=new Corsa();
        System.out.println("araba1.hareket = " + araba1.hareket);//Araba classından
        System.out.println("araba1.hiz = " + araba1.hiz);//Corsa Classından
        System.out.println("araba1.marka = " + araba1.marka);//Opel Classından
        System.out.println("araba1.model = " + araba1.model);//Corsa Classından
        System.out.println("araba1.renk = " + araba1.renk);//Corsa Classından
        System.out.println("araba1.sirketMerkezi = " + araba1.sirketMerkezi);//Opel Classından
        System.out.println("araba1.yakit = " + araba1.yakit);//Corsa Classından

        araba1.fren();//Araba Classından
        araba1.motor();//Corsa Classından
        araba1.vitesSayisi();//Corsa Classından
        araba1.yakitTuketimi();//Opel Classından


        Opel araba2=new Corsa();
//pasif ozellikleri opelden alacak , aktif ozellikleri opelden fakat methodlarda günceli var ise corsa!!!
        System.out.println("araba2.hareket = " + araba2.hareket);//Araba Classından
        System.out.println("araba2.hiz = " + araba2.hiz);//Araba Classından
        System.out.println("araba2.marka = " + araba2.marka);//Opel Classından
        System.out.println("araba2.sirketMerkezi = " + araba2.sirketMerkezi);//Opel Classından
        System.out.println("araba2.yakit = " + araba2.yakit);//Opel Classından

        araba2.fren();//Araba Classından
        araba2.motor();//Corsa Classından
        araba2.yakitTuketimi();//Opel Classından

//aşağıdaki objelerin methodlarini ve variablelarini inceleyerek hangi classtan geldiğini bulunuz
        Araba araba3=new Corsa();
        Araba araba4=new Opel();
        Araba araba5=new Araba();

        Opel araba6=new Opel();
    }
}
