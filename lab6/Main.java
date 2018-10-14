public class Main {

    public static void main(String[] args) {

        Cashier cashier = new Cashier();
        Composite Burger = new Burger("Burgar", "LBB");
        Burger.addComponent(new ConcreteComponent("top", "LETTUCE"),1);
        Burger.addComponent(new ConcreteComponent("top", "TOMATO"),1);
        Burger.addComponent(new ConcreteComponent("onMeat","G ONION"),1);
        Burger.addComponent(new ConcreteComponent("onMeat","JALA Grilled"),1);

        ConcreteComponent order = new ConcreteComponent("Order","45");
        order.addComponent(Burger, 2);
        order.addComponent(new Composite("Fries","LTL CAJ"),3);

        cashier.setOrder(order);
        cashier.setAmount(20.00);
        cashier.print();
    }
}
