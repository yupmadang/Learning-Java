public class SuperLevel extends PlayerLevel{
    @Override
    public void run(){
        System.out.println("������ �޸��ϴ�.");
    }
    
    @Override
    public void jump(){
        System.out.println("������ 2�� �մϴ�.");
    }

    @Override
    public void turn(){
        System.out.println("1�� ���ϴ�.");
    }

    @Override
    public void showLevelMessage(){
        System.out.println("����� �����Դϴ�.");
    }
}
