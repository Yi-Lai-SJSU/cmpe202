

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	public void insertCoins(int valueOfCoin) {
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public void ejectCoins() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getNumberGumballs() > 0) {
			gumballMachine.setState(gumballMachine.getLackOfMoneyState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
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
		return "dispensing a gumball";
	}
}


