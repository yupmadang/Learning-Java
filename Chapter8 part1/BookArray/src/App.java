public class App {
    public static void main(String[] args) throws Exception {
        /*책장을 만들고 그 안에 책이 있음을 나타냄*/
        Book bookShelf1[] = new Book[5]; /*인스턴스를 5개 생성 전에 인스턴스의 주소 값을 담을 공간이 먼저 형성된다.*/
        Book bookShelf2[] = new Book[5];

        bookShelf1[0] = new Book("잉잉이", "잉잉이");
        bookShelf1[1] = new Book("잉잉이", "잉잉이");
        bookShelf1[2] = new Book("잉잉이", "잉잉이");
        bookShelf1[3] = new Book("잉잉이", "잉잉이");
        bookShelf1[4] = new Book("잉잉이", "잉잉이");

        bookShelf2[0] = new Book(); /*디폴트 생성자로 새로운 인스턴스 형성 bookShelf1의 주소 값과는 다른 별개의 인스턴스 주소 형성*/
        bookShelf2[1] = new Book();
        bookShelf2[2] = new Book();
        bookShelf2[3] = new Book();
        bookShelf2[4] = new Book();

        for(int i = 0; i < bookShelf1.length; i++){
            bookShelf2[i].setBookName(bookShelf1[i].getBookName()); /*bookShelf2의 요소에 bookShelf1의 요소 복사*/
            bookShelf2[i].setAuthor(bookShelf1[i].getAuthor());
        }

        for(int i = 0; i < bookShelf2.length; i++){ /*출력*/
            bookShelf2[i].showInfo();
        }

        System.out.println("\n");

        bookShelf1[1].setBookName("오옹 나이스"); /*bookShelf1의 두번째 요소 값 변경*/
        bookShelf1[1].setAuthor("으시안 오옹");

        for(int i = 0; i < bookShelf2.length; i++){ /*출력*/
            bookShelf2[i].showInfo();
        }

        System.out.println("\n");
 
        for(int i = 0; i < bookShelf1.length; i++){ /*출력*/ 
            bookShelf1[i].showInfo();
        }

        System.out.println("\n");
        System.out.println(bookShelf1[1].getBookName());
        System.out.println(bookShelf1[1+1].getBookName());
    }
}


/*위의 복사는 한쪽의 값을 변경해도 복사한 다른쪽의 값이 변경이 되지 않는다.
이는 우의 디폴트 생성자로 인스턴스를 형성할 때 기존의 인스턴스의 주소를 이용하는 것이 아닌
새로운 인스턴스를 힙에 형성하기에 주소 값을 공유하지 않는 것으로 각각의 배열이 서로 독립적으로 사용이 가능하다.*/
