public class Student {
    int studentID;
    String studentName;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String toString(){
        return studentName +","+ studentID;
    }

    public boolean equals(Object obj){ /*equals()�޼��带 �������Ͽ� �ν��Ͻ��� �ּҰ� �ƴ� studentID�� ������ true�� ��ȯ�ϵ��� ������*/
        if(obj instanceof Student){
            Student std = (Student)obj;
            if(this.studentID == std.studentID){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    
    public static void main(String[] args) throws Exception {
        Student std1 = new Student(1000, "������1");
        Student std2 = std1;
        Student std3 = new Student(1000,"������1");

        if(std1 == std2){
            System.out.println("�� �ν��Ͻ��� �����ϴ�.");
        }
        else{
            System.out.println("�� �ν��Ͻ��� �ٸ��ϴ�.");
        }

        if(std1.equals(std2)){
            System.out.println("�� �ν��Ͻ��� �����ϴ�.");
        }
        else{
            System.out.println("�� �ν��Ͻ��� �ٸ��ϴ�.");
        }

        if(std1 == std3){/*�ܼ� �ּ� Ȯ������ �ٸ� �ν��Ͻ���� �ν�*/
            System.out.println("�� �ν��Ͻ��� �����ϴ�.");
        }
        else{
            System.out.println("�� �ν��Ͻ��� �ٸ��ϴ�.");
        }

        if(std1.equals(std3)){ /*�ּҴ� �ٸ����� ���̵� ���⿡ ���� �ν��Ͻ���� ��ȯ*/
            System.out.println("�� �ν��Ͻ��� �����ϴ�.");
        }
        else{
            System.out.println("�� �ν��Ͻ��� �ٸ��ϴ�.");
        }
    }
}

/*�⺻������ equal()�޼���� �ν��Ͻ��� �ּҸ� ���Ͽ� ���� �ν��Ͻ����� Ȯ���ϳ�
�ν��Ͻ��� �ּҰ��ٸ� ��쿡�� ������ �ν��Ͻ��� ��찡 �ִ�. �̸� ���� ���ϼ��̶��ϰ�
�� ��� equal(�޼��带 �������Ͽ� ������ ���ϼ����� �ƴ� ���� ���ϼ��� Ȯ���ؾ� �Ѵ�.*/