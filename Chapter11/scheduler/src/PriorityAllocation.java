public class PriorityAllocation implements Scheduler{
    public void getNextCall(){
        System.out.println("고객등급이 높은 고객의 전화를 먼저 가져옵니다.");
    }

    public void sendCallToAgent(){
        System.out.println("업무기술이 좋은 상담원에게 우선 배정합니다.");
    }
}

