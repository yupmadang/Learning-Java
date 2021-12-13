import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ArrayExcaptionHanding {
    public static void main(String[] args) throws Exception {
        /*int arr[] = new int[5];

        try{
            for(int i = 0; i <= 5; i++){ 배열의 길이는 5지만 6자리까지 입력 (예외 발생부분)
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e){ 예외 발생시 수행되는 catch부분
            System.out.println(e);
            System.out.println("예외처리 부분");
        }
        System.out.println("시스템 종료");*/
        FileInputStream fis = null;

        try{
            fis = new FileInputStream("a.txt");
        }catch (FileNotFoundException e){
            System.out.println(e);
            return;
        }finally{
            if(fis != null){
                try{
                    fis.close(); /*ㅠㅏ일입력 스트림 해제*/
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        System.out.println("항상 수행됩니다");
        
    }
    System.out.println("여기도 수행됩니다.");
}
}
