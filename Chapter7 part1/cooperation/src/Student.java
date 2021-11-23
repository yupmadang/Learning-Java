public class Student {
    public String stdName;
    public int grade;
    public int money;
    
    public Student (String stdName, int money){
        this.stdName = stdName;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSub(Subway sub){
        sub.take(1500);
        this.money-=1500;
    }

    public void showInfo(){
        System.out.println(stdName + "에게 남은 돈은 "+ money + "입니다.");
    }
}
