package interviewday_06;

public class UnderAgeException extends RuntimeException {
    public UnderAgeException(String message) {
        super(message);
    }
    public UnderAgeException(){
        super("Yaşınız 18'den küçük olduğu durumlarda bu hata ile karşılaşırsınız");
    }
}