public class SuperLevel extends PlayerLevel{
    @Override
    public void run(){
        System.out.println("빠르게 달립니다.");
    }
    
    @Override
    public void jump(){
        System.out.println("점프는 2번 합니다.");
    }

    @Override
    public void turn(){
        System.out.println("1번 돕니다.");
    }

    @Override
    public void showLevelMessage(){
        System.out.println("고급자 레벨입니다.");
    }
}
