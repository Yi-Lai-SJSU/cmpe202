/**
 * Functional Interface can only has One abstract method inside.
 * Actually it defines the Name of the method expressed by Lambda Expression.
 * So we can use it as a handler to call the Lambda expression.
 */
@FunctionalInterface
public interface Istrategy {
    void operate(String message);
}
