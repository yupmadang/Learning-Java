public class App {
    public static void main(String[] args) throws Exception {
        MemberTreeMap tree = new MemberTreeMap();

        Member mem1 = new Member(1000, "������1");
        Member mem2 = new Member(1001, "������2");
        Member mem3 = new Member(1002, "������3");
        Member mem4 = new Member(1003, "������4");
        Member mem5 = new Member(1004, "������5");

        tree.addMember(mem1);
        tree.addMember(mem2);
        tree.addMember(mem3);
        tree.addMember(mem4);
        tree.addMember(mem5);

        tree.showAllMember();

        tree.removeMember(1002);
        tree.showAllMember();
    }
}
