package ch03_interfaces_lambdaExpression.s07_lambda_expression_var_scope;

/**
 * @scope: a lambda expression has the same scope as a nested block.
 * @scope_with_this: the "this" keyword in a lambda expression denotes the "this" para of the method that creates the lambda
 * @ex:
 * <pre>
 * public class Application() {
 *     public void doWork() {
 *         Runnable runner = () -> { ...; System.out.println(this.toString()); ... };
 *         ...
 *     }
 * }
 * </pre>
 * @note: the expression this.toString() calls the toString method of the "Application" obj, not the "Runnable" instance. There is nothing special abt the use of "this" in a lambda expression. The scope of lambda expression is nested inside the "doWork" method, and "this" has the same meaning anywhere in that method.
 */
public class _7_1_Scope_of_a_lambda_expression {
}
