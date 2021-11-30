public class App {
    public static void main(String[] args) throws Exception {
        int n1 = 100;
        int n2 = 200;
        Calculator calc = new Calculator();
        System.out.println(calc.add(n1, n2));
        System.out.println(calc.substract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.square(n1));
        System.out.println(calc.divid(n1, n2));
    }
}
