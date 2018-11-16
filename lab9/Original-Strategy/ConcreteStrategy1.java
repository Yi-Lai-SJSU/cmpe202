package com.company;

public class ConcreteStrategy1 implements Istrategy {

    @Override
    public void operate(String message) {
        System.out.println("{" + message + "}");
    }
}
