public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class p1 = person.getClass(); /*getClass�޼��� ���*/
        System.out.println(p1.getName());

        Class p2 = Person.class; /*���� Ŭ���� ������ ����*/
        System.out.println(p2.getName());

        Class p3 = Class.forName("classex.Person"); /*Ŭ���� �̸����� ��������, �ڹ� �����ε� ���*/
        System.out.println(p3.getName());

        Person person1 = new Person();
        System.out.println(person1);

        Class pClass = Class.forName("classex.Person");
        Person person2 = (Person)pClass.newInstance(); /*�ڹ�9 ���ķδ� ������� �ʴ� newInstance�޼���*/
        System.out.println(person2);
    }
}

/*Class.forName()�޼���� ������ ���� �ٲٸ� ���� �ٸ� Ŭ������ �ε��� �� �ֽ��ϴ�. �̸� �̿��Ͽ� ���ϴ� ���� ���ڿ��� �����ϰ� �̸� �ε��Ͽ�
Ȱ���� �� �ֽ��ϴ�. �׷��� ���ڿ��� �Է��ϸ� ������ �߻��Ͽ��� ������ �߿��� ������ ǥ�õ��� �����Ƿ� ���ǰ� �ʿ��մϴ�.*/
