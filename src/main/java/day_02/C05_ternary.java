package day_02;

public class C05_ternary {
    public static void main(String[] args) {
        //hava durumuna göre etkinlik yaptırmayı saglayan kodu yazınız

        String weather = "sunny";
        String sonuc = weather.equals("rainy") ? "Evde Java Çalısalım" : "Dışarıda yürüyüş yapalım";
        System.out.println("sonuc = " + sonuc);

      /*
      if (weather.equals("rainy"){
            System.out.println("Evde Java Çalısalım");
        }
         else{
            System.out.println("Dışarıda yürüyüş yapalım");
        }

       */

    }
}
