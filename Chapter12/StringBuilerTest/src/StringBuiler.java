public class StringBuiler {
    public static void main(String[] args) throws Exception {
        String javaStr = new String("java"); /*���ڿ��� ����� �� �ֵ��� String Ŭ���� ����*/
        System.out.println(System.identityHashCode(javaStr)); /*�ּҰ� ��ȯ*/

        StringBuilder buffer = new StringBuilder(javaStr); /*StringBuiler Ŭ������ Ȱ���Ͽ� buffer ����, char[]��*/
        System.out.println(System.identityHashCode(buffer)); /*�ּ� ��ȯ*/

        buffer.append(" and"); /*append�� ���ڿ� �߰�*/
        buffer.append(" android");
        buffer.append(" programming");
        System.out.println(System.identityHashCode(buffer)); /*�ּ� ��ȯ*/

        javaStr = buffer.toString(); /*StringŬ���� ��ȯ*/
        System.out.println(javaStr);
        System.out.println(System.identityHashCode(javaStr)); /*�ּ� ��ȯ*/
    }
}


/*���ڿ��� ������ �ʱ� ������ ���ڿ��� �����ų�� char[]�迭�� ����� �� ���ڿ��� ��ȯ�Ͽ�
������ ���ڿ��� �ּ� ���� ������ ������ �ٸ��� ��Ÿ����. �̶� ����ϴ� StringBuiler�� 
�� Ŭ���� �� �ϳ��� ����Ͽ� ���ڿ��� �����̳� ������ �����մϴ�.*/