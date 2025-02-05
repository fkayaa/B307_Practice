package day_07;

import java.util.Scanner;

public class C02_Runner {
    public static void main(String[] args) {
        /*
         //task : Bir kullanıcının kan verebilmesi icin yaşı ve kılosu tutuyor mu
        //ona bakalım eger tutmuyorsa exception fırlatalım(AgeException),(WeightException)
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int age= input.nextInt();
        if (age>=18){
            System.out.println("Lütfen kilonuzu giriniz");
            double weight= input.nextDouble();
            if (weight>50){
                System.out.println("Kan vermek için formu doldurunuz....");
                System.out.println("FORM : ..................");
            }else {
                try {
                    //System.out.println("aaa".charAt(age));
                    throw new WeightException("Kilonuz 50'nin altında olduğu için kan veremezsiniz");
                }catch (WeightException e){
                    e.printStackTrace();
                }finally {//exception alsakta almasakta her türlü çalışır!!!
                    input.close();
                    System.out.println("scanner kapandı mı?");
                }

            }
        }else {

            //throw new AgeException();//todo ÖDEVVVV

        }
        System.out.println("kodumuz çalışmaya devam edicek mi?");
    }

}