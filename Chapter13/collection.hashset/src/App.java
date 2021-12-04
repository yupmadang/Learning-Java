import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        MemberHashSet hashSet = new MemberHashSet();

        Member std1 = new Member(1000, "À×À×ÀÌ1");
        Member std2 = new Member(1001, "À×À×ÀÌ2");
        Member std3 = new Member(1002, "À×À×ÀÌ3");
        Member std4 = new Member(1003, "À×À×ÀÌ4");
        Member std5 = new Member(1004, "À×À×ÀÌ5");

        hashSet.addMember(std1);
        hashSet.addMember(std2);
        hashSet.addMember(std3);
        hashSet.addMember(std4);
        hashSet.addMember(std5);
        hashSet.showAllMember();

        Member std6 = new Member(1004, "À×À×ÀÌ6"); /*MemberÅ¬·¡½º¿¡¼­ ³í¸®Àû ¸Ş¼­µå·Î Á¤ÀÇÇÏ¿© µ¿ÀÏÇÑ ¾ÆÀÌµğ¸¦ ÀÎ½ÄÇÔÀ¸·Î Ãß°¡µÇÁö ¾ÊÀ½.*/
        hashSet.addMember(std6);
        hashSet.showAllMember();


        
        /*HashSet<String> hash = new HashSet<String>();
        hash.add(new String("À×À×ÀÌ1"));
        hash.add(new String("À×À×ÀÌ2"));
        hash.add(new String("À×À×ÀÌ3"));
        hash.add(new String("À×À×ÀÌ4"));
        hash.add(new String("À×À×ÀÌ5"));
        hash.add(new String("À×À×ÀÌ5"));

        System.out.println(hash);*/
    }
}


/*HashsetÀº Áßº¹µÈ °ªÀº Ãß°¡°¡ µÇÁö ¾Ê°í ¼ø¼­¿Í »ó°ü¾øÀÌ Ãâ·ÂÀÌ µÈ´Ù.*/
