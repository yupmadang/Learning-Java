class Outer{
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i){
        int num = 100;
        
        class MyRunnable implements Runnable{ /*������ ������ ����ϴ� Runnable �������̽�*/
            int localNum = 10;
    
        public void run(){

            /*num = 200; ���� ������ ����� ���� �߻� -> �Ʒ� ����ο� getRunnable�޼��尡 ����� �� ����Ǵ� �޼����̱� ���� 
            i+=50;*/

            System.out.println(i);/*�޼��尡 ���ø޸𸮿��� ������� ������ ���� -> ��������Ŭ������ ���������� ��� ����� �����*/
            System.out.println(num);
            System.out.println(localNum);
            System.out.println(outNum+"�ܺ� Ŭ������ �ν��Ͻ� ����");
            System.out.println(Outer.sNum+"�ܺ� Ŭ���� ���� ����");

        }
    }
        return new MyRunnable();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Outer outer = new Outer();
        Runnable runner = outer.getRunnable(10);
        runner.run();
    }
}
