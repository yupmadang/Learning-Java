public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=================================");
        System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
        System.out.println("R: �Ѹ� ���ʷ� �Ҵ�");
        System.out.println("L: ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
        System.out.println("P: �켱������ ���� �� �켱 �Ҵ�");
        System.out.println("=================================");
        System.out.println("\n");

        int ch = System.in.read(); /*���ڸ� �Է¹޴� �ڵ�*/
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
            System.out.println("�������� �ʴ� ����Դϴ�.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
