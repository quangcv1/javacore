package ch02_Obj_Oriented_Programming._7_Nested_classes;

/**
 * @inner-class: without static
 * @inner_class-vs-_static_nested_class:
 * @without_static: there is an essential difference. A Member obj knows to which network it belongs.
 * @see <a href="https://learning.oreilly.com/library/view/core-java-for/9780138051846/ch02.xhtml#sec2_8">sec2_8</a>
 * @see Network
 * @see "Core java for the impatient"
 */
public class _7_2_Inner_classes {
    public static void main(String[] args) {
        //CREATE MY SOCIAL NETWORK MyFace vs facebook
        var myFace = new Network();
        Network.Member fred = myFace.enroll("Fred");
        //An obj, but not enrolled
        //make the constructor private to avoid this. After make private:  private Member(String name)  in Network class with Member constructor then error
        Network.Member wilma = myFace.new Member("Wilma");
        Network.Member quang = myFace.enroll("Quang");
        System.out.println(myFace);
        try {
            fred.addFriend(wilma);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //check it after add friend
        System.out.println(fred.getFriends().toString());
        System.out.println(fred);

        //CREATE ANOTHER SOCIAL NETWORK tooter vs twitter
        var tooter = new Network();
        Network.Member barney = tooter.enroll("Barney");
        /**
         * @note: note
         * @see Network.Member#addFriend(Network.Member)
         */
        try {
            fred.addFriend(barney);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(fred);
        System.out.println(barney.memberBelongsTo(myFace));
    }

}
