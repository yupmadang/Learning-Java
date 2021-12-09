class Outer{
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i){ /*클래스의 이름을 빼고 바로 클래스를 형성*/
        int num = 100;
        
        return new Runnable(){ /*스레드 생성시 사용하는 Runnable 인터페이스*/

    
            public void run(){

              /*num = 200; 지역 변수를 변경시 오류 발생 -> 아래 실행부에 getRunnable메서드가 실행된 후 실행되는 메서드이기 때문 
                i+=50;*/

                System.out.println(i);/*메서드가 스택메모리에서 사라져도 참조는 가능 -> 지역내부클래스의 지역변수는 모두 상수로 변경됨*/
                System.out.println(num);

            }
        };
    }

    Runnable runner = new Runnable() {/*인터페이스나 추상클래스형 변수를 선언하고 클래스를 생성해 대입*/
        public void run(){
            System.out.println("Runnable이 구현된 익명 클래스 변수");
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
