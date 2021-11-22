public class HidingTest {
    public static void main (String[] args){   
        Hiding date = new Hiding();
        date.setDay(5); /*Hiding 클래스에 Day를 private로 숨김 set메서드를 이용하여 접근 : set메서드에 조건 추가 시 발생 가능한 오류 절감 가능 ex: 31일 까지인 달에 32를 입력*/
        System.out.println(date.getDay());


        Hiding date2 = new Hiding();
        date2.day = 8;/*Hiding 클래스에 Day를 private로 선언하여 같은 클래스 내부에만 접근이 가능하게 바꿈*/
        System.out.println(date2.day); /*오류가 뭉탱이로 난다!!!!*/
    }
    
}
