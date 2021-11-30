public class Student {
    public String stdName;
    public int grade;
    public int money;
    
    public Student (String stdName, int money){ /*Student ������ ����*/
        this.stdName = stdName;
        this.money = money;
    }

    public void takeBus(Bus bus){ /*Bus�� ���������� �ϴ� bus�� �̿��� ������ Ÿ�� ���� �����ϰ� �ϴ� �޼���*/
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSub(Subway sub){
        sub.take(1500);
        this.money-=1500;
    }

    public void takeTexi(Texi texi){
        texi.take(3300);
        this.money -= 3300;
    }

    public void showInfo(){ /*�л��� ������ ���� �� ��ȯ*/
        System.out.println(stdName + "���� ���� ���� "+ money + "�Դϴ�.");
    }
}
