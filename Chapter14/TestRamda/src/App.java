interface PrintString{
    void showString(String str);
}

public class App {
    public static void main(String[] args) throws Exception {
        PrintString p = s -> System.out.println(s);
        p.showString("Hello ramda1");
        showMyString(p); /*�޼����� �Ű������� ���ٽ��� ����*/

        PrintString r = returnString();
        r.showString("hello");
    }

    public static void showMyString(PrintString p){ /*�Ű������� �������̽� ������ ����*/
        p.showString("Hello ramda2");
    }

    public static PrintString returnString(){
        PrintString r = s -> System.out.println(s + "world");
        return r;
    }
} 
