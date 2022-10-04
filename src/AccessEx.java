class Sample {
    public int a;
    private int b;
    int c;
}

public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        aClass.b = 10;
        aClass.c = 10;
    }
}

//a는 public으로 정의하였으므로  메인 클래스에서 접근이 가능하지만 b는 pirvate로 설정
//되어있기 때문에 메인 클래스에서 접근이 불가능하다.