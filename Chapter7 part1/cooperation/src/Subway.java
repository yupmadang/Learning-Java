public class Subway {
    int subNum;
    int money;
    int passengerCount;

    public Subway (int subNum){
        this.subNum = subNum;
    }

    public void take (int money){
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println(subNum + "번의 승객 수는 "+passengerCount+"명이고 수입은 "+money+"입니다.");
    }
}
