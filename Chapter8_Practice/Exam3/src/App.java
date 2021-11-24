import java.util.ArrayList;

public class App { /*Exam1ÀÇ ¹®Á¦¸¦ ArrayList·Î ´Ù½Ã Ãâ·ÂÇÏ´Â ¹®Á¦*/
    public static void main(String[] args) throws Exception {
        ArrayList <Student> list = new ArrayList<Student>();
        list.add(new Student("À×À×ÀÌ1", 1000));
        list.add(new Student("À×À×ÀÌ2", 1001));
        list.add(new Student("À×À×ÀÌ3", 1002));
        list.add(new Student("À×À×ÀÌ4", 1003));
        list.add(new Student("À×À×ÀÌ5", 1004));
        list.add(new Student("À×À×ÀÌ6", 1005));
        list.add(new Student("À×À×ÀÌ7", 1006));
        list.add(new Student("À×À×ÀÌ8", 1007));
        list.add(new Student("À×À×ÀÌ9", 1008));
        list.add(new Student("À×À×ÀÌ10", 1009));

        System.out.println(list.isEmpty());

        for(Student len : list){
            len.showInfo();
        }

    }
}
