public interface Calc{ /*인터페이스 선언: 추상메서드와 상수로만 이루어짐*/
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int n1, int n2);
    int substract(int n1, int n2);
    int times(int n1, int n2);
    int divid(int n1, int n2);

    default void description(){/*인터페이스에서 선언하여 implements하는 하위 클래스에서 사용할 기본 메서드*/
        System.out.println("정수 계산기를 구현합니다.");
        myMethod(); /*디폴트메서드에서 private메소드 호출*/
    }

    static int total(int arr[]){ /*정적메서드 정의*/
        int total = 0;

        for(int i : arr){
            total += i;
        }
        myStaticMethod(); /*정적메서드에서 private static메서드 호출*/
        return total;
    }


private void myMethod(){
    System.out.println("private메서드입니다.");
}

private static void myStaticMethod(){
    System.out.println("private static 메서드입니다.");
}
}

/*추상메서드가 있으므로 당연히 인스턴스는 생성하지 못함.*/