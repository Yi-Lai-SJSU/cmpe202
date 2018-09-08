public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2, 1);
        System.out.println(gumballMachine);

        System.out.println("Case -------- 1: input coin of 10");
        gumballMachine.insertCoins(10);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 2: input coin 15");
        gumballMachine.insertCoins(15);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 3: input coin 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 4: input coin 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 5: input nothing");
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 6: input coin 5");
        gumballMachine.insertCoins(5);
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 7: input nothing");
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 8: eject coins");
        gumballMachine.ejectCoins();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 9: input coin of 10");
        gumballMachine.insertCoins(10);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 10: input nothing");
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 11: refill");
        gumballMachine.refill(2);
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 12: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 13: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 14: refill");
        gumballMachine.refill(2);
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 15: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 16: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 17: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 18: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 19: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 20: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 21: refill");
        gumballMachine.refill(2);
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 22: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 23: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case -------- 24: eject coins");
        gumballMachine.ejectCoins();
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");
    }
}
