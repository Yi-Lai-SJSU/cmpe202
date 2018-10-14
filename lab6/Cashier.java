import java.util.Date;
import java.text.SimpleDateFormat;

public class Cashier {
    private ConcreteComponent order;
    private String receipt = "";
    private String patties = "";
    private Double amount = 0.00;

    public Cashier(){
    }

    public ConcreteComponent getOrder() {
        return order;
    }

    public void setOrder(ConcreteComponent order) {
        this.order = order;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void generate_ReceiptAndPatties () {
        for (ConcreteComponent c : order.getComponents()) {
            ((Composite)c).generate_Receipt();
            ((Composite)c).generate_patties();
            receipt += ((Composite)c).getReceipt();
            patties += ((Composite)c).getPatties();
        }
    }

    public void print() {
        generate_ReceiptAndPatties ();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String out1 = "\n\n\n";
        out1 += "   "+ df.format(new Date()) + "\n";
        out1 += "         FIVE GUYS" + "\n\n";
        out1 += "Order Number:    " + this.order.getName() + "\n\n";
        out1 += receipt + "\n";
        out1 += "Sub. Total:              ";
        Double subTotal = 0.00;
        for(ConcreteComponent c : order.getComponents()) {
            subTotal += c.getNumber() * ((Composite)c).getPrice();
        }
        java.text.DecimalFormat df1 = new java.text.DecimalFormat("#.00");
        out1 += df1.format(subTotal) + "\n";
        out1 += "Cash                     " + Double.toString(this.amount) + "\n";
        Double change = this.amount - subTotal;
        out1 += "Change                   " + df1.format(change) + "\n";
        out1 += "****************************************\n\n\n";
        System.out.println(out1);

        printPatties();
    }

    public void printPatties() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String out2 = "Patties\n\n\n";
        out2 += "   "+ df.format(new Date()) + "\n";
        out2 += "         FIVE GUYS" + "\n\n";
        out2 += "Order Number:    " + this.order.getName() + "\n\n";
        out2 += patties + "\n";
        out2 += "****************************************";
        System.out.println(out2);
    }
}
