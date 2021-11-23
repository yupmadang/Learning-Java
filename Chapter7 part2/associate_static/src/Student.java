public class Student {
    private static int serialNum=1000; /*외부에서 접근을 제한하기 위한 private선언, set메서드가 없으므로 학번 변경 불가*/
    public String stdName;
    public int grade;

    public Student(String stdName, int grade){ /*Student 생성자*/
        this.stdName = stdName;
        this.grade = grade;
    }
    
    public static int getSerialNum(){ /*인원당 학번부여를 위한 메서드*/
        serialNum++;
        return serialNum;
    }

    public String getStdName(){
        return stdName;
    }

    public void setStdName(String stdName){
        this.stdName = stdName;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void showInfo(){ /*학생의 정보를 반환하는 메서드*/
        System.out.println("학생이름: "+stdName);
        System.out.println("학번: "+ getSerialNum());
        System.out.println("학년: "+ grade);
        System.out.println("학생카드번호: "+StudentCard.getCardNum());/*클래스를 참조하여 카드번호를 반환하는 코드*/
    }
}