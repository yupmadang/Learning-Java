public class Customer{

    protected String customerName; /*protected ������ ��Ӱ��迡 �ִ� Ŭ���������� ������ �����ϰ� �ܺο����� ������ �Ұ����ϴ�.*/
    protected String customerGrade;
    protected int customerID;
    int bonusPoint;
    double bonusRatio;

    public Customer(){ /*����Ʈ �����ڿ� ���, ���ʽ� ������ �����Ѵ� -> ������ ���ÿ� ����� �ο�����*/
        customerGrade = "Silver";
        bonusRatio = 0.01;
    }

    int calcPrice (int price){ /*���ʽ� ����Ʈ�� �����ϴ� �޼���*/
        bonusPoint += price *bonusRatio;
        return price;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){ /*�ܺο��� �̸��� ������ �����ϰ� �ϴ� set�޼���*/
        this.customerName = customerName;
    }

    public int getCustomerID(){
        return customerID;
    }

    public void setCustomerID(int customerID){ /*�ܺο��� ��ȣ�� ������ �����ϰ� �ϴ� set�޼���*/
        this.customerID = customerID;
    }

    public String getCustomerGrade(){
        return customerGrade;
    }

    public String showInfo(){
        return customerName + "���� ��ȣ�� "+customerID+"�̰� ����� "+customerGrade+"�̸� ����Ʈ�� "+bonusPoint+"�Դϵ�.";
    }
}