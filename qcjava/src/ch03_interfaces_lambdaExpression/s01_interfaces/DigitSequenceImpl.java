package ch03_interfaces_lambdaExpression.s01_interfaces;

public class DigitSequenceImpl implements IntSequence{
    private int number;

    public DigitSequenceImpl(int n) {
        number = n;
    }
    @Override
    public boolean hasNext() {
        return number != 0;
    }

    @Override
    public int next() {
        int result = number%10;
        number /=10;
        return result;
    }

    public int rest() {
        return number;
    }
}
