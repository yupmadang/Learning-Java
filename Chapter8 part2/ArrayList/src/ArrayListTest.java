public class ArrayListTest {
    public static void main(String[] args) throws Exception {
        Student std1 = new Student("������", 1000);
        std1.addSubject("����", 90);
        std1.addSubject("����", 50);

        Student std2 = new Student("������1", 1001);
        std2.addSubject("����", 86);
        std2.addSubject("����", 69);
        std2.addSubject("����", 100);

        std1.showInfo();
        std2.showInfo();
    }
}
