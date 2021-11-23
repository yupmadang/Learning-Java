public class StudentCard {    /*카드 번호를 부여하는 클래스*/
    private static int cardNum = 1100; /*private선언으로 외부에서 접근을 방지*/

    public static int getCardNum(){ /*학생이 생성될때마다 카드번호를 부여하는 메서드*/
        cardNum++;
        return cardNum;
    }
    
}
