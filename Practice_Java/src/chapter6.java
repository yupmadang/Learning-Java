public class chapter6 {

    int studentID;
    String studentName;
    int studentNum;
    String address;

    /*?””?´?Š¸ ?ƒ?„±?, ?•„ë¬? ?ƒ?„±??„ ?—†?„ ?‹œ ??™?œ¼?Ÿ¬ ?ƒ?„±?˜?Š” ?ƒ?„±?, ?‚¬?š©?ê°? ?„?˜ë¡? ?ƒ?„±?ë¥? ?„ ?–¸?•œ ê²½ìš°?—?Š” ì§??›?„ ?•˜ì§? ?•Š?Œ*/

    public chapter6() {};

    public chapter6(int studentID, String studentName, int studentNum, String address) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentNum = studentNum;
        this.address = address;
    };

    /*?ƒ?„±? ?˜¤ë²„ë¡œ?”©: ê°™ì?? ?´?«, ?•ˆ?— ê°™ì?? ?´ë¦„ì˜ ?ƒ?„±?ê°? ì¡´ì¬?•˜?Š” ê²?*/

    public String getStudentName(){
        return studentName; /*get ë©”ì„œ?“œë¥? ?™œ?š©?•˜?—¬ studentName?„ ë°˜í™˜*/
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
