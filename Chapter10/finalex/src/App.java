public class App {
    public static void main(String[] args) throws Exception {
        Constant c1 = new Constant();
        /*c1.NUM = 200; final 예약어로 인해 값의 변경이 불가능하다.*/

        System.out.println(c1.num);
        System.out.println(c1.NUM);
        System.out.println("\n");

        System.out.println(Define.GOOD_MORNING); /*static 으로 선언되어 클래스형으로 참조가능*/
        System.out.println(Define.MATH);
        System.out.println(Define.MAX);
        System.out.println(Define.ENG);
    }
}

/*final로 선언된 클래스, 메서드, 변수는 각각 변수에선 상수를 의미하고 메서드에서는 하위 메서드에서 재정의 불가
클래스에선 상속이 불가능한 클래스입니다.*/
