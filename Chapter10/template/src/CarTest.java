public class CarTest {
    public static void main(String[] args) throws Exception {
        System.out.println("=========AICar========");
        Car Ai = new AiCar();
        Ai.run();

        System.out.println("=========ManualCar========");
        Car Manual = new ManualCar();
        Manual.run();
    }
}
