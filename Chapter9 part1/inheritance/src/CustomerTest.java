public class CustomerTest {
    public static void main(String[] args) throws Exception {
        Customer cus1 = new Customer("������", 1000);
        cus1.bonusPoint = 1000;
        System.out.println(cus1.showInfo());

        VIP cus2 = new VIP();
        cus2.setCustomerID(1001); /*VIPŬ������ Customer Ŭ������ ��� �޾� set�޼��� ����� ����*/
        cus2.setCustomerName("������2");
        cus2.bonusPoint = 10000;
        int price = 10000;
        System.out.println(cus2.calcPrice(price)); /*�������� �޼��� ȣ��*/
        System.out.println(cus2.showInfo());
        System.out.println(cus2.showInfo2());

        Customer cus3 = new VIP("������3", 1002, 10000); /*������ ����ȯ�� ��Ÿ��. VIPŬ������ ����� �޾� Customer ������ ����� ������. �ν��Ͻ� ������ Ŭ�������� Customer�� ������ ������.*/
        cus3.bonusPoint = 10000;
        System.out.println(cus3.calcPrice(price)); /*Customer Ŭ������ ���ε� 9000�� ������ �ȴ�... ��???*/
    }
}

/*������ ����ȯ�� Ŭ������ �������� �ִ� ��� �ֻ��� Ŭ������ �ν��Ͻ��� Ŭ������ ������ �����ϴ�.*/
/*�޼���� �ν��Ͻ��� ������ ������ ���� �������� �ʰ� ��Ӱ��迡�� ���� �޼��带 ȣ�� �� �ν��Ͻ��� ���� �����ȴ�.*/
/*�޼����� ȣ���� �޼��� ����� ������ �ִ� �޸� ��ġ�� �����Ͽ� ����
����޼���� ���̺��� ���� ����: �޼����� �̸��� �ּҰ� ���� �����ȴ�. �̸��� ȣ��Ǹ� �ּҰ��� ���� ����*/