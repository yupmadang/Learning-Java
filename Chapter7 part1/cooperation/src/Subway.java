public class Subway {
    int subNum;
    int money;
    int passengerCount;

    public Subway (int subNum){ /*subNum을 매개변수로 받는 생성자*/
        this.subNum = subNum;
    }

    public void take (int money){ /*수입과 탑승 승객을 나타내는 메서드*/
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){/*수입과 탑승객 수 반환*/
        System.out.println(subNum + "번의 승객 수는 "+passengerCount+"명이고 수입은 "+money+"입니다.");
    }
}
