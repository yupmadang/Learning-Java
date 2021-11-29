public abstract class Computer { /*상속만을 위한 클래스로 abstract 예약어로 추상클래스로 선언, 인스턴스 생성 불가*/
    public int Num = 10;
    public abstract void display(); /*하위 클래스에서 각각 다른 값으로 출력되는 메서드*/
    public abstract void typing();  /*하위 클래스에서 각각 다른 값으로 출력되는 메서드*/
    public void turnOn(){
        System.out.println("전원을 켭니다.");
    }
    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }

    /*public int getNum(){
        return Num;
    }

    public void setNum(int Num){
        this.Num = Num;
    }*/

    /*본인 생각 : 추상클래스는 인스턴스를 형성 할 수 없어 외부클래스에서의 접근을 할 수 없기 때문에 추상클래스에서 선언된 변수의
    변경이 불가능하다. 하위클래스는 재정의 해야하나 상위클래스는 변경이 불가능하니 private나 protected 선언을 하지 않은 듯하다.*/

}
