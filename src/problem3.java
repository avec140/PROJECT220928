class sing {
    private String title;
    private String singer;
    private int year;
    private String country;

    sing() {
        this("title","artist",0000,"country");
    }
    sing(String title, String artist, int year, String country) {
        this.title = title;
        this.singer = singer;
        this.year = year;
        this.country = country;
    }
    public void show() {
        System.out.println(year+"년 "+country+"국적의 "+singer+"가 부른 "+title);
    }
}

public class problem3 {

    public static void main(String[] args) {
        sing sing = new sing("Dancing Queen","ABBA",1978,"스웨덴");
        sing.show();
    }

}