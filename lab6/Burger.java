import java.util.HashMap;

public class Burger extends Composite {
    private ConcreteComponent meat;

    public Burger(String attribute, String name) {
        super(attribute, name);
        this.meat = new ConcreteComponent("meat", super.mapMeat.get(name));
        super.addComponent(meat, 1);
    }

    @Override
    public void addComponent(ConcreteComponent component, int number) {
        super.addComponent(component, number);
        for (int i = 0; i < number; i++) {
            this.meat.setName( "{" + this.meat.getName() + "}" );
        }
    }
}
