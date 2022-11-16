package ch03_interfaces_lambdaExpression.s01_interfaces;

public class _3_1_5_Casts_and_instanceof {
    public static void main(String[] args) {
        // A cast
        IntSequence sequence = new DigitSequenceImpl(1729);
        DigitSequenceImpl digits = (DigitSequenceImpl) sequence; //cast impl
        System.out.println(digits.rest());
        if(Math.random() < 0.5)
            sequence = new SquareSequenceImpl();
//
//        // Cannot possibly work—IntSequence is not a supertype of String
//        // String digitString = (String) sequence;
//
//        // Could work if Math.random() < 0.5, throws a class cast exception if not because, at this time, sequence still DigitSequenceImpl not SquareSequenceImpl
//        // Error is: ClassCastException
//        SquareSequenceImpl squares = (SquareSequenceImpl) sequence;

        // The instanceof operator (old school)
        if(sequence instanceof DigitSequenceImpl) {
            DigitSequenceImpl ds = (DigitSequenceImpl) sequence;
            System.out.println("old school: " + ds.rest());
        }

        // Instanceof with pattern matching
        if(sequence instanceof DigitSequenceImpl ds) {
            // Here, u can use the ds var
            System.out.println("pattern matching: " + ds.rest());
        }

        // Can use var in boolean expression
        if (sequence instanceof DigitSequenceImpl ds && ds.rest() >= 100) {
            System.out.println("boolean expression: " + ds.rest());
        }

        // Also with conditional operator
        double rest = sequence instanceof DigitSequenceImpl ds ? ds.rest() : 0;
        System.out.println("conditional operator: " + rest);
    }
}
