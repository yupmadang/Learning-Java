public interface Calc{
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int n1, int n2);
    int substract(int n1, int n2);
    int times(int n1, int n2);
    int divid(int n1, int n2);
    int square(int n1);

    static int total(int arr[]){ /*정적메서드 정의*/
        int total = 0;

        for(int i : arr){
            total += i;
        }
        
        return total;
    }

}