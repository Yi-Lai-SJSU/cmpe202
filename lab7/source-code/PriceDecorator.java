public interface PriceDecorator {
   void setBase (Component component);
   double calculatePrice();
}