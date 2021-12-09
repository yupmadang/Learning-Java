class OutClass{
    private int num = 10;
    private static int sNum = 20;

    static class InStaticClass{
        int inNum = 100;
        static int sInNum = 200;

        void inTest(){
            System.out.println("���� Ŭ������ �ν��Ͻ� ���� ��� : "+inNum);
            System.out.println("���� Ŭ������ ���� ���� ��� : "+sInNum);
            System.out.println("�ܺ� Ŭ������ ���� ���� ��� : "+sNum);
        }

        static void sTest(){
            System.out.println("�ܺ� Ŭ������ �������� ���"+sNum);
            System.out.println("���� Ŭ������ �������� ���"+sInNum);
        }

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
        sInClass.inTest();
    }
}
