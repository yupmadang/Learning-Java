public abstract class Car{
    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnoff();

    final void run(){ /*���ø� �޼��� ����: ���� ������ �Ұ�����*/
        start();
        drive();
        stop();
        turnoff();
    }
}