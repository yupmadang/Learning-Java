interface PrintString{
    void showString(String str);
}

public class App {
    public static void main(String[] args) throws Exception {
        PrintString p = s -> System.out.println(s);
        p.showString("Hello ramda1");
        showMyString(p); /*메서드의 매개변수로 람다식을 대입*/

        PrintString r = returnString();
        r.showString("hello");
    }

    public static void showMyString(PrintString p){ /*매개변수를 인터페이스 형으로 받음*/
        p.showString("Hello ramda2");
    }

    public static PrintString returnString(){
        PrintString r = s -> System.out.println(s + "world");
        return r;
    }
} 
