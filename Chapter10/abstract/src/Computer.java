public abstract class Computer { /*��Ӹ��� ���� Ŭ������ abstract ������ �߻�Ŭ������ ����, �ν��Ͻ� ���� �Ұ�*/
    public int Num = 10;
    public abstract void display(); /*���� Ŭ�������� ���� �ٸ� ������ ��µǴ� �޼���*/
    public abstract void typing();  /*���� Ŭ�������� ���� �ٸ� ������ ��µǴ� �޼���*/
    public void turnOn(){
        System.out.println("������ �մϴ�.");
    }
    public void turnOff(){
        System.out.println("������ ���ϴ�.");
    }

    /*public int getNum(){
        return Num;
    }

    public void setNum(int Num){
        this.Num = Num;
    }*/

    /*���� ���� : �߻�Ŭ������ �ν��Ͻ��� ���� �� �� ���� �ܺ�Ŭ���������� ������ �� �� ���� ������ �߻�Ŭ�������� ����� ������
    ������ �Ұ����ϴ�. ����Ŭ������ ������ �ؾ��ϳ� ����Ŭ������ ������ �Ұ����ϴ� private�� protected ������ ���� ���� ���ϴ�.*/

}
