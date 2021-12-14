import java.io.IOException;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        FileWriter fos = new FileWriter("writer.txt");
        try(fos){
            fos.write('A');
            char buf[] = {'B' ,'C' ,'D' ,'E' ,'F' ,'G'};
            
            fos.write(buf);
            fos.write("�� ����");
            fos.write(buf, 1, 2);
            fos.write("65");
            
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("����� �Ϸ�Ǿ����ϴ�.");
    }
}
