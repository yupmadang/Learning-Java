import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;

        try{
            fis = new FileInputStream("input.txt");
            System.out.println((char)fis.read()); /*char 형으로 형 변환 후 값을 반환*/
            System.out.println((char)fis.read()); /*1바이트씩 읽어들이기 때문에 한글을 사용하면 문자가 깨져보임 나중에 배울 문자 단위 스트림으로 출력가능*/
            System.out.println((char)fis.read());
        }catch(IOException e){
            System.out.println(e);
        }finally{
            try{
                fis.close();
            }catch(NullPointerException e){ /*스트림이 생성되지 않았지만 close를 호출하여 생기는 예외를 처리함*/
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}
