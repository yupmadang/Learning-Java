public class Calculater {
    int num1;
    int num2;

    public Calculater (int num1 , int num2){  /*������ ����*/
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int getNum1(){ /*������ ��ȯ�ޱ� ���� get�޼��� ����*/
        return num1;
    }

    public void setNum1(int num1){ /*�����ڿ� ������ �Է��ϱ� ���� set�޼��� ����*/
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
         switch (type) { /*����ġ���� �̿��� ��Ģ���� �Լ� ����*/
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
                     
            default : System.out.println("����Ǵ� ���� �����ϴ�.");
         }
    }
}