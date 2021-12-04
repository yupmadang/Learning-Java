import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

class MyCompare implements Comparator<String>{
    
    public int compare(String s1, String s2){
        return (s1.compareTo(s2))*-1;
    }
}


public class MemberTreeSetTest {
    public static void main(String[] args) throws Exception {
        Set<String> set = new TreeSet<String>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set);


        /*MemberTreeSet treeSet = new MemberTreeSet();

        Member std1 = new Member(1000, "잉잉이1");
        Member std2 = new Member(1001, "잉잉이2");
        Member std3 = new Member(1002, "잉잉이3");
        Member std4 = new Member(1003, "잉잉이4");
        Member std5 = new Member(1004, "잉잉이5");

        treeSet.addMember(std1);
        treeSet.addMember(std2);
        treeSet.addMember(std3);
        treeSet.addMember(std4);
        treeSet.addMember(std5);
        treeSet.showAllMember();

        Member member = new Member(1000, "잉잉이5");
        treeSet.addMember(member);
        treeSet.showAllMember();*/

    }
}

/*실행 시 오류가 발생: 어떤 기준으로 노드를 형성할지 미구현했기 때문
Comparable이나 Comparator를 이용하여 노드 정의 기준을 정해야 함.*/
