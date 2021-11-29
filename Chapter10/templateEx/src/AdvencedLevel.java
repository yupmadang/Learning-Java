public class AdvencedLevel extends PlayerLevel{
    @Override
    public void run(){
        System.out.println("적당히 달립니다.");
    }
    
    @Override
    public void jump(){
        System.out.println("점프를 1번 합니다.");
    }

    @Override
    public void turn(){
        System.out.println("돌지 않습니다.");
    }

    @Override
    public void showLevelMessage(){
        System.out.println("중급자 레벨입니다.");
    }
}
