package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member lee = new Member(1001,"lee");
        Member park = new Member(1002,"park");
        Member kim = new Member(1003,"kim");

        memberHashSet.addMember(lee);
        memberHashSet.showAllMember();

        memberHashSet.addMember(park);
        memberHashSet.showAllMember();

        memberHashSet.addMember(kim);
        memberHashSet.showAllMember();

        Member kang = new Member(1003,"kim");
        memberHashSet.addMember(kang);
        memberHashSet.showAllMember();
    }
}
