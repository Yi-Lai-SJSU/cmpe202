import java.util.Scanner;

public class Main {
    /**
     * Functional Interface can only has One abstract method inside.
     * Actually it defines the Name of the method expressed by Lambda Expression.
     * So we can use it as a handler to call the Lambda expression.
     */
    @FunctionalInterface
    public interface Istrategy {
        void operate(String message);
    }

    /**
     * If we want to reuse the code, we need to record the Lambda expression somewhere.
     * Unless we have to input the lambda expression each time when we need to use it.
     */
    public static class StrategyList {
        public static Istrategy istrategy_One   = (String message) -> System.out.println("{" + message + "}");
        public static Istrategy istrategy_Two   = (String message) -> System.out.println("[" + message + "]");
        public static Istrategy istrategy_Three = (String message) -> System.out.println("<" + message + ">" );

        public void strategyDistributor(String message, Istrategy istrategy) {
            istrategy.operate(message);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number(0:quit): ");
            int number = in.nextInt();
            if (number == 0) {
                break;
            }
            StrategyList strategyList = new StrategyList();
            switch(number%3) {
                case 0: strategyList.strategyDistributor("hello", strategyList.istrategy_One); break;
                case 1: strategyList.strategyDistributor("hello", StrategyList.istrategy_Two); break;
                case 2: strategyList.strategyDistributor("hello", StrategyList.istrategy_Three); break;
            }
        }
    }
}
