public class Member {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
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

    public void setMemberId(String memberName){
        this.memberName = memberName;
    }

    public void showAll(){
        System.out.println(memberId +","+memberName);
    }
    
}
