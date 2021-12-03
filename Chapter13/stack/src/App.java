import java.util.ArrayList;

public class App {
    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data){/*스택에 요소추가하는 메서드*/
        arrayStack.add(data);
    }

    public String pop(){ /*스택에 요소를 제거하고 그 값을 반환하는 메서드*/
        int len = arrayStack.size();
        if(len == 0){
            System.out.println("스택이 비었습니다.");
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

/*스택은 말그대로 상자처럼 쌓아 올리고 최근에 쌓아 올린 순서대로 해제하는 자료 구조로 
가장 최근에 접근한 요소 찾기나 게임에서 한 수 물리는 등의 작업을 할 때 사용합니다.*/
