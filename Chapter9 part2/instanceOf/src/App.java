import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물");
    }
}

class Human extends Animal{
    public void move(){
        System.out.println("사람");
    }

    public void move2(){
        System.out.println("넘 많음");
    }
}

class Lion extends Animal{
    public void move(){
        System.out.println("큰고양이");
    }

    public void move2(){
        System.out.println("야옹");
    }
}

class Bird extends Animal{
    public void move(){
        System.out.println("치킨");
    }

    public void move2(){
        System.out.println("맛있음");
    }
}

public class App {
    ArrayList<Animal> list = new ArrayList<Animal>();
    public static void main(String[] args) throws Exception {

        App animal = new App();
        animal.addAnimal();
        System.out.println("다운 캐스팅");
        animal.testCasting();
        
    }

    public void addAnimal(){
        list.add(new Human());
        list.add(new Lion());
        list.add(new Bird());

        for(Animal ani : list){
            ani.move();
        }
    }

    public void testCasting(){ 
        for(int i = 0; i < list.size(); i++){
            Animal ani = list.get(i); /*배열의 요소를 모두 상위 클래스로 선언*/
            if(ani instanceof Human){ /*인스턴스의 자료형을 확인한 후 일치한다면 변수의 자료형을 다운 캐스팅*/
                Human h = (Human) ani;
                h.move2();
            }

            else if(ani instanceof Lion){
                Lion l = (Lion) ani;
                l.move2();
            }

            else if(ani instanceof Bird){
                Bird b = (Bird) ani;
                b.move2();
            }

            else{
                System.out.println("지원하지 않는 형입니다.");
            }
        }
    }
}

/*배열의 요소를 상위클래스로 선언시 하위클래스의 메서드를 사용하지 못함. 때문에 다운 캐스팅을 하여 각 클래스의 메서드를 사용가능하게 함.
강제 형변환의 경우 (Human ani = (Human) human) 컴파일에는 오류가 발생하지 않지만 실행 시 오류가 발생하는 상황이 발생할 수도 있다.
변수의 자료형과 강제 형변환이 되는 자료형이 동일하여 오류 발생X*/