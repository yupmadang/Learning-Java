import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet(){ /*객체 생성시 HashSet호출*/
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member){/*멤버 추가 메서드*/
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){ /*Hashset에서는 요소 제거를 위해 iterator를 사용*/
        Iterator <Member> ir = hashSet.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println("존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for(Member member : hashSet){
            System.out.println(member);
        }
        System.out.println();
    }
    
}
