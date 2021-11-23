public class Bus {
    int busNum;
    int money;
    int passengerCount;

    public Bus (int busNum){
        this.busNum = busNum;
    }

    public void take (int money){
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println(busNum + "번의 승객 수는 "+passengerCount+"명이고 수입은 "+money+"입니다.");
    }
}
