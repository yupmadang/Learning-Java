public class Student {
    private static int serialNum=1000; /*�ܺο��� ������ �����ϱ� ���� private����, set�޼��尡 �����Ƿ� �й� ���� �Ұ�*/
    public String stdName;
    public int grade;

    public Student(String stdName, int grade){ /*Student ������*/
        this.stdName = stdName;
        this.grade = grade;
    }
    
    public static int getSerialNum(){ /*�ο��� �й��ο��� ���� �޼���*/
        serialNum++;
        return serialNum;
    }

    public String getStdName(){
        return stdName;
    }

    public void setStdName(String stdName){
        this.stdName = stdName;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void showInfo(){ /*�л��� ������ ��ȯ�ϴ� �޼���*/
        System.out.println("�л��̸�: "+stdName);
        System.out.println("�й�: "+ getSerialNum());
        System.out.println("�г�: "+ grade);
        System.out.println("�л�ī���ȣ: "+StudentCard.getCardNum());/*Ŭ������ �����Ͽ� ī���ȣ�� ��ȯ�ϴ� �ڵ�*/
    }
}