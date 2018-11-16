package com.company;

public class ConcreteStrategy2 implements Istrategy {
    @Override
    public void operate(String message) {
        System.out.println("[" + message + "]");
    }
}
