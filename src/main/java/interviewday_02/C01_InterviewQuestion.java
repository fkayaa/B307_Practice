package interviewday_02;

public class C01_InterviewQuestion {
    public static void main(String[] args) {
        //Bir string'in tüm substringlerini bulan kodu yazınız
        String str="Java bugün çok güzel";
        int sayac=0;
        // System.out.println(str.substring(0,5));
        for (int i = 0; i < str.length(); i++) {//başlangıç

            for (int j = 1 ; j <=str.length()-i ; j++) {//bitiş
                sayac++;
                System.out.println(str.substring(i,i+j));

            }

        }
        System.out.println("top. kaç tane subString var = " + sayac);
    }
}
