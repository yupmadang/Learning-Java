public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 10;
        int num2 = 20;

        CalculatorComplete calc = new CalculatorComplete(); /*��üŬ������ ������ �Ϸ�Ǿ� �ν��Ͻ� ������ ����*/
        Calculator calc2 = new CalculatorComplete();
        Calc calc3 = new CalculatorComplete();

        System.out.println("======CalculatorComplete��=====");
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divid(num1, num2));
        System.out.println("======Calculator��=====");
        System.out.println(calc2.add(num1, num2));
        System.out.println(calc2.substract(num1, num2));
        System.out.println(calc2.times(num1, num2));
        System.out.println(calc2.divid(num1, num2));
        System.out.println("======Calc��=====");
        System.out.println(calc3.add(num1, num2));
        System.out.println(calc3.substract(num1, num2));
        System.out.println(calc3.times(num1, num2));
        System.out.println(calc3.divid(num1, num2));
    }
}

/*�������̽��� ���� Ŭ�������� ������ ����ȯ�� �����ϴ�. �߻�Ŭ������ ������ Ư¡*/