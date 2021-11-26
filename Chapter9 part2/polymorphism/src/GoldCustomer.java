public class GoldCustomer extends Customer{
    double salesRatio;

    public GoldCustomer(String cusName, int cusID){
        super(cusName, cusID); /*���� Ŭ������ ����Ʈ �����ڰ� ���⿡ super�� �θ� Ŭ������ ȣ��*/
        salesRatio = 0.1;
        bonusRatio = 0.01;
    }

    @Override /*�ֳ����̼����� �����Ϸ��� �������� �޼��������� �˸�*/
    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        return price - (int)(price*salesRatio); /*salesRatio�� double���̹Ƿ� ����� ����ȯ ���*/
    }
}
