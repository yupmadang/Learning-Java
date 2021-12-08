import java.util.HashMap;
import java.util.Iterator;

public class Hash {
    private HashMap <Integer, Member> hash; /*key, value ������ ����*/

    public Hash(){
        hash = new HashMap<Integer, Member>();
    }

    public void addMember(Member member){/*Map�� ȸ���� �߰��ϴ� �޼���*/
        hash.put(member.getMemberId(),member);
    }

    public boolean removeMember(int memberId){ /*ȸ���� �����ϴ� �޼���*/
        if(hash.containsKey(memberId)){
            hash.remove(memberId);
            return true;
        }

        System.out.println("�������� �ʽ��ϴ�.");
        return false;
    }

    public void showAll(){ /*Iterater�� �̿��ؼ� ��ü ȸ�� ���*/
        Iterator<Integer> ir = hash.keySet().iterator();
        while(ir.hasNext()){
            int key = ir.next();/*key���� ������*/
            Member member = hash.get(key);/*key�κ��� value�� ������*/
            System.out.println(member);
        }

        System.out.println();
    }
}

/*��� �ڷḦ �ѹ��� ��ȸ�ϴ� ���� �Ұ����ؼ� ���� key���� ������ �� Set��ü�� ��ȯ�� �Ŀ� get�޼���� value���� �����ɴϴ�.*/
