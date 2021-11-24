public class App {
    public static void main(String[] args) throws Exception {
        /*책장을 만들고 그 안에 책이 있음을 나타냄*/
        Book bookShelf1[] = new Book[5]; /*인스턴스를 5개 생성 전에 인스턴스의 주소 값을 담을 공간이 먼저 형성된다.*/

        bookShelf1[0] = new Book("잉잉이", "잉잉잉");
        bookShelf1[1] = new Book("잉잉이", "잉잉이");
        bookShelf1[2] = new Book("잉잉이", "잉잉이");
        bookShelf1[3] = new Book("잉잉이", "잉잉이");
        bookShelf1[4] = new Book("잉잉이", "잉잉이");

        /*배열의 요소를 각각 초기화 하고 출력*/

        for(int i = 0; i < 5; i++){
            bookShelf1[i].showInfo();
        }

        /*bookShelf1[0].author = "응응응"; Book 클래스의 맴버변수를 private로 선언하여 클래스 내부에서만 접근이 가능하여 오류발생*/
        bookShelf1[0].setAuthor("응응응"); /*메서드를 이용하여 author의 값을 변경함.*/
        
        System.out.println("\n");
        
        for(int i = 0; i < 5; i++){
            bookShelf1[i].showInfo();
        }
    }
}
