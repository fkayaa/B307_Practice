package day_03;

public class C01_StringManipulation {
    public static void main(String[] args) {

        //Bir String' de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız


        /*
        toLowerCase:harfleri kucultmeyi saglar
            toUpperCase:harfleri buyultmeyi saglar
            length:karakter sayisini yani uzunlugunu verir
            equals:esit mi diye kontrol eder (peki == farki nedir =='hem adrese hem degere bakar fakat equals methodu sadece degere bakar)
            equalsIgnoreCase:buyuk kucuk harf farketmeksizin esit mi diye kontrol eder
            indexOf:girilen karakterin ilk indexini dondurur
            lastIndexOf:girilen karakterin son indexini dondurur
            charAt:girilen indexteki karakteri dondurur
            trim:bastaki ve sondaki bosluklari siler
            split:icine girilen degerden boler sag ve sol olmak uzere secim yaptırır(0 sol/1 sag)
            replace:icindeki datayi degistirmeyi saglar
            replaceAll:icindeki datyi gruplar halinde(regex) degistirmeyi saglar
            concat:birlestirme islemi yapar
            subString:ilk girilen indexten ikinci indexe kadar(ikinci index dahil degildir) olan degeri bize dondurur
            valueOf:String'i baska dataya baska datalari String'e cevirmeyi saglar.
            contains:icerme durumunu kontrol eder
            endsWith:ne ile bittigini kontrol eder
            startsWith:ne ile basladigini kontrol eder
            isBlank:hem bos mu diye kontrol eder bos degilse sadece bosluk karakter var mi diye kontrol eder
            isEmpty:bos mu diye kontrol eder
         */

        String str="Java bugün çok eğlenceli";
        String bosStr="";

        for (int i = 0; i < str.length(); i++) {

            String harf=""+ str.charAt(i);

            if (str.indexOf(harf)==str.lastIndexOf(harf)){
                bosStr=bosStr+harf;
            }
        }
        System.out.println("Sonuc : "+bosStr);
        }
    }
