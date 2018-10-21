public class PremiumToppings extends  LeafDecorator {
    public PremiumToppings(String[] options)
    {
        super(options);
        setPrice(options);
    }

    private void setPrice(String[] options) {
        for ( int i = 0; i < options.length; i++ )
        {
            if ("Marinated Tomatoes".equals(options[i])) {
                super.price += 3.00;
            } else {
                super.price += 1.00;
            }
        }
    }
}
