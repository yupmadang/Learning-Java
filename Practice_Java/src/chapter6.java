public class chapter6 {

    int studentID;
    String studentName;
    int studentNum;
    String address;

    /*?��?��?�� ?��?��?��, ?���? ?��?��?��?�� ?��?�� ?�� ?��?��?��?�� ?��?��?��?�� ?��?��?��, ?��?��?���? ?��?���? ?��?��?���? ?��?��?�� 경우?��?�� �??��?�� ?���? ?��?��*/

    public chapter6() {};

    public chapter6(int studentID, String studentName, int studentNum, String address) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentNum = studentNum;
        this.address = address;
    };

    /*?��?��?�� ?��버로?��: 같�?? ?��?��, ?��?�� 같�?? ?��름의 ?��?��?���? 존재?��?�� �?*/

    public String getStudentName(){
        return studentName; /*get 메서?���? ?��?��?��?�� studentName?�� 반환*/
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
        System.out.println(studentName+ "," +studentNum+ "\n" +studentID+","+address);
    }
}
