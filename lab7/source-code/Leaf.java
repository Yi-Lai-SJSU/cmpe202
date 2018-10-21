public class Leaf implements Component {
    protected String[] options;
    protected String description ;
    protected double price = 0.00;

    public Leaf (String[] options) {
        super();
        this.options = options;
        generateDescription();
    }

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public void generateDescription() {
        String desc = "   " ;
        for ( int i = 0; i < this.options.length; i++ )
        {
            if (i > 0) {
                desc += " + " + this.options[i] ;
            }
            else {
                desc = this.options[i] ;
            }
        }
        this.description = desc + "\n";
    }
}
