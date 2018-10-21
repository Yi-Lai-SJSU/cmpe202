public class Burger extends LeafDecorator
{
    public Burger(String[] options)
    {
        super(options);
        setPrice(options);
    }

    private void setPrice(String[] options) {
        for ( int i = 0; i < options.length; i++ )
        {
            if ("Organic Bison*".equals(options[i])) super.price += 4.00;
            if ("Ahi Tuna*".equals(options[i])) super.price += 4.00;
            if ( "1/3lb.".equals(options[i]) ) this.price += 9.00 ;
            if ( "1/2lb.".equals(options[i]) ) this.price += 12.00 ;
            if ( "1lb.".equals(options[i]) ) this.price += 18.00 ;
            if ( "In A Bowl".equals(options[i]) ) this.price += 1.00 ;
        }
    }
}
