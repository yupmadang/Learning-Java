public class Student {
    public String stdName;
    public int grade;
    public int money;
    
    public Student (String stdName, int money){ /*Student 생성자 생성*/
        this.stdName = stdName;
        this.money = money;
    }

    public void takeBus(Bus bus){ /*Bus를 참조변수로 하는 bus를 이용한 버스를 타면 돈을 지불하게 하는 메서드*/
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSub(Subway sub){
        sub.take(1500);
        this.money-=1500;
    }

    public void takeTexi(Texi texi){
        texi.take(3300);
        this.money -= 3300;
    }

    public void showInfo(){ /*학생의 정보와 남는 돈 반환*/
        System.out.println(stdName + "에게 남은 돈은 "+ money + "입니다.");
    }
}
