public class CustomerTest2 {
    public static void main(String[] args) throws Exception {
        int price = 10000;
        Customer cus1 = new Customer("잉잉이1", 1000);/*Customer형의 인스턴스 생성*/
        cus1.showInfo();
        System.out.println(cus1.calcPrice(price));

        VIP cus2 = new VIP("잉잉이2", 1001, 10000);/*VIP형의 인스턴스 생성*/
        cus2.showInfo();
        System.out.println(cus2.calcPrice(price));
        
        Customer cus3 = new VIP("잉잉이3", 1002, 10001);/*VIP형의 인스턴스 생성과 Customer형으로 반환*/
        cus3.showInfo();
        System.out.println(cus3.calcPrice(price)); /*VIP형의 반환, cus2와 같은 결과를 가짐*/
    }
}

/*메서드는 인스턴스가 형성될 때마다 새로 형성되지 않고 상속관계에서 같은 메서드를 호출 시 인스턴스에 따라 결정된다.*/
/*메서드의 호출은 메서드 명령의 집합이 있는 메모리 위치를 참조하여 실행
가상메서드는 테이블이 따로 생성: 메서드의 이름과 주소가 같이 형성된다. 이름이 호출되면 주소값에 따라 실행*/

/*가상 메서드에 따라 cus2, cus3의 메서드의 호출 결과는 같다*/