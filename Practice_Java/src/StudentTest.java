public class StudentTest {
    public static void main (String[] args){
        chapter6 std1 = new chapter6(); /*chapter6�� �������� std1 = ���� ����*/
        std1.studentName = "ȫ�浿";
        std1.studentNum = 123456789;
        std1.showINfo();
        System.out.println(std1); /*������ ����Ű�� ���޸� �ּҰ� ȣ��*/
        System.out.println("\n");

        /*std1�̶�� ������ ���ϸ� ���ÿ��� std1�̶�� ������ �����ǰ� ���޸𸮿��� chapter6 Ŭ������ ������ ����ȴ�.*/
        /*ȣ�� �� ���޸��� �ּҸ� ������ ������ ����Ű�鼭 �پ��� ȣ���� �����ϴ�.*/

        chapter6 std2 = new chapter6(123, "������", 456, "���׵� ���ױ�");
        std2.showINfo();
        System.out.println(std1); /*������ ����Ű�� ���޸� �ּҰ� ȣ��*/
        System.out.println("\n");

        /*get�޼��� �����*/

        System.out.println(std1.getStudentName()); 
        System.out.println(std1.getStudentNum());
    }
}