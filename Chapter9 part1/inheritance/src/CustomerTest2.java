public class CustomerTest2 {
    public static void main(String[] args) throws Exception {
        int price = 10000;
        Customer cus1 = new Customer("������1", 1000);/*Customer���� �ν��Ͻ� ����*/
        cus1.showInfo();
        System.out.println(cus1.calcPrice(price));

        VIP cus2 = new VIP("������2", 1001, 10000);/*VIP���� �ν��Ͻ� ����*/
        cus2.showInfo();
        System.out.println(cus2.calcPrice(price));
        
        Customer cus3 = new VIP("������3", 1002, 10001);/*VIP���� �ν��Ͻ� ������ Customer������ ��ȯ*/
        cus3.showInfo();
        System.out.println(cus3.calcPrice(price)); /*VIP���� ��ȯ, cus2�� ���� ����� ����*/
    }
}

/*�޼���� �ν��Ͻ��� ������ ������ ���� �������� �ʰ� ��Ӱ��迡�� ���� �޼��带 ȣ�� �� �ν��Ͻ��� ���� �����ȴ�.*/
/*�޼����� ȣ���� �޼��� ����� ������ �ִ� �޸� ��ġ�� �����Ͽ� ����
����޼���� ���̺��� ���� ����: �޼����� �̸��� �ּҰ� ���� �����ȴ�. �̸��� ȣ��Ǹ� �ּҰ��� ���� ����*/

/*���� �޼��忡 ���� cus2, cus3�� �޼����� ȣ�� ����� ����*/