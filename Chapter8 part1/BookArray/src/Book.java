public class Book {
    private String bookName; /*외부에서 이 맴버변수를 직접 참조하여 사용할 수 없음.*/
    private String author;

    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){ /*외부에서 값을 변경 할 수 있도록 ser메서드 선언*/
        this.bookName = bookName;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void showInfo(){
        System.out.println(bookName+" , "+author);
    }
}