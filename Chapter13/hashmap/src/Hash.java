import java.util.HashMap;
import java.util.Iterator;

public class Hash {
    private HashMap <Integer, Member> hash; /*key, value 쌍으로 선언*/

    public Hash(){
        hash = new HashMap<Integer, Member>();
    }

    public void addMember(Member member){/*Map에 회원을 추가하는 메서드*/
        hash.put(member.getMemberId(),member);
    }

    public boolean removeMember(int memberId){ /*회원을 제거하는 메서드*/
        if(hash.containsKey(memberId)){
            hash.remove(memberId);
            return true;
        }

        System.out.println("존재하지 않습니다.");
        return false;
    }

    public void showAll(){ /*Iterater를 이용해서 전체 회원 출력*/
        Iterator<Integer> ir = hash.keySet().iterator();
        while(ir.hasNext()){
            int key = ir.next();/*key값을 가져옴*/
            Member member = hash.get(key);/*key로부터 value를 가져옴*/
            System.out.println(member);
        }

        System.out.println();
    }
}

/*모든 자료를 한번에 선회하는 것은 불가능해서 먼저 key값을 가져온 후 Set객체로 반환한 후에 get메서드로 value값을 가져옵니다.*/
