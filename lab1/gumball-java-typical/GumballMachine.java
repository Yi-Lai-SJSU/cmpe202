import java.util.Arrays;

public class GumballMachine
{
    private int num_gumballs;
    private int num_cents;
    private GMType gmType;

    public GumballMachine(int size, int type)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.num_cents = 0;

        switch (type) { 
            case 0: gmType = new GMType(new int[]{25}, 25); break; //for type 0: the valid coin is 25, the cost of each gumball is 25;
            case 1: gmType = new GMType(new int[]{25}, 50); break; //for type 1: the valid coin is 25, the cost of each gumball is 50;
            case 2: gmType = new GMType(new int[]{5,10,25},50); break; // for type 2: the valid coins are 5, 10, 25, the cost of each gumball is 50;
            default: System.out.println("Please input the correct Machine type number: 0 or 1 or 2"); break;
        }
    }

    public void insertCoins(int valueOfCoins)
    {
        if (gmType.isCoinAccepted(valueOfCoins)) {
            num_cents += valueOfCoins;
            System.out.println("Your coin has been accepted!");
        } else {
            System.out.println("Your coin is not the valid coin!");
        }
    }
    
    public void turnCrank()
    {
    	if (this.num_gumballs < 1) {
            System.out.println( "No More Gumballs! Sorry, can't return your quarter." ) ;
        } else {
    	    if(this.num_cents >= gmType.getThresholdOfCents()) {
    	        this.num_gumballs--;
    	        this.num_cents -= gmType.getThresholdOfCents();
                System.out.println("Thanks for your quarter. Gumball Ejected!" );
            } else {
                System.out.println( "Please insert a correct coin!");
            }
    	}
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "num_gumballs=" + num_gumballs +
                ", num_cents=" + num_cents +
                '}';
    }

    class GMType {
        private int [] accepted_coins;
        private int thresholdOfCents;

        protected GMType(int[] accepted_Coins, int thresholdOfCents) {
            this.accepted_coins = accepted_Coins;
            this.thresholdOfCents = thresholdOfCents;
        }

        protected boolean isCoinAccepted(int valueOfCoins) {
            boolean isAccepted = false;
            for (int i= 0; i < accepted_coins.length; i++) {
                if (valueOfCoins == accepted_coins[i]) {
                    isAccepted = true;
                    break;
                }
            }
            return isAccepted;
        }

        protected int getThresholdOfCents() {
            return thresholdOfCents;
        }
    }
}
