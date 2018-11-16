package com.company;

public class StrategyTest {
    private String message;
    private Istrategy istrategy;

    public StrategyTest(String message) {
        this.message = message;
    }

    public void operate() {
        istrategy.operate(this.message);
    }

    public void setIstrategy(Istrategy istrategy) {
        this.istrategy = istrategy;
    }

}
