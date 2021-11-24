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
            System.out.println("학생 "+stdName+"의 학번은 "+stdID+"입니다.");
            System.out.println("학생 "+stdName+"의 "+s.getName()+"과목의 점수는 "+s.getScore()+"입니다.");
        }
        System.out.println("총점은 "+total+"입니다.");
    }
}
