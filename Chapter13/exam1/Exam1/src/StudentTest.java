import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) throws Exception {
        HashSet <Student> set = new HashSet<Student>();
        set.add(new Student("100", "������1"));
        set.add(new Student("101", "������2"));
        set.add(new Student("102", "������3"));
        set.add(new Student("100", "������4"));
        set.add(new Student("103", "������5"));

        System.out.println(set.toString());

    }
}
