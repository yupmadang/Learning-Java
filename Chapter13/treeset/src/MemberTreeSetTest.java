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

        Member std1 = new Member(1000, "������1");
        Member std2 = new Member(1001, "������2");
        Member std3 = new Member(1002, "������3");
        Member std4 = new Member(1003, "������4");
        Member std5 = new Member(1004, "������5");

        treeSet.addMember(std1);
        treeSet.addMember(std2);
        treeSet.addMember(std3);
        treeSet.addMember(std4);
        treeSet.addMember(std5);
        treeSet.showAllMember();

        Member member = new Member(1000, "������5");
        treeSet.addMember(member);
        treeSet.showAllMember();*/

    }
}

/*���� �� ������ �߻�: � �������� ��带 �������� �̱����߱� ����
Comparable�̳� Comparator�� �̿��Ͽ� ��� ���� ������ ���ؾ� ��.*/
