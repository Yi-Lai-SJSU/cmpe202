

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoins(int valueOfCoin) {
        System.out.println("You can't insert a coin, the machine is sold out!");
    }

    public void ejectCoins() {
        if (gumballMachine.getAmount_Coins() > 0) {
            gumballMachine.setAmount_Coins(0);
            System.out.println("Your coins has been returned!");
        } else {
            System.out.println("You haven't inserted coin!");
        }
    }

    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs!");
        if(gumballMachine.getAmount_Coins() > 0) {
            System.out.println ("You have " + gumballMachine.getAmount_Coins() + " cents left inside. Press the red button to get the money back!");
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public void refill(int numberGumballs) {
        if (numberGumballs > 0) {
            gumballMachine.setNumberGumballs(gumballMachine.getNumberGumballs() + numberGumballs);
            gumballMachine.setState(gumballMachine.getLackOfMoneyState());
            System.out.println("The gumballs have been refilled! ");
        }  else {
            System.out.println("Please refill at least 1 gumball!");
        }
    }

    public String toString() {
        return "sold out";
    }
}
