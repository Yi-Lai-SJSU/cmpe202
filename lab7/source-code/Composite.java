import java.util.ArrayList;
import java.text.DecimalFormat;

public class Composite implements Component {

    private ArrayList<Component> components = new ArrayList<>() ;
    private String type ;
    private double price = 0.00 ;
    private String description = "" ;
    
    public Composite (String type)
    {
        this.type = type ;
    }

    public String getDescription() {
        generateDescription();
        return this.description;
    }

	public void generateDescription() {
        String out = "" ;
        out += type + "     ";
        DecimalFormat fmt = new DecimalFormat("0.00");
        out += fmt.format(this.calculatePrice()) + "\n";

        for (Component obj : components)
        {
           out += obj.getDescription();
        }
        this.description = out;
    }

	public double getPrice() {
        this.price = calculatePrice();
        return this.price;
    }

    public double calculatePrice () {
        return ((LeafDecorator)this.components.get(components.size()-1)).calculatePrice();
    }

    public void addChild (Component c) {
        if (components.size() == 0) {
            components.add(c);
        } else {
            ((PriceDecorator)c).setBase(components.get(components.size()-1));
            components.add(c) ;
        }
    }
}
 
