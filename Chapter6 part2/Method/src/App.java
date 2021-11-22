public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 15;
        int num2 = 20;

        Calculater calc = new Calculater();
        System.out.println(calc.Case1(num1, num2));
        System.out.println(calc.Case2(num1, num2));
        System.out.println(calc.Case3(num1, num2));
        System.out.println(calc.Case4(num1, num2));
        System.out.println(calc.Case5(num1, num2));
    }
}
