

public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "hello";
        String s2 = "world";

        StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);

        concat2.makeString(s1, s2);
    }
}

/*���ٽ����� �������̽� ������ ������ �� �������̽��� �ϳ��� �޼��常�� ���Եȴ�*/
