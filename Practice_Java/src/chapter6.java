public class chapter6 {

    int studentID;
    String studentName;
    int studentNum;
    String address;

    public chapter6() {};

    public chapter6(int studentID, String studentName, int studentNum, String address) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentNum = studentNum;
        this.address = address;
    };

    public String getStudentName(){
        return studentName;
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

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void showINfo(){
        System.out.println(studentName+ "," +studentNum+ "\n" +studentID+address);
    }
}