
import java.util.ArrayList; /*ArrayList 사용*/
public class CustomerTest {
    public static void main(String[] args) throws Exception {
        ArrayList<Customer> cusList = new ArrayList<Customer>();

        Customer cus1 = new Customer("잉잉이1", 1000); /*Customer형을 반환하는 cus1 변수*/
        Customer cus2 = new Customer("잉잉이2", 1001);
        Customer cus3 = new VIPCustomer("잉잉이3", 1002, 10000);/*하위 인스턴스로 상위 클래스 형 반환*/
        Customer cus4 = new VIPCustomer("잉잉이4", 1003, 10001);
        Customer cus5 = new GoldCustomer("잉잉이5", 1004);
        Customer cus6 = new GoldCustomer("잉잉이6", 1005);
        Customer cus7 = new GoldCustomer("잉잉이7", 1006);

        cusList.add(cus1);
        cusList.add(cus2);
        cusList.add(cus3);
        cusList.add(cus4);
        cusList.add(cus5);
        cusList.add(cus6);
        cusList.add(cus7);

        System.out.println("======정보 출력======");
        System.out.println("\n");
        
        for(Customer customer : cusList){
            System.out.println(customer.showInfo()); /*애노테이션을 선언하지 않은 메서드(재정의)*/
        }

        System.out.println("\n");
        System.out.println("======할인율과 포인트 출력======");
        System.out.println("\n");

        int price = 100000;
        for(Customer customer : cusList){
            int cost = customer.calcPrice(price); /*에노테이션을 선언한 메서드(재정의 됨)*/
            System.out.println(customer.getCustomerName()+ "님이 "+cost+"원 지불했습니다.");
            System.out.println(customer.getCustomerName()+ "님의 현재 포인트는 "+customer.bonusPoint+"입니다.");
        }
        
    }
}

/*상속 관계의 클래스에서 선언된 같은 메서드는 반환되는 클래스가 상위클래스로 동일하여도 호출시 각각 재정의된 메서드로 작동한다.*/