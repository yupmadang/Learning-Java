class Outer{
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i){ /*Ŭ������ �̸��� ���� �ٷ� Ŭ������ ����*/
        int num = 100;
        
        return new Runnable(){ /*������ ������ ����ϴ� Runnable �������̽�*/

    
            public void run(){

              /*num = 200; ���� ������ ����� ���� �߻� -> �Ʒ� ����ο� getRunnable�޼��尡 ����� �� ����Ǵ� �޼����̱� ���� 
                i+=50;*/

                System.out.println(i);/*�޼��尡 ���ø޸𸮿��� ������� ������ ���� -> ��������Ŭ������ ���������� ��� ����� �����*/
                System.out.println(num);

            }
        };
    }

    Runnable runner = new Runnable() {/*�������̽��� �߻�Ŭ������ ������ �����ϰ� Ŭ������ ������ ����*/
        public void run(){
            System.out.println("Runnable�� ������ �͸� Ŭ���� ����");
        }
    };
}

public class App {
    public static void main(String[] args) throws Exception {
        Outer outer = new Outer();
        Runnable runner = outer.getRunnable(10);
        runner.run();
        outer.runner.run();
    }
}
