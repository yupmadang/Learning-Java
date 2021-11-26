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

    public String showInfo(){ /*super로 상위 클래스의 메서드 호출, 클래스마다 같은 이름의 메서드인데 각 기능은 잘 작동된다???*/
        return super.showInfo() +"상담원의 번호는 "+agentID+"입니다.";
    }
}
