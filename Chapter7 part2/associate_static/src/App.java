public class App {
    public static void main(String[] args) throws Exception {
        Student std1 = new Student("잉잉이", 2);
        Student std2 = new Student("잉잉이2", 3);
    
        std1.showInfo(); /*학번을 부여받으면서 정보 출력*/
        System.out.println("\n");
        std2.showInfo();
        

        /*연습문제 2번 학생의 정보와 거기에 카드번호추가
        static 변수를 2개 선언하여 각각 학번과 카드번호를 나타냄.
        데이터영역에 cardNum과 serialNum가 존재하고 스택에는 각각의 매개변수가 위치
        힙에는 std1과 std2의 인스턴스가 형성된다.
        
        static 변수는 변수의 이름보다 클래스의 이름으로 보통 참조한다*/

    }
}
