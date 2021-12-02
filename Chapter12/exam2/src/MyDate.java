public class MyDate {
    private int year;
    private int month;
    private int date;

    public MyDate(int year, int month, int date){
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public int hashCode(){
        return year;
    }

    public boolean equals(Object obj){ /*입력받는 매개변수가 3개이기에 조건문을 추가함. 놀리적 동일성을 위해 재정의한 메서드*/
        if(obj instanceof MyDate){
            MyDate m = (MyDate)obj;
            if(this.year == m.year){
                if(this.month == m.month){
                    if(this.date == m.date){
                        return true;
                    }
                }
            }
            else{
                return false;
            }
        }
        return false;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getDate(){
        return date;
    }

    public void setDate(int date){
        this.date = date;
    }

}
