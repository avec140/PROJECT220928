public class GarbageEx {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;
        a = null;
        d = c;
        c = null;
    }
}


//a의 값을 null로 설정하였기 때문에 a의 값 "Good"에서 가비지가 발생한다.