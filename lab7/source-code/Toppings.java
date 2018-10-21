public class Toppings extends LeafDecorator
{
    public Toppings (String[] options)
    {
        super(options);
        setPrice(options);
    }

    private void setPrice(String[] options) {
        super.price = 0.00;
    }
}