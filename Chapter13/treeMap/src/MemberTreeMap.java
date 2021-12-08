import java.util.TreeMap;
import java.util.Iterator;


public class MemberTreeMap{
    private TreeMap<Integer, Member> tree;

    public MemberTreeMap(){
        tree = new TreeMap<Integer, Member>(); /*Integer형은 기본적으로 Comparable인터페이스가 구현이 되어 있음. 따라서 따로 정의할 필요는 없음*/
    }

    public void addMember(Member member){
        tree.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId){
        if(tree.containsKey(memberId)){
            tree.remove(memberId);
            return true;
        }

        System.out.println("존재하지 않습니다.");
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