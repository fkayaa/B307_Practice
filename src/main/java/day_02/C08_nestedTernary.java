package day_02;

import java.util.Scanner;

public class C08_nestedTernary {
    public static void main(String[] args) {
        //öğrenci kimlik durumuna göre bir bilet fiyatı belirleyen bir kod
        // . age 18'den küçükse çocuk bileti fiyatı uygulanır.
        // Eğer age 18'den büyükse ve öğrenci kimliği varsa, öğrenci bileti fiyatı uygulanır.
        // Eğer age 65'ten büyükse yaşlı bileti fiyatı uygulanır, aksi takdirde tam bilet fiyatı uygulanır.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz.");

        short age = input.nextShort();

        //if-else

        if (age>0 && age<18){
            System.out.println("Çocuk bileti : 20Lira");
        } else if (age>=18 && age<65) {
            System.out.println("Öğrenci kimliğiniz var mı?Varsa true yoksa false giriniz.");
            boolean ogrKimligi = input.nextBoolean();
            if (ogrKimligi){
                System.out.println("Öğrenci bileti : 35 Lira");
            }else {
                System.out.println("Tam bilet : 60 Lira");
            }
        }else if (age>=65) {
            System.out.println("Yaşlı Bileti : 50 Lira");
        }else {
            System.out.println("Lütfen yaş aralığını 0'dan büyük giriniz");
        }


        //ternary if kadar gelişmiş bir yapı değil

        System.out.println("öğrenci kimliğiniz var ise true,yok ise false giriniz.");
        boolean ogrKmlk = input.nextBoolean();

       String sonuc = age<18?"Çocuk Bileti" : ogrKmlk ? "35tl" : (age>=65 ? "50tl" : "60tl");
        System.out.println("sonuc = " + sonuc);


    }
}
