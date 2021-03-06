package subject7.ex2;

public class Member implements Comparable{

    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + "입니다";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            return member.getMemberId() == this.memberId;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return String.valueOf(memberId).hashCode();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Member) {
            Member member = (Member) o;
            return this.memberId - member.getMemberId();
        }
        return -1;
    }
}
