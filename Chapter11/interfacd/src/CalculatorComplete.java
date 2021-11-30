public class CalculatorComplete extends Calculator{ /*Calculator클래스를 상속 받음*/
    public int times(int n1, int n2){
        return n1 * n2;
    }

    public int divid(int n1, int n2){
        return n1 / n2;
    }

    @Override
    public void description() {/*재정의한 디폴트메서드*/
        System.out.println("재정의 된 메서드");
        /*super.description(); 인터페이스의 디폴트 메서드 호출*/
    }
}

/*남은 추상메서드를 구현하여 완전한 메서드로 구현*/
