public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run(){
        System.out.println("õõ�� �޸��ϴ�.");
    }
    
    @Override
    public void jump(){
        System.out.println("������ ���� �ʽ��ϴ�.");
    }

    @Override
    public void turn(){
        System.out.println("������ �ʽ��ϴ�.");
    }

    @Override
    public void showLevelMessage(){
        System.out.println("�ʺ��� �����Դϴ�.");
    }
}
