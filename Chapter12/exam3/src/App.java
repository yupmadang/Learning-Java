import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App { /*문제 3번 : Person클래스의 정보를 가져오기*/
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class p1 = Class.forName("Person"); /*forName메서드로 클래스를 가져와 인스턴스 생성*/

        Constructor[] cons = p1.getConstructors(); /*모든 생성자 호출*/
        for(Constructor c : cons){
            System.out.println(c);
        }

        Field[] cons2 = p1.getFields(); /*모든 맴버변수 호출*/
        for(Field c : cons2){
            System.out.println(c);
        }

        Method[] cons3 = p1.getMethods(); /*모든 메서드 호출*/
        for(Method c : cons3){
            System.out.println(c);
        }
    }
}
