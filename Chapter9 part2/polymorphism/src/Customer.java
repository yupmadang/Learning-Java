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

    private void initCustomer(){ /*생성자 내에서만 사용하는 메서드이므로 private선언*/
        cusGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        return price;
    }

    public String showInfo(){
        return cusName+"님의 아이디는 "+cusID+"이고 등급은 "+cusGrade+"이며 보너스 포인트는"+bonusPoint+"입니다.";
    }

    public String getCustomerName() {
        return cusName;
    }
    
}
