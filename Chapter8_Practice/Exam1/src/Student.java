public class Student{ /*��ü �迭�� �̿��� ����� ���� ���*/
    private static int stdID = 1000; /*������ �����ϱ� �ȱ⿡ static���� ������ �� �� ������Ű�� ������ stdID�� �Ҵ�*/
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