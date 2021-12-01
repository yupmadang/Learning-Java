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

    public boolean equals(Object obj){ /*equals()메서드를 재정의하여 인스턴스의 주소가 아닌 studentID가 같으면 true를 반환하도록 재정의*/
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
        Student std1 = new Student(1000, "잉잉이1");
        Student std2 = std1;
        Student std3 = new Student(1000,"잉잉이1");

        if(std1 == std2){
            System.out.println("두 인스턴스는 같습니다.");
        }
        else{
            System.out.println("두 인스턴스는 다릅니다.");
        }

        if(std1.equals(std2)){
            System.out.println("두 인스턴스는 같습니다.");
        }
        else{
            System.out.println("두 인스턴스는 다릅니다.");
        }

        if(std1 == std3){/*단순 주소 확인으로 다른 인스턴스라고 인식*/
            System.out.println("두 인스턴스는 같습니다.");
        }
        else{
            System.out.println("두 인스턴스는 다릅니다.");
        }

        if(std1.equals(std3)){ /*주소는 다르지만 아이디가 같기에 같은 인스턴스라고 반환*/
            System.out.println("두 인스턴스는 같습니다.");
        }
        else{
            System.out.println("두 인스턴스는 다릅니다.");
        }
    }
}

/*기본적으로 equal()메서드는 인스턴스의 주소를 비교하여 같은 인스턴스인지 확인하나
인스턴스의 주소가다른 경우에도 동일한 인스턴스인 경우가 있다. 이를 논리적 동일성이라하고
이 경우 equal(메서드를 재정의하여 물리적 동일성만이 아닌 논리적 동일성도 확보해야 한다.*/