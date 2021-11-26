
import java.util.ArrayList; /*ArrayList ���*/
public class CustomerTest {
    public static void main(String[] args) throws Exception {
        ArrayList<Customer> cusList = new ArrayList<Customer>();

        Customer cus1 = new Customer("������1", 1000); /*Customer���� ��ȯ�ϴ� cus1 ����*/
        Customer cus2 = new Customer("������2", 1001);
        Customer cus3 = new VIPCustomer("������3", 1002, 10000);/*���� �ν��Ͻ��� ���� Ŭ���� �� ��ȯ*/
        Customer cus4 = new VIPCustomer("������4", 1003, 10001);
        Customer cus5 = new GoldCustomer("������5", 1004);
        Customer cus6 = new GoldCustomer("������6", 1005);
        Customer cus7 = new GoldCustomer("������7", 1006);

        cusList.add(cus1);
        cusList.add(cus2);
        cusList.add(cus3);
        cusList.add(cus4);
        cusList.add(cus5);
        cusList.add(cus6);
        cusList.add(cus7);

        System.out.println("======���� ���======");
        System.out.println("\n");
        
        for(Customer customer : cusList){
            System.out.println(customer.showInfo()); /*�ֳ����̼��� �������� ���� �޼���(������)*/
        }

        System.out.println("\n");
        System.out.println("======�������� ����Ʈ ���======");
        System.out.println("\n");

        int price = 100000;
        for(Customer customer : cusList){
            int cost = customer.calcPrice(price); /*�������̼��� ������ �޼���(������ ��)*/
            System.out.println(customer.getCustomerName()+ "���� "+cost+"�� �����߽��ϴ�.");
            System.out.println(customer.getCustomerName()+ "���� ���� ����Ʈ�� "+customer.bonusPoint+"�Դϴ�.");
        }
        
    }
}

/*��� ������ Ŭ�������� ����� ���� �޼���� ��ȯ�Ǵ� Ŭ������ ����Ŭ������ �����Ͽ��� ȣ��� ���� �����ǵ� �޼���� �۵��Ѵ�.*/