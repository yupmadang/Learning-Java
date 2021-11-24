public class Book {
    private String bookName; /*�ܺο��� �� �ɹ������� ���� �����Ͽ� ����� �� ����.*/
    private String author;

    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){ /*�ܺο��� ���� ���� �� �� �ֵ��� ser�޼��� ����*/
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