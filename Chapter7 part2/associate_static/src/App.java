public class App {
    public static void main(String[] args) throws Exception {
        Student std1 = new Student("������", 2);
        Student std2 = new Student("������2", 3);
    
        std1.showInfo(); /*�й��� �ο������鼭 ���� ���*/
        System.out.println("\n");
        std2.showInfo();
        

        /*�������� 2�� �л��� ������ �ű⿡ ī���ȣ�߰�
        static ������ 2�� �����Ͽ� ���� �й��� ī���ȣ�� ��Ÿ��.
        �����Ϳ����� cardNum�� serialNum�� �����ϰ� ���ÿ��� ������ �Ű������� ��ġ
        ������ std1�� std2�� �ν��Ͻ��� �����ȴ�.
        
        static ������ ������ �̸����� Ŭ������ �̸����� ���� �����Ѵ�*/

    }
}
