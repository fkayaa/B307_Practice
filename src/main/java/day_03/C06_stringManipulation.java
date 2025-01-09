package day_03;

public class C06_stringManipulation {
    public static void main(String[] args) {

    /*
    Kişi isimleri için 5 String değişken oluşturunuz. Boşluk karakterleri hariç 5 isimdeki
    karakter sayısının toplamını yazdırınız.
    */

        String isim1="Ali Can";
        String isim2="Mehmet Can";
        String isim3="Ayşe Nur";
        String isim4="Fatma Nur";
        String isim5="Veli Can";

        String toplam=isim5+isim3+isim4+isim2+isim1;

        // System.out.println(toplam);

        toplam=toplam.replace(" ","");

        //System.out.println(toplam);

        System.out.println("Tüm isimlerin boşluksuz toplam karakter sayisi : "+toplam.length());
    }
}