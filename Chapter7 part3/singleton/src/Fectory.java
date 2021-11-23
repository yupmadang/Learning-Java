public class Fectory{

	/*private static Fectory instance = new Fectory();
	
	private Fectory() {}
	
	public static Fectory getInstance() {      싱글톤 패턴 부분, Fectory는 하나만 형성이 된다.
		if(instance == null) {
			instance = new Fectory();
		}
		return instance;
	}*/
	
	public Car createCar() { /*Fectory 아래의 createCar 메서드로 Car형의 객체 생성*/
		
		Car car = new Car();
		return car;
	}
}
