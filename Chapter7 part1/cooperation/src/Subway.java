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
        System.out.println(subNum + "���� �°� ���� "+passengerCount+"���̰� ������ "+money+"�Դϴ�.");
    }
}
