public class Subway {
    int subNum;
    int money;
    int passengerCount;

    public Subway (int subNum){ /*subNum�� �Ű������� �޴� ������*/
        this.subNum = subNum;
    }

    public void take (int money){ /*���԰� ž�� �°��� ��Ÿ���� �޼���*/
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){/*���԰� ž�°� �� ��ȯ*/
        System.out.println(subNum + "���� �°� ���� "+passengerCount+"���̰� ������ "+money+"�Դϴ�.");
    }
}
