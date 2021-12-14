import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("알파벳을 하나 쓰고 [엔터]를 누르시오");

        int i;
        try{
            while((i = System.in.read()) != -1){
                System.out.println((char)i);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
}
}
