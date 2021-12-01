public class Point {/*원점을 의미하는 클래스*/
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

class Circle implements Cloneable{ /*복제를 해도 된다는 Cloneable인터페이스 사용*/
    Point point;
    int radius;

    Circle (int x, int y, int radius){
        this.radius = radius;
        point = new Point(x, y);
    }

    public String toString(){
        return "원점은 "+point+"이고, "+"반지름은 "+ radius+"입니다.";
    }

    public Object clone() throws CloneNotSupportedException{/*메서드에서 발생가능한 오류를 예외처리*/
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


