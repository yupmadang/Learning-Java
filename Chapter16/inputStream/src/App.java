import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("���ĺ��� �ϳ� ���� [����]�� �����ÿ�");

        int i;
        try{
            while((i = System.in.read()) != -1){
                System.out.println((char)i);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
}
}
