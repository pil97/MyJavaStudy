package collection.arraylist;

import collection.Member;

public class MemberIteratorTest {
    public static void main(String[] args) {
        MemberIterator ir = new MemberIterator();
        Member lee = new Member(1,"lee");
        Member park = new Member(2,"park");
        Member kim = new Member(3,"kim");
        Member kang = new Member(4,"kang");


        ir.addMember(lee);
        ir.addMember(park);
        ir.addMember(kim);

        ir.showAllMember();

        ir.removeMember(3);

        ir.showAllMember();

//        System.out.println();
//        ir.insertMember(kang,2);
//        System.out.println();
//        ir.showAllMember();
    }
}
