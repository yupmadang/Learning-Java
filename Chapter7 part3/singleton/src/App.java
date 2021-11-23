public class App {
    private static final Fectory Fectory = null;

    public static void main(String[] args) throws Exception {
        Fectory fectory = Fectory.getInstance();
        Car mySonata = fectory.createCar();
        Car yourSonata = fectory.createCar();
        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());

        
    }
}
