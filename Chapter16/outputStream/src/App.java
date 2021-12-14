import java.io.IOException;
import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        /*int i = 65;
        try(FileOutputStream fos = new FileOutputStream("Output.txt")){
            while(i < 69){
                fos.write(i);
                i++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");*/

        /*FileOutputStream fos = new FileOutputStream("Output2.txt",true);
        try(fos){
            byte[] bs = new byte[26];
            byte data = 65;
            for(int i = 0; i < bs.length; i++){
                bs[i] = data;
                data++;
            }
            fos.write(bs); 전체 배열을 한번에 출력
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");*/

        FileOutputStream fos = new FileOutputStream("Output3.txt",true);
        try(fos){
            byte[] bs = new byte[26];
            byte data = 65;
            for(int i = 0; i < bs.length; i++){
                bs[i] = data;
                data++;
            }
            fos.write(bs, 2, 10); /*배열의 3번째 단위부터 10개 출력*/
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");
    }
}

/*OutputStream은 쓰는 바이트 스트림에서 최상위 클래스입니다.*/
