public class App{
    public static void main(String[] args) throws Exception {
        MyNumber m = (x, y)-> (x >= y) ? x : y; /*���ٽ��� ������ �������̽��� ����*/
        System.out.println(m.getMax(10, 20)); /*���*/
    }

}
