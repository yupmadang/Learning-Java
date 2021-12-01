public class Point {/*������ �ǹ��ϴ� Ŭ����*/
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x="+x+","+"y="+y;
    }
}

class Circle implements Cloneable{ /*������ �ص� �ȴٴ� Cloneable�������̽� ���*/
    Point point;
    int radius;

    Circle (int x, int y, int radius){
        this.radius = radius;
        point = new Point(x, y);
    }

    public String toString(){
        return "������ "+point+"�̰�, "+"�������� "+ radius+"�Դϴ�.";
    }

    public Object clone() throws CloneNotSupportedException{/*�޼��忡�� �߻������� ������ ����ó��*/
        return super.clone();
    }


    public static void main(String[] args) throws Exception {
        Circle circle = new Circle(10, 20, 30);
        Circle copyCircle = (Circle)circle.clone();

        System.out.println(circle);
        System.out.println(copyCircle);
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));

    }
    }


