package day_06.encapsulation;

public class Student {
    //encapsulation : data hiding veri saklama ve gizleme

    /*
bir class oluşturalım.
private access modifiera sahip variablelar oluşturun: isim, soyisim, yas seklinde
parametreli ve parametresiz constructor oluşturun
toString metodunu oluşturun
*/
    /*
    pasif özellikler(field-variable)
     */
    private String name;//null
    private String lastName;
    private int age;

    //no args constructor
    // public Student() {
    // }

    //all args constructor
    public Student(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    //getter nedir : okuma,görüntüleme
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    //setter nedir : değiştirme,güncelleme

    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }else {
            System.out.println("Yaş değeri pozitif olmak zorundadır!!!");
        }
    }

    @Override//bu method object classtan geldi,bir class otomatik olarak Object classın childıdır
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }


/*
    private String okulNo;
    private String email;
    private String adress;
    private String phone;
    private String tcNo;
    private String bolum;
    */

}