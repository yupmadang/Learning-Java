public class Calculater {
    int num1;
    int num2;

    public Calculater (int num1 , int num2){  /*생성자 형성*/
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int getNum1(){ /*변수를 반환받기 위한 get메서드 선언*/
        return num1;
    }

    public void setNum1(int num1){ /*생성자에 변수를 입력하기 위한 set메서드 선언*/
        this.num1 = num1;
    }

    public int getNum2(){
        return num2;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    void Function (int num1, int num2, int type){
        float result;
         switch (type) { /*스위치문을 이용한 사칙연상 함수 설정*/
            case 1 : result = num1 + num2;
                     System.out.println(result);
                     break;

            case 2 : result = num1 - num2;
                     System.out.println(result);
                     break;

            case 3 : result = num1 / num2;
                     System.out.println(result);
                     break;

            case 4 : result = num1 % num2;
                     System.out.println(result);
                     break;
                     
            default : System.out.println("적용되는 모드는 없습니다.");
         }
    }
}