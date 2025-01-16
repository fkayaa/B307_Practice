package day_05;

import java.time.LocalDate;
import java.util.Scanner;

public class C07_DateTime {
    public static void main(String[] args) {
        /*
        LocalDate -> sadece tarih gün ay yil
        LocalTime -> sadece saat saat dakika saniye salise
        LocalDateTime -> hem tarih hemde saati

        yardımcı class
        DateTimeFormatter
         */
       /*
       soru 1)
       -bugunun tarihini obje olusturarak yazdirin
       -bugun yilin kacinci gunu oldugunu yazdirin
       -hangi gunde oldugumuzu yazdirin
       -yılın bitmesine kac gun kaldıgını yazdırın
       -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
       -bugunden itibaren 2yil 2 ay 2 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
       -bugunden itibaren 7yil 7 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
       -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
       */
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);//2025-01-16
        System.out.println(tarih.getDayOfYear());//16
        System.out.println(tarih.getDayOfWeek());//perşembe
        //System.out.println(365-tarih.getDayOfYear());//349
        //1.yol
        if (tarih.isLeapYear()) {//artık yil mi
            System.out.println(366-tarih.getDayOfYear());
        }else {
            System.out.println(365-tarih.getDayOfYear());
        }
        //2.yol
        System.out.println(tarih.lengthOfYear() - tarih.getDayOfYear());
        System.out.println("STT : "+tarih.plusYears(3).plusMonths(5).plusDays(7));
        System.out.println(tarih.plusDays(2).plusMonths(2).plusYears(2).getDayOfMonth());
        System.out.println(tarih.plusDays(7).plusMonths(7).plusYears(7).getDayOfWeek());
        //System.out.println(tarih.plusDays(60));

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen doğum tarihinizin sadece gün bilgisini giriniz");
        int day= input.nextInt();
        System.out.println("Lütfen doğum tarihinizin sadece ay bilgisini giriniz");
        int month= input.nextInt();
        System.out.println("Lütfen doğum yilinizi giriniz");
        int years= input.nextInt();
        LocalDate dogumTarihi=LocalDate.of(years,month,day);

        System.out.println(dogumTarihi);

        if (tarih.isBefore(dogumTarihi)){
            System.out.println(tarih);
        } else if (tarih.isAfter(dogumTarihi)) {
            System.out.println(dogumTarihi);
        }else {
            System.out.println("bu iki tarih objesi birbiri ile aynı");
        }

    }
}
//odev TODO

//soru 2)
//-suanin saatini dakikasini ve saniyesini bize dondurun
//-suanin saniyesini bize dondurun
// -10000 saniye sonrasini bize dondurun
//-200 dakika onceki saati bize dondurun
//-bize saati 3 yapip yazdirin(dakika ve saniye degismeden)
//Odev!!!!

///*
//        soru 3)
//        bize bugunun tarihini ve su anki saati dondurun
//        bize 3 ay 100 saat sonraki tarih ve saati dondurun
//        bize 100 gun once 100 saat sonraki tarihi dondurun
//        bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
//        bize sadece bugunun tarihi dondurun
//        LocalDateTime kullanarak yapın tum hepsini
//         */
// Odev!!!