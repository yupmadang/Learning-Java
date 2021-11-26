public class Customer {
    protected String cusName;
    protected int cusID;
    protected String cusGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(){
        initCustomer();
    }

    public Customer(String cusName, int cusID){
        this.cusName = cusName;
        this.cusID = cusID;
        initCustomer();
    }

    private void initCustomer(){ /*������ �������� ����ϴ� �޼����̹Ƿ� private����*/
        cusGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        return price;
    }

    public String showInfo(){
        return cusName+"���� ���̵�� "+cusID+"�̰� ����� "+cusGrade+"�̸� ���ʽ� ����Ʈ��"+bonusPoint+"�Դϴ�.";
    }

    public String getCustomerName() {
        return cusName;
    }
    
}
