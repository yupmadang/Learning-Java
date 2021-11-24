public class App {
    public static void main(String[] args) throws Exception {
        Student list[] = new Student[5];

        list[0] = new Student(Student.getStdID(),"À×À×ÀÌ1");
        list[1] = new Student(Student.getStdID(),"À×À×ÀÌ2");
        list[2] = new Student(Student.getStdID(),"À×À×ÀÌ3");
        list[3] = new Student(Student.getStdID(),"À×À×ÀÌ4");
        list[4] = new Student(Student.getStdID(),"À×À×ÀÌ5");

        for(int i = 0; i < list.length; i++){
            list[i].showInfo();
        }

    }
}
