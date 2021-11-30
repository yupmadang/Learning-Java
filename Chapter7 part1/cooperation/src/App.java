public class App {
    public static void main(String[] args) throws Exception {
        /*인스턴스의 생성과 동시에 초기화*/
        /*스택메모리에는 std1~3의 변수 생성과 힙메모리에 생성된 인스턴스의 주소 반환*/
        /*힙메모리에 인스턴스가 형성*/
        Student std1 = new Student("잉잉이1", 10000);
        Student std2 = new Student("잉잉이2", 20000);
        Student std3 = new Student("잉잉이3", 30000);

        Bus bus51 = new Bus(51);
        Subway sub2 = new Subway(2);
        Texi texi55 = new Texi(55);

        std1.takeBus(bus51);
        std2.takeSub(sub2);
        std3.takeTexi(texi55);

        std1.showInfo(); /*std1의 이름, 남는 돈을 보여줌*/
        std2.showInfo();
        std3.showInfo();
        bus51.showInfo(); /*버스에 수입과 승객의 수 를 보여줌*/
        sub2.showInfo();
        texi55.showInfo();
    }
}
