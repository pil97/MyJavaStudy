package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();
        Member lee = new Member(1,"lee");
        Member park = new Member(2,"park");
        Member kim = new Member(3,"kim");
        Member kang = new Member(4,"kang");


        memberArrayList.addMember(lee);
        memberArrayList.addMember(park);
        memberArrayList.addMember(kim);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(4);

        memberArrayList.showAllMember();

        System.out.println();
        memberArrayList.insertMember(kang,2);
        System.out.println();
        memberArrayList.showAllMember();
    }
}
