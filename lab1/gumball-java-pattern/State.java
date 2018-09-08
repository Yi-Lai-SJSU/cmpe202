public interface State {
	public void insertCoins(int valueOfCoin);
	public void ejectCoins();
	public void turnCrank();
	public void dispense();
	public void refill(int numberGumballs);
}
