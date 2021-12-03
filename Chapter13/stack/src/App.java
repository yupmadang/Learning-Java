import java.util.ArrayList;

public class App {
    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data){/*���ÿ� ����߰��ϴ� �޼���*/
        arrayStack.add(data);
    }

    public String pop(){ /*���ÿ� ��Ҹ� �����ϰ� �� ���� ��ȯ�ϴ� �޼���*/
        int len = arrayStack.size();
        if(len == 0){
            System.out.println("������ ������ϴ�.");
            return null;
        }

        return (arrayStack.remove(len-1));
    }
    public static void main(String[] args) throws Exception {
        App stack = new App();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

/*������ ���״�� ����ó�� �׾� �ø��� �ֱٿ� �׾� �ø� ������� �����ϴ� �ڷ� ������ 
���� �ֱٿ� ������ ��� ã�⳪ ���ӿ��� �� �� ������ ���� �۾��� �� �� ����մϴ�.*/
