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
        System.out.println(texiNum + "번의 승객은 "+passengerCount+"명이고 수입은"+money+"입니다.");
    }
}
