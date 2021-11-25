public class VIP extends Customer{
    private int agentID;
    double saleRatio;

    public VIP(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID(){
        return agentID;
    }
    
}
