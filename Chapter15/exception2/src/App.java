public class App {
    public static void main(String[] args) throws Exception {
        try(AutoCloseObj obj = new AutoCloseObj()){ /*��� ���ҽ� ����*/
            throw new Exception(); /*���� ���� ����*/
        }catch(Exception e){
            System.out.println("���� �κ��Դϴ�.");
        }
    }
}

/*close()�޼��带 ������� �ʾƵ� ȣ���� ������ try-with-resource������ AutoCloseable�������̽��� �����.*/
