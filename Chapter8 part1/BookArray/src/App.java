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

        System.arraycopy(bookShelf1, 0, bookShelf2, 0, 5);

        /*�迭�� ��Ҹ� ���� �ʱ�ȭ �ϰ� ���*/

        for(int i = 0; i < 5; i++){
            bookShelf1[i].showInfo();
        }

        System.out.println("\n");
        
        for(int i = 0; i < 5; i++){
            bookShelf2[i].showInfo();
        }

        /*bookShelf1[0].author = "������"; Book Ŭ������ �ɹ������� private�� �����Ͽ� Ŭ���� ���ο����� ������ �����Ͽ� �����߻�*/
        bookShelf1[0].setAuthor("������");
        bookShelf1[0].setBookName("���� ���̽�"); /*�޼��带 �̿��Ͽ� bookSelf�� å �̸��� ���� ���� ������.*/

        System.out.println("\n");

        for(int i = 0; i < 5; i++){ /*bookShelf2�� �����. �ٵ� ù����� ���� bookSelf1�� ���� �Ȱ��� ����*/
            bookShelf2[i].showInfo();
        }

        /*�̷��� ��Ȳ�� �迭�� �ڸ��� �ν��Ͻ��� �ƴ� �ν��Ͻ��� �ּ� ���� ����Ű�� ������ ���縦 �����ص� �ּ� ���� ���簡 �Ǵ� ��
        �̷��� ������ ���� ���� �����ϸ� ������ �ٸ� �ʵ� ������ �޴´�.*/

    }
}
