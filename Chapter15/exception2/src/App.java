public class App {
    public static void main(String[] args) throws Exception {
        try(AutoCloseObj obj = new AutoCloseObj()){ /*사용 리소스 선언*/
            throw new Exception(); /*강제 예외 선언*/
        }catch(Exception e){
            System.out.println("예외 부분입니다.");
        }
    }
}

/*close()메서드를 명시하지 않아도 호출이 가능한 try-with-resource문으로 AutoCloseable인터페이스를 사용함.*/
