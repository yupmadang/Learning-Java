import java.util.TreeMap;
import java.util.Iterator;


public class MemberTreeMap{
    private TreeMap<Integer, Member> tree;

    public MemberTreeMap(){
        tree = new TreeMap<Integer, Member>(); /*Integer���� �⺻������ Comparable�������̽��� ������ �Ǿ� ����. ���� ���� ������ �ʿ�� ����*/
    }

    public void addMember(Member member){
        tree.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId){
        if(tree.containsKey(memberId)){
            tree.remove(memberId);
            return true;
        }

        System.out.println("�������� �ʽ��ϴ�.");
        return false;
    }

    public void showAllMember(){
        Iterator<Integer> ir = tree.keySet().iterator();
        while(ir.hasNext()){
            int key = ir.next();
            Member member = tree.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}