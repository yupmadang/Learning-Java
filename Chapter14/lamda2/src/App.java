

public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "hello";
        String s2 = "world";

        StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);

        concat2.makeString(s1, s2);
    }
}

/*람다식으로 인터페이스 구현은 좋으나 한 인터페이스에 하나의 메서드만이 포함된다*/
