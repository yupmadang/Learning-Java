public class StudentTest {
    public static void main (String[] args){
        chapter6 std1 = new chapter6(); /*chapter6는 참조변수 std1 = 지역 변수*/
        std1.studentName = "홍길동";
        std1.studentNum = 123456789;
        std1.showINfo();
        System.out.println(std1); /*변수가 가리키는 힙메모리 주소값 호출*/
        System.out.println("\n");

        /*std1이라는 변수를 정하면 스택에는 std1이라는 변수가 생성되고 힙메모리에는 chapter6 클래스의 값들이 저장된다.*/
        /*호출 시 힙메모리의 주소를 스택의 변수가 가리키면서 다양한 호출이 가능하다.*/

        chapter6 std2 = new chapter6();
        std2.studentName = "잉잉이";
        std2.studentNum = 45678910;
        std2.showINfo();
        System.out.println(std2); /*변수가 가리키는 힙메모리 주소값 호출*/
        System.out.println("\n");

        /*get메서드 사용결과*/

        System.out.println(std1.getStudentName()); 
        System.out.println(std1.getStudentNum());
        System.out.println(std2.getStudentName());
        System.out.println(std2.getStudentNum());
    }
}