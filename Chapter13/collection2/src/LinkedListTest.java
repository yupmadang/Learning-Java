import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) throws Exception {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println(linkedList);

        linkedList.add(1,"D");
        System.out.println(linkedList);

        linkedList.addFirst("O");
        System.out.println(linkedList);

        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
}
}

/*링크드리스트는 자료의 변동이 많은 경우에 사용하기 용이하나 정적으로 있거나 배열의 몇 번째 요소를 찾아야 하는지에는
ArrayList를 사용하는 것이 나을 수 있음.*/