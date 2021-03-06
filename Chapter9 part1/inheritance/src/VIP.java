public class VIP extends Customer{ /*extends 예약어로 Customer 클래스를 상속 받음 -> 상위 클래스의 변수를 사용이 가능*/
    private int agentID;
    double saleRatio;

    public VIP(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIP() 생성자 호출"); /*힙에 생성되는 인스턴스를 보여줌*/
    }

    public VIP(String customerName, int customerID, int agentID){
        super(customerName, customerID); /*하위 클래스인 VIP는 상위클래스의 주소를 알고 있음. 이를 호출하는 예약어 super()*/
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        System.out.println("VIP() 생성자 호출");
    }

    @Override /*애노테이션: 컴파일러에 정보를 제공, 메서드가 재정의 됨을 알려줌, 표준 애노테이션과 메타 애노테이션이 존재*/
    public int calcPrice(int price){
        bonusPoint += bonusRatio * price;
        return (int)(price - saleRatio*price);
    }

    public int getAgentID(){
        return agentID;
    }

    public String showInfo2(){
        return super.showInfo()+"상담원 아이디는 "+agentID+"입니다.";
    }
    
}
