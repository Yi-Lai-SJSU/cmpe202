import java.util.ArrayList;

public class ConcreteComponent {
    private String name;
    private String attribute;
    private int number;
    private ArrayList<ConcreteComponent> components = new ArrayList<>();

    public ConcreteComponent(String attribute, String name) {
        this.name = name;
        this.attribute = attribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return attribute;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<ConcreteComponent> getComponents() {
        return components;
    }

    public void addComponent(ConcreteComponent component, int number) {
        components.add(component);
        component.setNumber(number);
    }
}
