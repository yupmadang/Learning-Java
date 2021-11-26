public class VIPCustomer extends Customer{
    private int agentID;
    double salesRatio;

    public VIPCustomer(String cusName, int cusID, int agentID){
        super(cusName, cusID);
        cusGrade = "VIP";
        salesRatio = 0.1;
        bonusRatio = 0.05;
        this.agentID = agentID;
    }
    @Override
    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        return price - (int)(price*salesRatio);
    }

    public int getAgentID(){
        return agentID;
    }

    public String showInfo(){ /*super�� ���� Ŭ������ �޼��� ȣ��, Ŭ�������� ���� �̸��� �޼����ε� �� ����� �� �۵��ȴ�???*/
        return super.showInfo() +"������ ��ȣ�� "+agentID+"�Դϴ�.";
    }
}
