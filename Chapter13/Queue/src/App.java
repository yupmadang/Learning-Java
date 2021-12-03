import java.util.ArrayList;

public class App {

    private ArrayList <String> queue = new ArrayList<String>();

    public void enqueue(String data){
        queue.add(data);
    }

    public String deQueue(){
        int len = queue.size();
        if(len == 0){
            System.out.println("큐가 비었습니다.");
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

/*대기열로 선착순으로 도착한 인원 할당과 같은 상황에 활용가능*/
