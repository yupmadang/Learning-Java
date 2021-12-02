public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class p1 = person.getClass(); /*getClass메서드 사용*/
        System.out.println(p1.getName());

        Class p2 = Person.class; /*직접 클래스 파일을 대입*/
        System.out.println(p2.getName());

        Class p3 = Class.forName("classex.Person"); /*클래스 이름으로 가져오기, 자바 동적로딩 방식*/
        System.out.println(p3.getName());

        Person person1 = new Person();
        System.out.println(person1);

        Class pClass = Class.forName("classex.Person");
        Person person2 = (Person)pClass.newInstance(); /*자바9 이후로는 사용하지 않는 newInstance메서드*/
        System.out.println(person2);
    }
}

/*Class.forName()메서드는 변수의 값만 바꾸면 서로 다른 클래스를 로드할 수 있습니다. 이를 이용하여 원하는 것을 문자열로 저장하고 이를 로딩하여
활용할 수 있습니다. 그러나 문자열을 입력하면 오류가 발생하여도 검파일 중에선 오류가 표시되지 않으므로 주의가 필요합니다.*/
