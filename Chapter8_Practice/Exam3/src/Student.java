public class Student {
    private String stdName;
    private int stdID;

    public Student(String stdName, int stdID){
        this.stdName = stdName;
        this.stdID = stdID;
    }

    public String getStdName(){
        return stdName;
    }

    public void setStdName(String stdName){
        this.stdName = stdName;
    }

    public int getStdID(){
        return stdID;
    }

    public void setStdID(int stdID){
        this.stdID = stdID;
    }
    
    public void showInfo(){
        System.out.println(stdName+" , "+stdID);
    }
}
