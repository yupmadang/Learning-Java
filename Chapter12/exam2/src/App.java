public class App {
    public static void main(String[] args) throws Exception { /*���� 2��: ������ ���ϼ��� ����¢ �ʴ� �ν��Ͻ����� ���� ���ϼ��� Ȯ��*/
        MyDate m1 = new MyDate(2021, 12, 2); /*�� �ν��Ͻ��� ���� �ּҰ� �޶� ������ ���ϼ��� ������ ����*/
        MyDate m2 = new MyDate(2021, 12, 2);

        System.out.println(m1.equals(m2)); /*�����ǵ� �޼��� ȣ��*/
        System.out.println("==========");
        System.out.println(m1.hashCode());/*�������� �ؽð� ��ȯ*/
        System.out.println(m2.hashCode());
        System.out.println("���� ���ϼ��� �����ϴ�.");
}
}
