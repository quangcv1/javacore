package ch03_interfaces_lambdaExpression.s01_interfaces;

public class SquareSequenceImpl implements IntSequence {
    private int i; //default value is 0
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        i++;
        return i*i;
    }
}
