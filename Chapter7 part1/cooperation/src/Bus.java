public class Bus {
    int busNum;
    int money;
    int passengerCount;

    public Bus (int busNum){ /*busNum을 배개변수로 하는 Bus 생성자*/
        this.busNum = busNum;
    }

    public void take (int money){ /*버스의 승객과 수입을 계산해주는 메서드*/
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println(busNum + "번의 승객 수는 "+passengerCount+"명이고 수입은 "+money+"입니다.");
    }
}
