import java.util.ArrayList; /**/

public class Student {
    private String stdName;
    private int stdID;
    ArrayList <Subject> subArray;

    public Student(String stdName, int stdID){
        this. stdName = stdName;
        this. stdID = stdID;
        subArray = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);
        subArray.add(subject);
    }

    public void showInfo(){
        int total = 0;
        for (Subject s : subArray){
            total += s.getScore();
            System.out.println("�л� "+stdName+"�� �й��� "+stdID+"�Դϴ�.");
            System.out.println("�л� "+stdName+"�� "+s.getName()+"������ ������ "+s.getScore()+"�Դϴ�.");
        }
        System.out.println("������ "+total+"�Դϴ�.");
    }
}
