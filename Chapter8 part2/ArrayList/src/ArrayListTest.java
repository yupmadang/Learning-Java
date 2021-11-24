public class ArrayListTest {
    public static void main(String[] args) throws Exception {
        Student std1 = new Student("À×À×ÀÌ", 1000);
        std1.addSubject("±¹¾î", 90);
        std1.addSubject("¼öÇÐ", 50);

        Student std2 = new Student("À×À×ÀÌ1", 1001);
        std2.addSubject("±¹¾î", 86);
        std2.addSubject("¼öÇÐ", 69);
        std2.addSubject("¿µ¾î", 100);

        std1.showInfo();
        std2.showInfo();
    }
}
