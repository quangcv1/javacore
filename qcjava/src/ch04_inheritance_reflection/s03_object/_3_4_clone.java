package ch04_inheritance_reflection.s03_object;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Don't override "clone" unless u have a good reason to do so. Less than 5 percent of the classes in the standard Java lib implement "clone"
 * @purpose_clone: is to make a "clone" of an object - a distinct object with the same state of the original. If you mutate one of the objects, the other stays unchanged.
 * @CloneNotSupportedException: is an exception in Java that is thrown to indicate that the "clone()" method in class "Object" was called to clone an object, but that object's class does not implement the Cloneable interface.
 * @overrdie_clone_from_subclass: applications that override the "clone()" method can also throw this exception to indicate that an obj could not or should not be cloned.
 * @Object.clone: simply copies all instance variables from the original to the cloned object. That is fine if the variables are primitive or immutable. <h3>But, if they aren't, then the original and the clone share mutable state, which can be a problem</h3>
 * @clone: == shallow copy
 * @ArrayList.clone_vs_Array.clone: Arrays have a public clone method whose return type is the same as the type of the array. Ex: if recipients had been an array, not arrayList, u could have cloned it as and no cast required. However, the ArrayList.clone() has return type "Object". u need to use a cast.
 */
public class _3_4_clone {
    private static class Employee implements Cloneable{
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
        public void raiseSalary(double byPercent) {
            double raise = salary * byPercent/100;
            salary += raise;
        }

        @Override
//        protected Object clone() throws CloneNotSupportedException {
//            return super.clone();
//        }
        protected Employee clone() throws CloneNotSupportedException {
            return (Employee) super.clone();
        }
    }

    private static class Message implements Cloneable{
        private String sender;
        private ArrayList<String> recipients;
        private String text;

        public Message(String sender, ArrayList<String> recipients, String text) {
            this.sender = sender;
            this.recipients = recipients;
            this.text = text;
        }
        public void addRecipient(String recipient) {recipients.add(recipient);}

        //doesn't work because recipients refer to the same
//        @Override
//        protected Message clone() throws CloneNotSupportedException {
//            return (Message) super.clone();
//        }

        //U don't need to use the Object.clone() at all. Here is a simple implementation of Message.clone
//        @Override
//        protected Message clone() throws CloneNotSupportedException {
//            var cloned = new Message(sender,new ArrayList<>(recipients),text);// new ArrayList to create a new one
//            return cloned;
//        }

        //Alternative, u can call clone on the superclass and the mutable instance variables.
        //ArrayList class implements the clone method, yielding a shallow copy. That is, the original and cloned lists share the element references. That is fine in our case since the elements are strings. If not, we would have had to clone each element as well

        @Override
        protected Message clone() throws CloneNotSupportedException {
            try {
                var cloned = (Message) super.clone();
                @SuppressWarnings("unchecked") var clonedRecipients
                        = (ArrayList<String>) recipients.clone();
                cloned.recipients = clonedRecipients;
                return cloned;
            } catch (CloneNotSupportedException ex) {
                return null;
            }
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        //Check clone obj whether obj unchanged even cloned obj changed sth
        Employee quang = new Employee("quang",10000);
        System.out.println(quang);
        var cloneOfQuang = quang.clone();
        System.out.println(cloneOfQuang);
        System.out.println(Objects.equals(quang,cloneOfQuang));

        //shallow copy so when we change the recipients of cloneOfSpecialOffer then specialOffer also change
        Message specialOffer = new Message("quang",new ArrayList<>(List.of("thuy","minh")), "welcome");
        Message cloneOfSpecialOffer = specialOffer.clone();
        Message specialOffer2 = new Message("quang",new ArrayList<>(List.of("thuy","minh")), "welcome");
        System.out.println("1." + (specialOffer.recipients == cloneOfSpecialOffer.recipients));
        System.out.println("2." + (specialOffer.equals(specialOffer2)));
        System.out.println("3." + (specialOffer.recipients == specialOffer2.recipients));
        System.out.println("specialOffer.recipients: " + specialOffer.recipients);
        System.out.println("specialOffer2.recipients: " + specialOffer2.recipients);
        //change recipients of cloneOfSpecialOffer
        cloneOfSpecialOffer.recipients.add("Hieu");
        System.out.println(specialOffer.recipients);
        System.out.println(cloneOfSpecialOffer.recipients);
    }
}
