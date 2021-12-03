public class GenericPrinterTest {
    public static void main(String[] args) throws Exception {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();

        powderPrinter.setMetrial(new Powder());
        powderPrinter.printing();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMetrial(new Plastic());
        plasticPrinter.printing();
    }
}
