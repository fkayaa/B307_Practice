package day_01;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        //Kullanicidan yaricap isteyip cemberin cevresini ve
        //dairenin alanini hesaplayip yazdirin cevre formulu 2πrdir
        //(pi sayisini 3 alabilirsiniz)dairenin alani ise π r²dir(pi sayisini 3 alabilirsiniz)

        //1.adım scanner objesi olusturmak
        Scanner input=new Scanner(System.in);

        //2.adım kullanıcıya bilgi verelim ki bilgi alabilelim
        System.out.println("Lütfen hesaplamak istediğiniz dairenin yarıçapını giriniz : ");

        //3.adım aldığımız bilgiyi bir kavanoza(variables) koymamız gerekiyor
        //NOT : Kullanıcıdan bilgi alırken uygun variable olmasına dikkat edelim
        double r= input.nextDouble();

        //4.adım olarak hesaplama işlemi yapıcaz
        System.out.println("Çevre : "+2*Math.PI*r);//14.399999999999999   gerçek pi sayisi ile : 15.079644737231007
        System.out.println("Alanı : "+Math.PI*r*r);//17.279999999999998   gerçek pi sayisi ile : 18.09557368467721

        System.out.println("Çevre : "+String.format("%.4f",2*Math.PI*r));
    }
}