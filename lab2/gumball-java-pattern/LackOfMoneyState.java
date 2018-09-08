public class LackOfMoneyState implements State {

    GumballMachine gumballMachine;

    public LackOfMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoins(int valueOfCoin) {
        System.out.println("You inserted a coin: "+ valueOfCoin);
        if (gumballMachine.getGmType().isCoinAccepted(valueOfCoin)) {
            System.out.println("Your coin has been accepted by the Machine!");
            int amount_Coins = gumballMachine.getAmount_Coins() + valueOfCoin;
            gumballMachine.setAmount_Coins(amount_Coins);
            if (gumballMachine.getGmType().isMoneyEnough()) {
                System.out.println("Money enough! You can turn crank now!");
                gumballMachine.setState(gumballMachine.getMoneyEnoughState());
            }
        } else {
            System.out.println("Your coin is not accepted by the Machine! " + gumballMachine.getGmType().toString());
        }
    }

    public void ejectCoins() {
        if (gumballMachine.getAmount_Coins() > 0) {
            gumballMachine.setAmount_Coins(0);
            System.out.println("Your coins have been returned!");
        } else {
            System.out.println("You haven't inserted a coin!");
        }
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no enough money! You still need to put " +
                (gumballMachine.getGmType().getThresholdOfCoins() - gumballMachine.getAmount_Coins()) + " cents.");
    }

    public void dispense() {
        System.out.println("You need to pay first! " + gumballMachine.getGmType().toString());
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
        return "waiting for coin";
    }
}
