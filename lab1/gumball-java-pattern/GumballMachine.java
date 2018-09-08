import java.util.Arrays;

public class GumballMachine {

    State soldOutState;
    State LackOfMoneyState;
    State MoneyEnoughState;
    State soldState;

    private State state;
    private int numberGumballs;
    private int amount_Coins;
    private GMType gmType; //inner class: to record the coin set({25} or {5,10,25}) and threshold(25 or 50) of each machine;

    public GumballMachine(int numberGumballs, int machineType) {
        soldOutState = new SoldOutState(this);
        LackOfMoneyState = new LackOfMoneyState(this);
        MoneyEnoughState = new MoneyEnoughState(this);
        soldState = new SoldState(this);
        if (numberGumballs > 0) {
            state = LackOfMoneyState;
        } else {
            state = soldOutState;
        }

        this.numberGumballs = numberGumballs;
        this.amount_Coins = 0;
        switch (machineType) {
            case 0:
                gmType = new GMType(new int[]{25}, 25);
                break;
            case 1:
                gmType = new GMType(new int[]{25}, 50);
                break;
            case 2:
                gmType = new GMType(new int[]{5, 10, 25}, 50);
                break;
            default:
                gmType = new GMType(new int[]{}, 0);
                break;
        }
    }

    public void insertCoins(int valueOfCoin) {
        state.insertCoins(valueOfCoin);
    }

    public void ejectCoins() {
        state.ejectCoins();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void refill(int numberGumballs) {
        state.refill(numberGumballs);
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (this.numberGumballs != 0) {
            this.numberGumballs = this.numberGumballs - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getLackOfMoneyState() {
        return LackOfMoneyState;
    }

    public State getMoneyEnoughState() {
        return MoneyEnoughState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }

    public int getNumberGumballs() {
        return numberGumballs;
    }

    public void setNumberGumballs(int numberGumballs) {
        this.numberGumballs = numberGumballs;
    }

    public int getAmount_Coins() {
        return amount_Coins;
    }

    public void setAmount_Coins(int amount_Coins) {
        this.amount_Coins = amount_Coins;
    }

    public GMType getGmType() {
        return gmType;
    }

    public void setGmType(GMType gmType) {
        this.gmType = gmType;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + numberGumballs + " gumball");
        if (numberGumballs != 1) {
            result.append("s");
        }
        result.append(". The amount of of Coins is: " + amount_Coins + "------------------");
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }

    class GMType {
        private int[] accepted_Coins;
        private int thresholdOfCoins;

        GMType(int[] accepted_Cions, int thresholdOfCoins) {
            this.accepted_Coins = accepted_Cions;
            this.thresholdOfCoins = thresholdOfCoins;
        }

        boolean isCoinAccepted(int valueOfCoin) {
            boolean isAccepted = false;
            for (int i = 0; i < accepted_Coins.length; i++) {
                if (valueOfCoin == accepted_Coins[i]) {
                    isAccepted = true;
                    break;
                }
            }
            return isAccepted;
        }

        boolean isMoneyEnough() {
            boolean isEnoughMoney = false;
            if (getAmount_Coins() >= this.thresholdOfCoins) {
                isEnoughMoney = true;
            }
            return isEnoughMoney;
        }

        public int getThresholdOfCoins() {
            return thresholdOfCoins;
        }

        @Override
        public String toString() {
            return "Valid Cion is in set of " + Arrays.toString(accepted_Coins);
        }
    }
}
