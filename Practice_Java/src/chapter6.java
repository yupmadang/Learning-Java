public class chapter6 {

    int studentID;
    String studentName;
    int studentNum;
    String address;

    public String getStudentName(){
        return studentName; /*get 메서드를 활용하여 studentName을 반환*/
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public int getStudentNum(){
        return studentNum;
    }

    public void setStudentName(int studentNum){
        this.studentNum = studentNum;
    }

    public int studentID(){
        return studentID;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public void showINfo(){
        System.out.println(studentName+ "," +studentNum);
    }
}
