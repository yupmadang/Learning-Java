public class App {
    public static void main(String[] args) throws Exception {
        /*å���� ����� �� �ȿ� å�� ������ ��Ÿ��*/
        Book bookShelf1[] = new Book[5]; /*�ν��Ͻ��� 5�� ���� ���� �ν��Ͻ��� �ּ� ���� ���� ������ ���� �����ȴ�.*/
        Book bookShelf2[] = new Book[5];

        bookShelf1[0] = new Book("������", "������");
        bookShelf1[1] = new Book("������", "������");
        bookShelf1[2] = new Book("������", "������");
        bookShelf1[3] = new Book("������", "������");
        bookShelf1[4] = new Book("������", "������");

        bookShelf2[0] = new Book(); /*����Ʈ �����ڷ� ���ο� �ν��Ͻ� ���� bookShelf1�� �ּ� ������ �ٸ� ������ �ν��Ͻ� �ּ� ����*/
        bookShelf2[1] = new Book();
        bookShelf2[2] = new Book();
        bookShelf2[3] = new Book();
        bookShelf2[4] = new Book();

        for(int i = 0; i < bookShelf1.length; i++){
            bookShelf2[i].setBookName(bookShelf1[i].getBookName()); /*bookShelf2�� ��ҿ� bookShelf1�� ��� ����*/
            bookShelf2[i].setAuthor(bookShelf1[i].getAuthor());
        }

        for(int i = 0; i < bookShelf2.length; i++){ /*���*/
            bookShelf2[i].showInfo();
        }

        System.out.println("\n");

        bookShelf1[1].setBookName("���� ���̽�"); /*bookShelf1�� �ι�° ��� �� ����*/
        bookShelf1[1].setAuthor("���þ� ����");

        for(int i = 0; i < bookShelf2.length; i++){ /*���*/
            bookShelf2[i].showInfo();
        }

        System.out.println("\n");
 
        for(int i = 0; i < bookShelf1.length; i++){ /*���*/ 
            bookShelf1[i].showInfo();
        }

        System.out.println("\n");
        System.out.println(bookShelf1[1].getBookName());
        System.out.println(bookShelf1[1+1].getBookName());
    }
}


/*���� ����� ������ ���� �����ص� ������ �ٸ����� ���� ������ ���� �ʴ´�.
�̴� ���� ����Ʈ �����ڷ� �ν��Ͻ��� ������ �� ������ �ν��Ͻ��� �ּҸ� �̿��ϴ� ���� �ƴ�
���ο� �ν��Ͻ��� ���� �����ϱ⿡ �ּ� ���� �������� �ʴ� ������ ������ �迭�� ���� ���������� ����� �����ϴ�.*/
