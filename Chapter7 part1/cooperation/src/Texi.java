public class Texi {
    int texiNum;
    int money;
    int passengerCount;

    public Texi(int texiNum){
        this.texiNum = texiNum;
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println(texiNum + "���� �°��� "+passengerCount+"���̰� ������"+money+"�Դϴ�.");
    }
}
