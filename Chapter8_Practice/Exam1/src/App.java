public class App {
    public static void main(String[] args) throws Exception {
        Student list[] = new Student[5];

        list[0] = new Student(Student.getStdID(),"������1");
        list[1] = new Student(Student.getStdID(),"������2");
        list[2] = new Student(Student.getStdID(),"������3");
        list[3] = new Student(Student.getStdID(),"������4");
        list[4] = new Student(Student.getStdID(),"������5");

        for(int i = 0; i < list.length; i++){
            list[i].showInfo();
        }

    }
}
