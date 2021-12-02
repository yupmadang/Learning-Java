public class StringBuiler {
    public static void main(String[] args) throws Exception {
        String javaStr = new String("java"); /*문자열을 사용할 수 있도록 String 클래스 선언*/
        System.out.println(System.identityHashCode(javaStr)); /*주소값 반환*/

        StringBuilder buffer = new StringBuilder(javaStr); /*StringBuiler 클래스를 활용하여 buffer 선언, char[]형*/
        System.out.println(System.identityHashCode(buffer)); /*주소 반환*/

        buffer.append(" and"); /*append로 문자열 추가*/
        buffer.append(" android");
        buffer.append(" programming");
        System.out.println(System.identityHashCode(buffer)); /*주소 반환*/

        javaStr = buffer.toString(); /*String클래스 반환*/
        System.out.println(javaStr);
        System.out.println(System.identityHashCode(javaStr)); /*주소 반환*/
    }
}


/*문자열은 변하지 않기 때문에 문자열을 연결시킬때 char[]배열을 사용한 후 문자열로 반환하여
연결한 문자열은 주소 값이 기존의 값과는 다르게 나타난다. 이때 사용하는 StringBuiler는 
두 클래스 중 하나를 사용하여 문자열의 연결이나 변경을 시행합니다.*/