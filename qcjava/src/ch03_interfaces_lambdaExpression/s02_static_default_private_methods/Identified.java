package ch03_interfaces_lambdaExpression.s02_static_default_private_methods;

/**
 * @conflict-default-method: getId()
 * @see _2_3_default_methods_conflicts
 */
public interface Identified {
    default int getId() {return Math.abs(hashCode());}
}
