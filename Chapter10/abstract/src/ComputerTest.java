public class ComputerTest {
    public static void main(String[] args) throws Exception {
        Computer c1 = new Computer(); /*추상 클래스는 인스턴스를 생성 할 수 없다. 모든 메서드가 구현된 것이 아님*/
        Computer c2 = new DeskTop();
        Computer c3 = new NoteBook();
        Computer c4 = new MyNoteBook();

    }
}

/*추상클래스를 사용하는 이유: Computer클래스의 desplay()와 typing()을 추상메서드로 선언한 이유는
두 메서드난 각각 다른 클래스에서 다른 값을 가져야 하고 그러려면 Coputer클래스에서 정의하는 것보다
메서드 선언은 상위클래스에서 하고 하위 클래스에 코드 구현을 위임하는 것*/