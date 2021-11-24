public class Book {
    private String bookName; /*외부에서 이 맴버변수를 직접 참조하여 사용할 수 없음.*/
    private String author;

    /*자바에서 프로그래밍을 할 때는 후에 나올 캡슐화와 정보은닉을 원칙으로 한다고 합니다.
    이는 자바가 지향하는 무결성을 보장하는 측면이 있음 .......무결성은 두루뭉실하게 알고 있어 추가 학습필요*/

    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }

    public Book(){};

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