public class ComputerTest {
    public static void main(String[] args) throws Exception {
        Computer c1 = new Computer(); /*�߻� Ŭ������ �ν��Ͻ��� ���� �� �� ����. ��� �޼��尡 ������ ���� �ƴ�*/
        Computer c2 = new DeskTop();
        Computer c3 = new NoteBook();
        Computer c4 = new MyNoteBook();

    }
}

/*�߻�Ŭ������ ����ϴ� ����: ComputerŬ������ desplay()�� typing()�� �߻�޼���� ������ ������
�� �޼��峭 ���� �ٸ� Ŭ�������� �ٸ� ���� ������ �ϰ� �׷����� CoputerŬ�������� �����ϴ� �ͺ���
�޼��� ������ ����Ŭ�������� �ϰ� ���� Ŭ������ �ڵ� ������ �����ϴ� ��*/