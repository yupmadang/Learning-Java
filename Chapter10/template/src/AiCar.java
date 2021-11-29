public class AiCar extends Car{
    @Override
    public void drive(){
        System.out.println("자율주행하는 차입니다.");
    }

    @Override
    public void stop(){
        System.out.println("자동으로 멈춥니다.");
    }
}
