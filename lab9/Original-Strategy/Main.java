package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StrategyTest strategyTest = new StrategyTest("hello");

		while(true) {
			System.out.print("Enter a number(0:quit): ");
			int number = in.nextInt();
			if (number == 0) {
				break;
			}

			switch(number%3) {
				case 0:
					strategyTest.setIstrategy(new ConcreteStrategy1());
					strategyTest.operate();
					break;
				case 1:
					strategyTest.setIstrategy(new ConcreteStrategy2());
					strategyTest.operate();
					break;
				case 2:
					strategyTest.setIstrategy(new ConcreteStrategy3());
					strategyTest.operate();
					break;
			}
		}
    }
}
