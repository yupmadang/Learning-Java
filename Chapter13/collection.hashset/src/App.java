import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        MemberHashSet hashSet = new MemberHashSet();

        Member std1 = new Member(1000, "������1");
        Member std2 = new Member(1001, "������2");
        Member std3 = new Member(1002, "������3");
        Member std4 = new Member(1003, "������4");
        Member std5 = new Member(1004, "������5");

        hashSet.addMember(std1);
        hashSet.addMember(std2);
        hashSet.addMember(std3);
        hashSet.addMember(std4);
        hashSet.addMember(std5);
        hashSet.showAllMember();

        Member std6 = new Member(1004, "������6"); /*MemberŬ�������� ���� �޼���� �����Ͽ� ������ ���̵� �ν������� �߰����� ����.*/
        hashSet.addMember(std6);
        hashSet.showAllMember();


        
        /*HashSet<String> hash = new HashSet<String>();
        hash.add(new String("������1"));
        hash.add(new String("������2"));
        hash.add(new String("������3"));
        hash.add(new String("������4"));
        hash.add(new String("������5"));
        hash.add(new String("������5"));

        System.out.println(hash);*/
    }
}


/*Hashset�� �ߺ��� ���� �߰��� ���� �ʰ� ������ ������� ����� �ȴ�.*/
