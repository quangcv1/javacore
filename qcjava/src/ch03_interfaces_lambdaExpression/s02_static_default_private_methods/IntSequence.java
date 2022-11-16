package ch03_interfaces_lambdaExpression.s02_static_default_private_methods;

/**
 * @default_methods
 */
public interface IntSequence {
    //By default, sequence are infinite
    default boolean hasNext() {return true;}
    int next();
}
