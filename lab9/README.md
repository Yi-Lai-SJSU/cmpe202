The original strategy realization:
  : strategyTest.setIstrategy(new ConcreteStrategy1());
  
The lambda realization:
  (1):strategyTest.setIstrategy((String message) -> System.out.println("{" + message + "}"));
  OR 
  (2):strategyTest.setIstrategy(strategyList.istrategy_One);
 
  public class StrategyList {
    public Istrategy istrategy_One   = (String message) -> System.out.println("{" + message + "}");
    public Istrategy istrategy_Two   = (String message) -> System.out.println("[" + message + "]");
    public Istrategy istrategy_Three = (String message) -> System.out.println("<" + message + ">" );
}

  IF we use original realization, we must define different concreteStrategy class to implement different handing method.
  While if we user the lambda expression, we do not heed to define concreteStrategy class instead of just passing the method.
  The whole code is very simple when we use lambda expression.
  
  But on the other side, we must repeated input the lambda expression every time. For example, if we want to change print {messge} to 
  |message|. We have to change all the lambda expression from (String message) -> System.out.println("{" + message + "}") to
  (String message) -> System.out.println("|" + message + "|". It seeams not a good way.
