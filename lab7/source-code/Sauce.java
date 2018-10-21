public class Sauce extends LeafDecorator
{
    public Sauce (String[] options)
    {
        super(options);
        setPrice(options);
    }

    private void setPrice(String[] options) {
        if (options.length > 1) {
            super.price += (options.length - 1) * 0.50;
        }
    }
}