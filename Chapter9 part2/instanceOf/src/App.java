import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("����");
    }
}

class Human extends Animal{
    public void move(){
        System.out.println("���");
    }

    public void move2(){
        System.out.println("�� ����");
    }
}

class Lion extends Animal{
    public void move(){
        System.out.println("ū�����");
    }

    public void move2(){
        System.out.println("�߿�");
    }
}

class Bird extends Animal{
    public void move(){
        System.out.println("ġŲ");
    }

    public void move2(){
        System.out.println("������");
    }
}

public class App {
    ArrayList<Animal> list = new ArrayList<Animal>();
    public static void main(String[] args) throws Exception {

        App animal = new App();
        animal.addAnimal();
        System.out.println("�ٿ� ĳ����");
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
            Animal ani = list.get(i); /*�迭�� ��Ҹ� ��� ���� Ŭ������ ����*/
            if(ani instanceof Human){ /*�ν��Ͻ��� �ڷ����� Ȯ���� �� ��ġ�Ѵٸ� ������ �ڷ����� �ٿ� ĳ����*/
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
                System.out.println("�������� �ʴ� ���Դϴ�.");
            }
        }
    }
}

/*�迭�� ��Ҹ� ����Ŭ������ ����� ����Ŭ������ �޼��带 ������� ����. ������ �ٿ� ĳ������ �Ͽ� �� Ŭ������ �޼��带 ��밡���ϰ� ��.
���� ����ȯ�� ��� (Human ani = (Human) human) �����Ͽ��� ������ �߻����� ������ ���� �� ������ �߻��ϴ� ��Ȳ�� �߻��� ���� �ִ�.
������ �ڷ����� ���� ����ȯ�� �Ǵ� �ڷ����� �����Ͽ� ���� �߻�X*/