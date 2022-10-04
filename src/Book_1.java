public class Book_1 {
    String title;
    String author;
    void show() { System.out.println(title + " " + author); }

    public Book_1() {
        this("", "");
        System.out.println("생성자 호출됨");
    }
    public Book_1(String title) {
        this(title, "작자미상");
    }
    public Book_1(String title, String author) {
        this.title = title; this.author = author;
    }
    public static void main(String [] args) {
        Book_1 littlePrince = new Book_1("어린왕자", "생텍쥐페리");
        Book_1 loveStory = new Book_1("춘향전");
        Book_1 emptyBook = new Book_1();
        loveStory.show();
    }
}
