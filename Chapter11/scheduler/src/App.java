public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=================================");
        System.out.println("전화 상담 할당 방식을 선택하세요.");
        System.out.println("R: 한명씩 차례로 할당");
        System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P: 우선순위가 높은 고객 우선 할당");
        System.out.println("=================================");
        System.out.println("\n");

        int ch = System.in.read(); /*문자를 입력받는 코드*/
        Scheduler scheduler = null;

        if(ch == 'r' || ch == 'R'){
            scheduler = new RoundRobin();
        }

        else if(ch == 'L' || ch == 'l'){
            scheduler = new LeastJob();
        }

        else if(ch == 'P' || ch == 'p'){
            scheduler = new PriorityAllocation();
        }

        else{
            System.out.println("지원하지 않는 기능입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
