public class CustomerTest {
    public static void main(String[] args) throws Exception {
        Customer cus1 = new Customer("잉잉이", 1000);
        cus1.bonusPoint = 1000;
        System.out.println(cus1.showInfo());

        VIP cus2 = new VIP();
        cus2.setCustomerID(1001); /*VIP클래스가 Customer 클래스를 상속 받아 set메서드 사용이 가능*/
        cus2.setCustomerName("잉잉이2");
        cus2.bonusPoint = 10000;
        int price = 10000;
        System.out.println(cus2.calcPrice(price)); /*재정의한 메서드 호출*/
        System.out.println(cus2.showInfo());
        System.out.println(cus2.showInfo2());

        Customer cus3 = new VIP("잉잉이3", 1002, 10000); /*묵시적 형변환을 나타냄. VIP클래스는 상속을 받아 Customer 변수를 사용이 가능함. 인스턴스 생성의 클래스형을 Customer로 선언이 가능함.*/
        cus3.bonusPoint = 10000;
        System.out.println(cus3.calcPrice(price)); /*Customer 클래스의 형인데 9000이 산출이 된다... 왜???*/
    }
}

/*묵시적 형변환은 클래스가 여러개가 있는 경우 최상위 클래스로 인스턴스의 클래스로 선언이 가능하다.*/
/*메서드는 인스턴스가 형성될 때마다 새로 형성되지 않고 상속관계에서 같은 메서드를 호출 시 인스턴스에 따라 결정된다.*/
/*메서드의 호출은 메서드 명령의 집합이 있는 메모리 위치를 참조하여 실행
가상메서드는 테이블이 따로 생성: 메서드의 이름과 주소가 같이 형성된다. 이름이 호출되면 주소값에 따라 실행*/