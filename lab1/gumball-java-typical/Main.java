import java.util.*;

public class Main {
    public static void main(String[] args) {
        //last version...
        System.out.println("Initialized...");
        int size, type;
        Scanner out = new Scanner(System.in);
        System.out.println("Please input the Size of the GumballMachine: ");
        size = out.nextInt();

        do {
            System.out.println("0: Single Quarter Machine");
            System.out.println("1: Two Quarter Machine");
            System.out.println("2: Slot Machine");
            System.out.println("Please input the type number from {0,1,2}");
            type = out.nextInt();
        } while (type > 2 || type < 0);


        GumballMachine gumballMachine = new GumballMachine(size, type);

        System.out.println("Case 1: input coin of 10");
        gumballMachine.insertCoins(10);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 2: input coin 12");
        gumballMachine.insertCoins(12);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 3: input coin 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 4: input coin 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 5: input nothing");
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 6: input coin 5");
        gumballMachine.insertCoins(5);
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 7: input nothing");
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 8: input nothing");
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 9: input coin of 10");
        gumballMachine.insertCoins(10);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 10: input nothing");
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 11: input nothing");
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 12: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 13: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 14: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 15: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 16: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");

        System.out.println("Case 17: input coin of 25");
        gumballMachine.insertCoins(25);
        System.out.println(gumballMachine.toString());
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString() + "\n");
    }
}

