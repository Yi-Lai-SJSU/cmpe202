package com.company;

public class Main {

    public static void main(String[] args) {

	StrategyTest strategyTest = new StrategyTest("hello");

	strategyTest.setIstrategy(new ConcreteStrategy1());
	strategyTest.operate();

	strategyTest.setIstrategy(new ConcreteStrategy2());
	strategyTest.operate();

	strategyTest.setIstrategy(new ConcreteStrategy3());
	strategyTest.operate();
    }
}
