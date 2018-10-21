public class Cheese extends LeafDecorator
{
    public Cheese(String[] options)
    {
        super(options);
        setPrice(options);
    }

    private void setPrice(String[] options) {
        if (options.length > 1) {
            super.price += (options.length - 1) * 1.00;
        }
    }
}