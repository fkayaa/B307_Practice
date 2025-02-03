package interviewday_06;

import java.util.Arrays;
import java.util.Scanner;

public class C02_interviewquestion {
    public static void main(String[] args) {
        //exception nedir?
        /*
        istisnalar-hatalar  javanın kendisi tarafından kabul edemediği istisnalari
        ve kod çalışırken akışı bozan hataları
        yonlendirme bicime exception denir
         */

        //exceptionlar kaça ayrılır?
        /*
        run time - compile time 2 ye ayrılır diyebiliriz
         */

        //run time nedir?

        /*
        kod ya da application çalışırken karşılaştığımız durumlar
        örnek:
        kullanıcıdan veri alırken
        database veri cekerken
        dosya okurken
        dosya yazarken
        internet kaynaklı
        app'e birden fazla istek aynı anda yonlendirildiginde
        bizim kullanıcının erişmemesi gereken bir yere erişmeye çalışırken
        biz tarafından olusturulmuş bir exception verilebilir
         */

        //compile time
        /*
        biz bir app oluştururken karşımıza cıkan derleme istisnaları
        double bir değeri int değere atarken!!!
        initialized edilmemiş bir değer ile işlem yapmaya çalışırsak
         */

        //bir exception nasıl oluşturulur?
        /*
        normal bir java class oluşturulur
        ardından exception classı extend edilir bu sayede bir exception class oluşturulmuş olur
        eğerki oluştuduğunuz classtan bir run time etmek istiyorsaniz
        o zaman string parametleri bir cons oluşturup super(String) ile string değeri parent
        const. gondeririz
         */

        //peki bir istisna ile nasıl baş edilir?
        /*
        try ile çalışacak kodları yazarız catch ile yakalarız
        try ile istisna oluşma durumunu göz önünde bulundurduğumuz kodları yazarız
        catch ile de oluşabilicek istisnaları yakalamaya çalışırız
         */


        /*
       Örnek: Lunaparkta Hızlı trene binmek isteyen çocukların yaşını alıp
       eğer 18'den büyükse binmesine
       18'den küçükse exception ile hata gonderilmesini sağlayan java kodunu yazınız
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int age= input.nextInt();
        if (age>=18){
            System.out.println("Evet binebilirsiniz");
        }else {
            try{
                throw new UnderAgeException("Yaşınız yetmediği için binemezsiniz");
            }catch (UnderAgeException e){
                e.printStackTrace();

            }

        }
        System.out.println("Kod çalışmaya devam ediyor mu?");


    }
}