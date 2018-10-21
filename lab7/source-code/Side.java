public class Side extends  LeafDecorator {
    public Side (String[] options)
    {
        super(options);
        setPrice(options);
    }

    private void setPrice(String[] options) {
            super.price += (options.length) * 3.00;
    }
}
