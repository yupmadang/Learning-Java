class OutClass{
    private int num = 10;
    private static int sNum = 20;

    static class InStaticClass{
        int inNum = 100;
        static int sInNum = 200;

        void inTest(){
            System.out.println("내부 클래스의 인스턴스 변수 사용 : "+inNum);
            System.out.println("내부 클래스의 정적 변수 사용 : "+sInNum);
            System.out.println("외부 클래스의 정적 변수 사용 : "+sNum);
        }

        static void sTest(){
            System.out.println("외부 클래스의 정적변수 사용"+sNum);
            System.out.println("내부 클래스의 정적변수 사용"+sInNum);
        }

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        sInClass.inTest();
    }
}
