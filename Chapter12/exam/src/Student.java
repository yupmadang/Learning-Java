public class Student{
    private String stdName;
    private int stdNum;

    public Student(String stdName, int stdNum){
        this.stdName = stdName;
        this.stdNum = stdNum;
    }

    public String toString(){
        return stdName + "," + stdNum;
    }

    public String getStdName(){
        return stdName;
    }

    public void setStdName(String stdName){
        this.stdName = stdName;
    }

    public int getStdNum(){
        return stdNum;
    }

    public void setStdNum(int stdNum){
        this.stdNum = stdNum;
    }
}