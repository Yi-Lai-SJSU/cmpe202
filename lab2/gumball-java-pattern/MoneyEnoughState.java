public class MoneyEnoughState implements State {

    GumballMachine gumballMachine;

    public MoneyEnoughState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoins(int valueOfCoin) {
        System.out.println("You can't insert another coin. The money is enough. Please turn the Crank");
    }

    public void ejectCoins() {
        System.out.println("Quarter returned.");
        gumballMachine.setAmount_Coins(0);
        gumballMachine.setState(gumballMachine.getLackOfMoneyState());
    }

    public void turnCrank() {
        System.out.println("You turned... All your coins have gone!");
        gumballMachine.setAmount_Coins(0);
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public void refill(int numberGumballs) {
        if (numberGumballs > 0) {
            gumballMachine.setNumberGumballs(gumballMachine.getNumberGumballs() + numberGumballs);
            System.out.println("The gumballs have been refilled! ");
        } else {
            System.out.println("Please refill at least 1 gumball!");
        }
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
