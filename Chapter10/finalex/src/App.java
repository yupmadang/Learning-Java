public class App {
    public static void main(String[] args) throws Exception {
        Constant c1 = new Constant();
        /*c1.NUM = 200; final ������ ���� ���� ������ �Ұ����ϴ�.*/

        System.out.println(c1.num);
        System.out.println(c1.NUM);
        System.out.println("\n");

        System.out.println(Define.GOOD_MORNING); /*static ���� ����Ǿ� Ŭ���������� ��������*/
        System.out.println(Define.MATH);
        System.out.println(Define.MAX);
        System.out.println(Define.ENG);
    }
}

/*final�� ����� Ŭ����, �޼���, ������ ���� �������� ����� �ǹ��ϰ� �޼��忡���� ���� �޼��忡�� ������ �Ұ�
Ŭ�������� ����� �Ұ����� Ŭ�����Դϴ�.*/
