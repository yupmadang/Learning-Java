import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) throws Exception {
        HashSet <Student> set = new HashSet<Student>();
        set.add(new Student("100", "À×À×ÀÌ1"));
        set.add(new Student("101", "À×À×ÀÌ2"));
        set.add(new Student("102", "À×À×ÀÌ3"));
        set.add(new Student("100", "À×À×ÀÌ4"));
        set.add(new Student("103", "À×À×ÀÌ5"));

        System.out.println(set.toString());

    }
}
