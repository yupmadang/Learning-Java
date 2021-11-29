public abstract class Car{
    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    final public void run(){
        startCar();
        drive();
        stop();
        turnOff();
    }

    /*탬플릿 메서드 : 정형화된 로직에서 사용하는 디자인 패턴, 탬플릿 메서드는 로직을 정형화하는
    메서드 이므로 하위클래스에서 변경을 하면 안되니 final 예약어 사용*/
}