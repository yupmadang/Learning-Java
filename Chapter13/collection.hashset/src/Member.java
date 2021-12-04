public class Member {
    private String memberName;
    private int memberId;

    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName =memberName;
    }

    public int hashCode(){
        return memberId;
    }

    public boolean equals(Object obj){ /*���� ���ϼ��� ������ �޼���*/
        if(obj instanceof Member){
            Member member = (Member)obj;
            if(this.memberId == member.memberId){
                return true;
            }
            else{
                return false;
            }
        }

        return false;
    }

    public int getMemberId(){
        return memberId;
    }

    public void setMemberId(int memberId){
        this.memberId = memberId;
    }

    public String getMemberName(){
        return memberName;
    }

    public void setMemberName(String memberName){
        this.memberName = memberName;
    }

    public String toString(){
        return memberName +"�� ���̵�� "+memberId+"�Դϴ�.";
    }
    
}
