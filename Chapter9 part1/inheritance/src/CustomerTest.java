public class CustomerTest {
    public static void main(String[] args) throws Exception {
        Customer cus1 = new Customer();/*�����ڸ� �����ϸ� �ڵ����� ��ް� ���ʽ� ����Ʈ ������ �Ҵ��*/
        cus1.setCustomerID(1000);/*CustomerID�� ������ �����ϳ� ������ �������� ������ �ƴ� �޼��忡 ������ �����ϰ� ��*/
        cus1.setCustomerName("������");
        cus1.bonusPoint = 1000;
        System.out.println(cus1.showInfo());
    }
}
