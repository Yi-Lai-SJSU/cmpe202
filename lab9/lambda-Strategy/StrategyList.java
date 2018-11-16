/**
 * If we want to reuse the code, we need to record the Lambda expression somewhere.
 * Unless we have to input the lambda expression each time when we need to use it.
 */
public class StrategyList {
    public Istrategy istrategy_One   = (String message) -> System.out.println("{" + message + "}");
    public Istrategy istrategy_Two   = (String message) -> System.out.println("[" + message + "]");
    public Istrategy istrategy_Three = (String message) -> System.out.println("<" + message + ">" );
}
