public class App {
    public static void main(String[] args) throws Exception {
        Hash hash1 = new Hash();/*hash1�� ����*/

        Member mem1 = new Member(1000, "������1");
        Member mem2 = new Member(1001, "������2");
        Member mem3 = new Member(1002, "������3");
        Member mem4 = new Member(1003, "������4");
        Member mem5 = new Member(1004, "������5");

        hash1.addMember(mem1);
        hash1.addMember(mem2);
        hash1.addMember(mem3);
        hash1.addMember(mem4);
        hash1.addMember(mem5);

        hash1.showAll();
        
        hash1.removeMember(1002); /*��Ҹ� ����*/
        hash1.showAll();

    }
}
