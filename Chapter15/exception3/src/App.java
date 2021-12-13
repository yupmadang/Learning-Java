import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }
    public static void main(String[] args) throws Exception {
        App test = new App();

        try { /*���߿��� ó��*/
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

/*���� ����ó���� �� ���� ExceptionŬ������ ����ϸ� �Ʒ��� ����ó������ ��� ������ �߻��մϴ�.
�̹� �ֻ��� Ŭ������ ����ó���� �Ǹ鼭 �Ʒ��� ����ó�����忡�� ó���� ���ܰ� ���� �����Դϴ�.*/
