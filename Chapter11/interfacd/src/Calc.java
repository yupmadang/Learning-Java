public interface Calc{ /*�������̽� ����: �߻�޼���� ����θ� �̷����*/
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int n1, int n2);
    int substract(int n1, int n2);
    int times(int n1, int n2);
    int divid(int n1, int n2);

    default void description(){/*�������̽����� �����Ͽ� implements�ϴ� ���� Ŭ�������� ����� �⺻ �޼���*/
        System.out.println("���� ���⸦ �����մϴ�.");
    }

    static int total(int arr[]){ /*�����޼��� ����*/
        int total = 0;

        for(int i : arr){
            total += i;
        }

        return total;
    }
}

/*�߻�޼��尡 �����Ƿ� �翬�� �ν��Ͻ��� �������� ����.*/