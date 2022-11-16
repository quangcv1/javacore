package ch03_interfaces_lambdaExpression.s06_Processing_lambda_expressions;

import java.awt.*;

/**
 * @FunctionalInterface
 * @tag-FunctionInterface: 2 advantages. First, the compiler checks that the annotated entity is an interface with a single abstract method. Second, the javadoc page includes a statement that your interface is a functional interface
 */
@FunctionalInterface
public interface PixelFunction {
    Color apply(int x, int y);
}
