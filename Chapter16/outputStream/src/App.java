import java.io.IOException;
import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        /*int i = 65;
        try(FileOutputStream fos = new FileOutputStream("Output.txt")){
            while(i < 69){
                fos.write(i);
                i++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("����� �Ϸ�Ǿ����ϴ�.");*/

        /*FileOutputStream fos = new FileOutputStream("Output2.txt",true);
        try(fos){
            byte[] bs = new byte[26];
            byte data = 65;
            for(int i = 0; i < bs.length; i++){
                bs[i] = data;
                data++;
            }
            fos.write(bs); ��ü �迭�� �ѹ��� ���
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("����� �Ϸ�Ǿ����ϴ�.");*/

        FileOutputStream fos = new FileOutputStream("Output3.txt",true);
        try(fos){
            byte[] bs = new byte[26];
            byte data = 65;
            for(int i = 0; i < bs.length; i++){
                bs[i] = data;
                data++;
            }
            fos.write(bs, 2, 10); /*�迭�� 3��° �������� 10�� ���*/
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("����� �Ϸ�Ǿ����ϴ�.");
    }
}

/*OutputStream�� ���� ����Ʈ ��Ʈ������ �ֻ��� Ŭ�����Դϴ�.*/
