public class App {
    public static void main(String[] args) throws Exception {
        Student std1 = new Student("잉잉이", 2);
        Student std2 = new Student("잉잉이2", 3);
    
        std1.showInfo(); /*학번을 부여받으면서 정보 출력*/
        System.out.println("\n");
        std2.showInfo();
        

    }
}
