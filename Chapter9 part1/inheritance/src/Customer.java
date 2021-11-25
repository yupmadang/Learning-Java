public class Customer{

    protected String customerName; /*protected 선언은 상속관계에 있는 클래스에서만 참조가 가능하고 외부에서는 참조가 불가능하다.*/
    protected String customerGrade;
    protected int customerID;
    int bonusPoint;
    double bonusRatio;

    public Customer(){ /*디폴트 생성자에 등급, 보너스 비율을 선언한다 -> 생성과 동시에 등급을 부여받음*/
        customerGrade = "Silver";
        bonusRatio = 0.01;
    }

    int calcPrice (int price){ /*보너스 포인트를 적립하는 메서드*/
        bonusPoint += price *bonusRatio;
        return price;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){ /*외부에서 이름에 접근을 가능하게 하는 set메서드*/
        this.customerName = customerName;
    }

    public int getCustomerID(){
        return customerID;
    }

    public void setCustomerID(int customerID){ /*외부에서 번호에 접근을 가능하게 하는 set메서드*/
        this.customerID = customerID;
    }

    public String getCustomerGrade(){
        return customerGrade;
    }

    public String showInfo(){
        return customerName + "님의 번호는 "+customerID+"이고 등급은 "+customerGrade+"이며 포인트는 "+bonusPoint+"입니디.";
    }
}