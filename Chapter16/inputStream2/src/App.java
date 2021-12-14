import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;

        try{
            fis = new FileInputStream("input.txt");
            System.out.println((char)fis.read()); /*char ������ �� ��ȯ �� ���� ��ȯ*/
            System.out.println((char)fis.read()); /*1����Ʈ�� �о���̱� ������ �ѱ��� ����ϸ� ���ڰ� �������� ���߿� ��� ���� ���� ��Ʈ������ ��°���*/
            System.out.println((char)fis.read());
        }catch(IOException e){
            System.out.println(e);
        }finally{
            try{
                fis.close();
            }catch(NullPointerException e){ /*��Ʈ���� �������� �ʾ����� close�� ȣ���Ͽ� ����� ���ܸ� ó����*/
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}
