public interface Calc{ /*인터페이스 선언: 추상메서드와 상수로만 이루어짐*/
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int n1, int n2);
    int substract(int n1, int n2);
    int times(int n1, int n2);
    int divid(int n1, int n2);
}

/*추상메서드가 있으므로 당연히 인스턴스는 생성하지 못함.*/