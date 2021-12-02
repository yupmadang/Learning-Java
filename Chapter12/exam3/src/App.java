import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App { /*���� 3�� : PersonŬ������ ������ ��������*/
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class p1 = Class.forName("Person"); /*forName�޼���� Ŭ������ ������ �ν��Ͻ� ����*/

        Constructor[] cons = p1.getConstructors(); /*��� ������ ȣ��*/
        for(Constructor c : cons){
            System.out.println(c);
        }

        Field[] cons2 = p1.getFields(); /*��� �ɹ����� ȣ��*/
        for(Field c : cons2){
            System.out.println(c);
        }

        Method[] cons3 = p1.getMethods(); /*��� �޼��� ȣ��*/
        for(Method c : cons3){
            System.out.println(c);
        }
    }
}
