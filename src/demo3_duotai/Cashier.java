package demo3_duotai;

public class Cashier {
    private member member;

    public demo3_duotai.member getMember() {
        return member;
    }

    public void setMember(demo3_duotai.member member) {
        this.member = member;
    }
    public void settlement(){
        member.buyBook();
    }
    public void settlement(member member){
        member.buyBook();
    }
    public member getMember(String name){
        if(name.equals("pri")) {
            return new pri_member();
        }else {
            return new superMember();
        }
    }
}
