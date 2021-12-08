public class App {
    public static void main(String[] args) throws Exception {
        Hash hash1 = new Hash();/*hash1¸¦ ¼±¾ð*/

        Member mem1 = new Member(1000, "À×À×ÀÌ1");
        Member mem2 = new Member(1001, "À×À×ÀÌ2");
        Member mem3 = new Member(1002, "À×À×ÀÌ3");
        Member mem4 = new Member(1003, "À×À×ÀÌ4");
        Member mem5 = new Member(1004, "À×À×ÀÌ5");

        hash1.addMember(mem1);
        hash1.addMember(mem2);
        hash1.addMember(mem3);
        hash1.addMember(mem4);
        hash1.addMember(mem5);

        hash1.showAll();
        
        hash1.removeMember(1002); /*¿ä¼Ò¸¦ Á¦°Å*/
        hash1.showAll();

    }
}
