public class App {
    public static void main(String[] args) throws Exception {
        /*å���� ����� �� �ȿ� å�� ������ ��Ÿ��*/
        Book bookShelf1[] = new Book[5]; /*�ν��Ͻ��� 5�� ���� ���� �ν��Ͻ��� �ּ� ���� ���� ������ ���� �����ȴ�.*/

        bookShelf1[0] = new Book("������", "������");
        bookShelf1[1] = new Book("������", "������");
        bookShelf1[2] = new Book("������", "������");
        bookShelf1[3] = new Book("������", "������");
        bookShelf1[4] = new Book("������", "������");

        /*�迭�� ��Ҹ� ���� �ʱ�ȭ �ϰ� ���*/

        for(int i = 0; i < 5; i++){
            bookShelf1[i].showInfo();
        }

        /*bookShelf1[0].author = "������"; Book Ŭ������ �ɹ������� private�� �����Ͽ� Ŭ���� ���ο����� ������ �����Ͽ� �����߻�*/
        bookShelf1[0].setAuthor("������"); /*�޼��带 �̿��Ͽ� author�� ���� ������.*/
        
        System.out.println("\n");
        
        for(int i = 0; i < 5; i++){
            bookShelf1[i].showInfo();
        }
    }
}
