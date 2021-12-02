public class App {
    public static void main(String[] args) throws Exception { /*문제 2번: 물리적 동일성을 가지짖 않는 인스턴스들의 논리적 동일성를 확인*/
        MyDate m1 = new MyDate(2021, 12, 2); /*두 인스턴스는 서로 주소가 달라 물리적 동일성은 가지지 않음*/
        MyDate m2 = new MyDate(2021, 12, 2);

        System.out.println(m1.equals(m2)); /*재정의된 메서드 호출*/
        System.out.println("==========");
        System.out.println(m1.hashCode());/*재정의한 해시값 반환*/
        System.out.println(m2.hashCode());
        System.out.println("논리적 동일성을 가집니다.");
}
}
