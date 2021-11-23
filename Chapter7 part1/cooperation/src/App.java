public class App {
    public static void main(String[] args) throws Exception {
        Student std1 = new Student("À×À×ÀÌ", 10000);
        Student std2 = new Student("À×À×ÀÌ2", 15000);

        Bus bus51 = new Bus(51);
        Subway sub2 = new Subway(2);

        std1.takeBus(bus51);
        std2.takeSub(sub2);

        std1.showInfo();
        std2.showInfo();
        bus51.showInfo();
        sub2.showInfo();
    }
}
