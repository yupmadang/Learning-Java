public class AdvencedLevel extends PlayerLevel{
    @Override
    public void run(){
        System.out.println("������ �޸��ϴ�.");
    }
    
    @Override
    public void jump(){
        System.out.println("������ 1�� �մϴ�.");
    }

    @Override
    public void turn(){
        System.out.println("���� �ʽ��ϴ�.");
    }

    @Override
    public void showLevelMessage(){
        System.out.println("�߱��� �����Դϴ�.");
    }
}
