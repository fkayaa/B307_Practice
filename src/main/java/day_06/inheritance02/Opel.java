package day_06.inheritance02;

public class Opel extends Araba{
    //markasi belirli bir araba objesi
    public String marka="Opel";
    public String yakit="Opel arabalarda dizel yakit türü kullanılmaktadır";
    public String sirketMerkezi="Istanbul";

    //@Override-->opsiyonel
    public void motor(){
        System.out.println("Opel arabalar opel marka motorlar kullanarak çalışır");
    }

    public void yakitTuketimi(){
        System.out.println("Opel arabalar 100 km 5 litre yakıt tüketir.");
    }


}
