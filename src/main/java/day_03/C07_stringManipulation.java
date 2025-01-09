package day_03;

public class C07_stringManipulation {
    public static void main(String[] args) {
        //Bir String değişkeni oluşturunuz
        //ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.
        String str=" Java bugün çok kolay ve eğlenceli geçti.   ";
        /*
        str=str.trim();//baştaki ve sonraki tüm boşlukları kaldırır
        System.out.println(str.charAt(str.length() - 1));//icerisine girdigim indexteki karakteri dondurur str.length()-1 ise son karakterin indexi
  */
        System.out.println(str.trim().charAt(str.trim().length()-1));

    }
}
