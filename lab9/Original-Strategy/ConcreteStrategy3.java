package com.company;

public class ConcreteStrategy3 implements Istrategy {
    @Override
    public void operate(String message) {
        System.out.println("<" + message + ">" );
    }
}
