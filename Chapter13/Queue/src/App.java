import java.util.ArrayList;

public class App {

    private ArrayList <String> queue = new ArrayList<String>();

    public void enqueue(String data){
        queue.add(data);
    }

    public String deQueue(){
        int len = queue.size();
        if(len == 0){
            System.out.println("ť�� ������ϴ�.");
            return null;
        }

        return (queue.remove(0));
    }
    public static void main(String[] args) throws Exception {
        App a = new App();

        a.enqueue("A");
        a.enqueue("B");
        a.enqueue("C");

        System.out.println(a.deQueue());
        System.out.println(a.deQueue());
        System.out.println(a.deQueue());
    }
}

/*��⿭�� ���������� ������ �ο� �Ҵ�� ���� ��Ȳ�� Ȱ�밡��*/
