public class Bun extends LeafDecorator {
    public Bun (String[] options)
    {
        super(options);
        setPrice(options);
    }

    private void setPrice(String[] options) {
        if ("Gluten-Free Bun".equals(options[0])) super.price += 1.00;
        if ("Hawalian Bun".equals(options[0])) super.price += 1.00;
        if ( "Pretzel Bun".equals(options[0]) ) this.price += 0.50 ;
    }
}
