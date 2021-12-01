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

    public int hashCode(){ /*해시코드 값으로 학번을 반환하는 메서드 재정의*/
        return studentID;
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

        System.out.println(std1.hashCode()); /*재정의한 메서드로 반환*/
        System.out.println(std3.hashCode());

        System.out.println(System.identityHashCode(std1)); /*실제 인스턴스 주소를 반환*/
        System.out.println(System.identityHashCode(std3));
    
    }
}

/*기본적으로 equal()메서드는 인스턴스의 주소를 비교하여 같은 인스턴스인지 확인하나
인스턴스의 주소가다른 경우에도 동일한 인스턴스인 경우가 있다. 이를 논리적 동일성이라하고
이 경우 equal(메서드를 재정의하여 물리적 동일성만이 아닌 논리적 동일성도 확보해야 한다.*/

/*hashCode()메서드는 기본적으로 객체의 저장위치를 반환하녀 정보의 검색 등에 활용한다.
equals로 재정의하여 동일한 인스턴스라고하면 해시코드의 값도 같은 값을 출력하도록 재정의가 
필요하다*/