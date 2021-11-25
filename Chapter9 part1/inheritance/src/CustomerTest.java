public class CustomerTest {
    public static void main(String[] args) throws Exception {
        Customer cus1 = new Customer();/*생성자를 선언하면 자동으로 등급과 보너스 포인트 비율이 할당됨*/
        cus1.setCustomerID(1000);/*CustomerID에 접근은 가능하나 변수에 직접적인 접근이 아닌 메서드에 접근을 가능하게 함*/
        cus1.setCustomerName("잉잉이");
        cus1.bonusPoint = 1000;
        System.out.println(cus1.showInfo());
    }
}
