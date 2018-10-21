public class LeafDecorator extends Leaf implements PriceDecorator {

    protected Component base;

    public LeafDecorator(String[] options) {
        super(options);
    }

    public void setBase(Component base) {
        this.base = base;
    }

    public double calculatePrice () {
        if (this.base == null) {
            return super.getPrice();
        } else {
            return  this.price + ((LeafDecorator)this.base).calculatePrice();
        }
    }
}
