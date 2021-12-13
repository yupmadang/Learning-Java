import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ArrayExcaptionHanding {
    public static void main(String[] args) throws Exception {
        /*int arr[] = new int[5];

        try{
            for(int i = 0; i <= 5; i++){ �迭�� ���̴� 5���� 6�ڸ����� �Է� (���� �߻��κ�)
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e){ ���� �߻��� ����Ǵ� catch�κ�
            System.out.println(e);
            System.out.println("����ó�� �κ�");
        }
        System.out.println("�ý��� ����");*/
        FileInputStream fis = null;

        try{
            fis = new FileInputStream("a.txt");
        }catch (FileNotFoundException e){
            System.out.println(e);
            return;
        }finally{
            if(fis != null){
                try{
                    fis.close(); /*�Ф����Է� ��Ʈ�� ����*/
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        System.out.println("�׻� ����˴ϴ�");
        
    }
    System.out.println("���⵵ ����˴ϴ�.");
}
}
