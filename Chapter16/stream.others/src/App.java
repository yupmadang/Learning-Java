import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        Console con = System.console();

        System.out.println("�̸�: ");
        String name = con.readLine();
        System.out.println("����: ");
        String job = con.readLine();
        System.out.println("��й�ȣ: ");
        char[] pass = con.readPassword();
        String strPass = new String(pass);

        System.out.println(name);
        System.out.println(job);
        System.out.println(strPass);

    }
}

/*��Ŭ������ ��� Console ���ٴ� Scanner�� �� ���� ���*/
