package ch03_interfaces_lambdaExpression.s01_interfaces;

/**
 * @see ch03_interfaces_lambdaExpression.s01_interfaces.IntSequence
 */
public class IntSequenceDemo {
    /**
     * @note: this method does not know, or need to know, how the hasNext and next methods do their job.
     * @note2: A type S is a supertype of the type T (the subtype). Occasionally, u need the opposite conversion - from a supertype to subtype => use cast
     * @note3: even though it is possible to declare vars of an interface type, you can never have an obj whose type is an interface. All objs are instances of classes
     * @param seq
     * @param n
     * @return
     */
    public static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;
        while(seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum/count;
    }

    public static void main(String[] args) {
        //Use square sequence impl
        var squares = new SquareSequenceImpl();//default value i = 0
        double avg = average(squares,2);
        System.out.println("Average of first 100 squares: " + avg);

        //use digit sequence impl
        IntSequence digits = new DigitSequenceImpl(1729);
        //to use rest(), we need to cast IntSequence/var digits to DigitSequenceImpl
        //if we declare DigitalSequenceImpl(1729) then we don't need to cast
        //IntSequence interface is a super type (S) of the DigitSequence class (T: type)
        while (digits.hasNext()) System.out.println(digits.next() + " and the rest is " + ((DigitSequenceImpl) digits).rest());
        System.out.println();
    }
}
