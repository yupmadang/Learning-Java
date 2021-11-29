public abstract class PlayerLevel{
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    final public void go(int count){ /*정해진 로직을 수행해야 하기에 final선언*/
        run();
        for(int i = 0; i < count; i++){
            jump();
        }
        turn();
    }

}