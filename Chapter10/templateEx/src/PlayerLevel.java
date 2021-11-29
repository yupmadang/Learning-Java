public abstract class PlayerLevel{
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    final public void go(int count){ /*������ ������ �����ؾ� �ϱ⿡ final����*/
        run();
        for(int i = 0; i < count; i++){
            jump();
        }
        turn();
    }

}