public class PremiumCheese extends LeafDecorator
{
    public PremiumCheese(String[] options)
    {
        super(options);
        setPrice(options);
    }

    private void setPrice(String[] options) {
        if (options.length > 0) {
            super.price += options.length * 1.50;
        }
    }
}