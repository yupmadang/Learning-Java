import java.util.ArrayList;

public class App { /*Exam1�� ������ ArrayList�� �ٽ� ����ϴ� ����*/
    public static void main(String[] args) throws Exception {
        ArrayList <Student> list = new ArrayList<Student>();
        list.add(new Student("������1", 1000));
        list.add(new Student("������2", 1001));
        list.add(new Student("������3", 1002));
        list.add(new Student("������4", 1003));
        list.add(new Student("������5", 1004));
        list.add(new Student("������6", 1005));
        list.add(new Student("������7", 1006));
        list.add(new Student("������8", 1007));
        list.add(new Student("������9", 1008));
        list.add(new Student("������10", 1009));

        System.out.println(list.isEmpty());

        for(Student len : list){
            len.showInfo();
        }

    }
}
