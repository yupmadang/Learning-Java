public class App {
    public static void main(String[] args) throws Exception {
        Student std1 = new Student("À×À×ÀÌ1", 10000);
        Student std2 = new Student("À×À×ÀÌ2", 20000);
        Student std3 = new Student("À×À×ÀÌ3", 30000);

        Bus bus51 = new Bus(51);
        Subway sub2 = new Subway(2);
        Texi texi55 = new Texi(55);

        std1.takeBus(bus51);
        std2.takeSub(sub2);
        std3.takeTexi(texi55);

        std1.showInfo();
        std2.showInfo();
        std3.showInfo();
        bus51.showInfo();
        sub2.showInfo();
        texi55.showInfo();
    }
}
