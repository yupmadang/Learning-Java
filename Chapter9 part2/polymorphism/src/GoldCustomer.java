public class GoldCustomer extends Customer{
    double salesRatio;

    public GoldCustomer(String cusName, int cusID){
        super(cusName, cusID); /*상위 클래스에 디폴트 생성자가 없기에 super로 부모 클래스를 호출*/
        salesRatio = 0.1;
        bonusRatio = 0.01;
    }

    @Override /*애노테이션으로 컴파일러에 재정의한 메서드임으로 알림*/
    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        return price - (int)(price*salesRatio); /*salesRatio는 double형이므로 명시적 형변환 사용*/
    }
}
