public class Book{
    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle){
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    public String toString(){/*toString�޼��� ������ : å�� �̸��� ��ȣ�� ���*/
        return bookTitle + ","+ bookNumber;
    }

    public static void main(String[] args) throws Exception {
        Book book1 = new Book(200, "������");

        System.out.println(book1);
        System.out.println(book1.toString()); /*toString�޼����� ������ �ν��Ͻ��� ������ ���ڿ��� ��ȯ�ϴ� ���Դϴ�.*/
    }
}

/*toString �޼���� �����Ǹ� ���� �ν��Ͻ��� �ּҸ��� �ƴ� �پ��� ���� ����� �� ����1*/