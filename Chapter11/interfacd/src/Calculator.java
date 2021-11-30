public abstract class Calculator implements Calc{ /*implements 예약어로 인터페이스를 클래스에서 구현한다는 것을 의미*/

    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int substract(int n1, int n2){
        return n1 - n2;
    }
}

/*이렇게 4개의 추상메서드 중 2개만 구현했으니 클래스에 오류가 생기기에 추상클래스 선언*/