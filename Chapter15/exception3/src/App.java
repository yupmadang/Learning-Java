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

        try { /*다중예외 처리*/
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

/*다중 예외처리시 맨 위에 Exception클래스를 사용하면 아래의 예외처리문은 모두 오류가 발생합니다.
이미 최상위 클래스로 예외처리가 되면서 아래의 예외처리문장에서 처리할 예외가 없기 때문입니다.*/
