public class Calculator implements Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int substract(int n1, int n2){
        return n1 - n2;
    }

    public int times(int n1, int n2){
        return n1 * n2;
    }

    public int divid(int n1, int n2){
        return n1 / n2;
    }

    public int square(int n1){
        return n1*n1;
    }
}