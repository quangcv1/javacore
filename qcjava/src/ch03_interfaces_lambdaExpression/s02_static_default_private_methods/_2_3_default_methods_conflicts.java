package ch03_interfaces_lambdaExpression.s02_static_default_private_methods;

/**
 * @description: if a class implements 2 interfaces, one of which has a default method and the other a method (default or not) with the same name and para types => need to resolve the conflict.
 * @note: the compiler reports an error and leaves it up to you to resolve, or you have to delegate to one of the conflicting methods.
 * @see Person
 * @see Identified
 */
public class _2_3_default_methods_conflicts implements Person, Identified {
    @Override
    public String getName() {
        return null;
    }

    //resolve the conflict
    @Override
    public int getId() {
        //super keyword lets u call a supertype method.
        //we need to specify which supertype we want
        //syntax for invoking a superclass method
        return Identified.super.getId();
    }
}
