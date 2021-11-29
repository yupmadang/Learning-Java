public abstract class Car{
    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnoff();

    final void run(){ /*탬플릿 메서드 선언: 로직 변경이 불가능함*/
        start();
        drive();
        stop();
        turnoff();
    }
}