public class VIP extends Customer{ /*extends ������ Customer Ŭ������ ��� ���� -> ���� Ŭ������ ������ ����� ����*/
    private int agentID;
    double saleRatio;

    public VIP(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIP() ������ ȣ��"); /*���� �����Ǵ� �ν��Ͻ��� ������*/
    }

    public VIP(String customerName, int customerID, int agentID){
        super(customerName, customerID); /*���� Ŭ������ VIP�� ����Ŭ������ �ּҸ� �˰� ����. �̸� ȣ���ϴ� ����� super()*/
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        System.out.println("VIP() ������ ȣ��");
    }

    public int getAgentID(){
        return agentID;
    }

    public String showInfo2(){
        return super.showInfo()+"���� ���̵�� "+agentID+"�Դϴ�.";
    }
    
}
