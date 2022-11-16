package ch02_Obj_Oriented_Programming._7_Nested_classes;

import java.util.ArrayList;
/**
 * @inner-class: without static
 * @inner_class-vs-_static_nested_class: static nested class does not have a reference to an obj of the enclosing class (just like a static method does not have the this reference). Use a static nested class when the instances of the nested class don't need to know to which instance of the enclosing class they belong. Use an inner class only if this information is important
 * @without_static: there is an essential difference. A Member obj knows to which network it belongs.
 * @note: each inner class obj has a reference to an obj of the enclosing class. For example, the method members.remove(this) actually means outer.members.remove(this). Where we use <strong><em>outer</em></strong> to denote the hidden reference to the enclosing class
 * @note2: inner classes can access outer instance variables and invoke outer methods
 * @syntax_for_note2: 2.7.3 syntax rules for inner classes "OuterClass.this"
 */

public class Network {
    // Social network in which each member has friends that are also members
    public class Member { //without static and Member is an inner class of Network
        private String name;
        private ArrayList<Member> friends = new ArrayList<>(); //Member in member, in case each member has friends that are also members
        //constructor
        public Member(String name) {
            this.name = name;
            //friends = new ArrayList<>(); //no need because already initialize
            //enroll(name);
        }

        //deactivate when member want
        public void deactivate() {
            //INNER CLASS CAN ACCESS OUTER INSTANCE VARIABLES AND INVOKE OUTER METHODS.
            //1: OUTER INSTANCE VARIABLES: a method of an inner class can access instance variables of its outer class. In this case, they're the instance variables of the outer class obj that created it, the unpopular myFace network.
            members.remove(this); //== Network.this.members.remove(this)
            //2. OUTER METHODS: inner class can also invoke methods of the outer class through its outer class instance.
            //Ex: when we deactivate member then we also unenroll this member
            unenroll(this);// == Network.this.unenroll(this)
        }

        //check whether a Member obj belongs to a particular network
        public boolean memberBelongsTo(Network n) {
            return Network.this == n;
        }

        public void addFriend(Member newFriend) throws Exception {
            //check if the same network or not
            if(newFriend.memberBelongsTo(Network.this)) {
                friends.add(newFriend);
            } else {
                throw new Exception("Human Exception: Not same network");
            }

        }

        public ArrayList<Member> getFriends() {
            return friends;
        }

        public String toString() {
            var result = new StringBuilder(name);
            result.append(" with friends ");
            for(Member friend: friends) {
                result.append(friend.name);
                result.append(", ");
            }
            return result.toString();
        }
    }

    //declare an ArrayList for members
    private ArrayList<Member> members = new ArrayList<>();
    // add a member to the network
    public Member enroll(String name) {
        //invoke inner class constructor on any instance of an outer class
        var newMember = new Member(name); //== Member newMember = this.new Member(name)
        members.add(newMember);
        return newMember;
    }

    //unenroll a member
    public void unenroll(Member m) {
        System.out.println("Unenroll an member");
    }

    //toString
    public String toString() {
        return members.toString();
    }
}
