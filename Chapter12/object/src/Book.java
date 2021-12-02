public class Book{
    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle){
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    public String toString(){/*toString메서드 재정의 : 책의 이름과 번호를 축력*/
        return bookTitle + ","+ bookNumber;
    }

    public static void main(String[] args) throws Exception {
        Book book1 = new Book(200, "잉잉이");

        System.out.println(book1);
        System.out.println(book1.toString()); /*toString메서드의 원형은 인스턴스의 정보를 문자열로 반환하는 것입니다.*/
    }
}

/*toString 메서드는 재정의를 통해 인스턴스의 주소만이 아닌 다양한 값을 출력할 수 있음1*/