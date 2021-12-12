public class App{
    public static void main(String[] args) throws Exception {
        MyNumber m = (x, y)-> (x >= y) ? x : y; /*람다식을 정수형 인터페이스에 대입*/
        System.out.println(m.getMax(10, 20)); /*출력*/
    }

}
