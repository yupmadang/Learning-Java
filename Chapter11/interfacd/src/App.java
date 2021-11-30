public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 10;
        int num2 = 20;

        CalculatorComplete calc = new CalculatorComplete(); /*실체클래스로 구현이 완료되어 인스턴스 생성이 가능*/
        Calculator calc2 = new CalculatorComplete();
        Calc calc3 = new CalculatorComplete();

        System.out.println("======CalculatorComplete형=====");
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divid(num1, num2));
        System.out.println("======Calculator형=====");
        System.out.println(calc2.add(num1, num2));
        System.out.println(calc2.substract(num1, num2));
        System.out.println(calc2.times(num1, num2));
        System.out.println(calc2.divid(num1, num2));
        System.out.println("======Calc형=====");
        System.out.println(calc3.add(num1, num2));
        System.out.println(calc3.substract(num1, num2));
        System.out.println(calc3.times(num1, num2));
        System.out.println(calc3.divid(num1, num2));
    }
}

/*인터페이스도 상위 클래스로의 묵시적 형변환이 가능하다. 추상클래스와 유사한 특징*/