import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number(0:quit): ");
            int number = in.nextInt();
            if (number == 0) {
                break;
            }

            StrategyTest strategyTest = new StrategyTest("hello");
            StrategyList strategyList = new StrategyList();

            switch(number%3) {
                case 0:
                    strategyTest.setIstrategy(strategyList.istrategy_One);
                    strategyTest.operate();
                    break;
                case 1:
                    strategyTest.setIstrategy(strategyList.istrategy_Two);
                    strategyTest.operate();
                    break;
                case 2:
                    strategyTest.setIstrategy(strategyList.istrategy_Three);
                    strategyTest.operate();
                    break;
            }
        }
    }
}
