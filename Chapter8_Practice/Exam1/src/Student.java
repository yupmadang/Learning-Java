public class Student{ /*객체 배열을 이용한 사용자 정보 출력*/
    private static int stdID = 1000; /*일일이 선언하기 싫기에 static으로 선언을 한 후 증가시키는 것으로 stdID를 할당*/
    private String stdName;

    public Student(int stdID, String stdName){
        Student.stdID = stdID;
        this.stdName = stdName;
    }

    public static int getStdID(){
        return stdID;
    }

    public void setStdID(int stdID){
        Student.stdID = stdID;
    }

    public String getStdName(){
        return stdName;
    }

    public void setStdName(String stdName){
        this.stdName = stdName;
    }

    public void showInfo(){
        System.out.println(stdID++ + "," +stdName);
    }


}