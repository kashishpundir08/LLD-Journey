package phase1.miniproject;

public class Member{
    private String member;
    private int memberId;

    public Member(){
    }
    public Member(String member, int memberId){
        this.member = member;
        this.memberId = memberId;
    }

    public String getMember(){
        return this.member;
    }
    public int getMemberId(){
        return this.memberId;
    }
    public void setMember(String member){
        this.member = member;
    }
    public void  setMemberId(int memberId){
        this.memberId = memberId;
    }

}
