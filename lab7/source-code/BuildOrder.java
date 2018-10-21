  

public class BuildOrder {

    public static void getOrder()
    {
        /**
         * Build the first Order.
         */
        Composite order = new Composite("Build You Own Burger");

        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        Burger b = new Burger(bo);
        order.addChild(b);

        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        Cheese c = new Cheese(co);
        order.addChild(c);

        String[] pco = { "Danish Blue Cheese" };
        PremiumCheese pc = new PremiumCheese(pco);
        order.addChild(pc);

        String[] so = {"Thai Peanut Sauce","Mayonnaise"};
        Sauce s = new Sauce(so);
        order.addChild(s);

        String[] to = {"Dill Pickle Chips", "Black Olives", "Spicy Pickles"};
        Toppings t = new Toppings(to);
        order.addChild(t);

        String[] pto = {"Marinated Tomatoes"};
        PremiumToppings pt = new PremiumToppings(pto);
        order.addChild(pt);

        String[] buno = {"Ciabatta(Vagan)"};
        Bun bun = new Bun(buno);
        order.addChild(bun);

        String[] sideo = {"Shoestring Fries"};
        Side side = new Side(sideo);
        order.addChild(side);

        double price = order.getPrice();
        System.out.println(order.getDescription());

        /**
         * Build the second Order
         */
        Composite order2 = new Composite("Build You Own Burger");

        String[] bo2 = { "Hormone", "1/3lb.", "On A Bun" } ;
        Burger b2 = new Burger(bo2);
        order2.addChild(b2);

        String[] co2 = { "Greek Feta", "Smoked Gouda" } ;
        Cheese c2 = new Cheese(co2);
        order2.addChild(c2);

        String[] pco2 = { "Fresh Mozzarella" };
        PremiumCheese pc2 = new PremiumCheese(pco2);
        order2.addChild(pc2);

        String[] so2 = { "Habanero Salsa" };
        Sauce s2 = new Sauce(so2);
        order2.addChild(s2);

        String[] to2 = { "Crushed Peanuts" };
        Toppings t2 = new Toppings(to2);
        order2.addChild(t2);

        String[] pto2 = {"Sunny Side Up Egg*", "Marinated Tomatoes"};
        PremiumToppings pt2 = new PremiumToppings(pto2);
        order2.addChild(pt2);

        String[] buno2 = {"Gluten-Free Bun"};
        Bun bun2 = new Bun(buno2);
        order2.addChild(bun2);

        String[] sideo2 = {"Shoestring Fries"};
        Side side2 = new Side(sideo2);
        order2.addChild(side2);

        double price2 = order2.getPrice();
        System.out.println(order2.getDescription());
    }
}