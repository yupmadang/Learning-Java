public class Bus {
    int busNum;
    int money;
    int passengerCount;

    public Bus (int busNum){ /*busNum�� �谳������ �ϴ� Bus ������*/
        this.busNum = busNum;
    }

    public void take (int money){ /*������ �°��� ������ ������ִ� �޼���*/
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println(busNum + "���� �°� ���� "+passengerCount+"���̰� ������ "+money+"�Դϴ�.");
    }
}
