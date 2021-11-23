public class Car{

    private static int serialNum = 10000; /*자동차의 번호를 부여하기 위한 ststic 선언*/
    private int carNum;
    
    public Car() { /*인스턴스가 생성될 시 번호가 1 증가 하고 변수에 대입하는 메소드*/
		serialNum++;
		carNum = serialNum;
	}

    public int getCarNum(){ /*get메소드로 carNum 반환*/
        return carNum;
    }
}