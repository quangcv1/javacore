package ch03_interfaces_lambdaExpression.s01_interfaces;

/**
 * @description: et’s consider a different kind of number sequences that may or may not be random. These sequences only yield integers, and they may be finite or infinite. Such sequences can take many forms. Here are some examples:
 * @note: no implementation is provided, we say that the method is abstract (not default methods in interface)
 * @note2: all methods of an interface are automatically public. Therefore, it is not necessary to declare hasNext and next as public
 * @default-method-in-interface
 * @see <a href="https://learning.oreilly.com/library/view/core-java-for/9780138051846/ch03.xhtml#sec3_1">3.1.2</a>
*/
public interface IntSequence {
    /**
     * tell whether there is a next element
     * @return
     */
    boolean hasNext();

    /**
     * get the next element
     * @note: no implementation is provided, we say that the method is abstract
     * @return
     */
    int next();
}

