import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        Console con = System.console();

        System.out.println("이름: ");
        String name = con.readLine();
        System.out.println("직업: ");
        String job = con.readLine();
        System.out.println("비밀번호: ");
        char[] pass = con.readPassword();
        String strPass = new String(pass);

        System.out.println(name);
        System.out.println(job);
        System.out.println(strPass);

    }
}

/*이클립스의 경우 Console 보다는 Scanner를 더 많이 사용*/
