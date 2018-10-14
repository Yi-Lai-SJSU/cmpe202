import java.util.ArrayList;
import java.util.HashMap;

public class Composite extends ConcreteComponent {
    private Double price;
    private String receipt = "";
    private String patties = "";
    private ArrayList<String> top = new ArrayList<>();
    private ArrayList<String> onMeat = new ArrayList<>();
    private ArrayList<String> meat = new ArrayList<>();
    private ArrayList<String> bottom = new ArrayList<>();
    protected static HashMap<String,Double> mapPrice = new HashMap<String, Double>();
    protected static HashMap<String, String> mapMeat = new HashMap <String, String>();

    public Composite (String attribute, String name) {
        super(attribute, name);
        mapPrice.put("LBB", 5.59);
        mapPrice.put("LTL CAJ", 2.79);
        mapMeat.put("LBB", "BACON");
        this.price = mapPrice.get(name);
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getPatties() {
        return patties;
    }

    public void setPatties(String patties) {
        this.patties = patties;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public void addComponent(ConcreteComponent component,int number) {
        super.addComponent(component,number);
    }

    public void generate_Receipt () {
        receipt += displayReceiptHeader();
        patties += displayPattiesHeader();
        for (ConcreteComponent component : getComponents()) {
            switch(component.getAttribute()) {
                case "top" :
                    receipt +=  "     " + component.getName() + "\n";
                    top.add("     " + component.getName() + "\n");
                    break;
                case "onMeat" :
                    receipt += "     ->|" + component.getName() + "\n";
                    onMeat.add("     ->|" + component.getName() + "\n");
                    break;
                case "meat" :
                    receipt += "     " + component.getName() + "\n";
                    meat.add("     " + component.getName() + "\n");
                    break;
                case "bottom" :
                    receipt += "     " + component.getName() + "\n";
                    bottom.add("     " + component.getName() + "\n");
                default: break;
            }
        }
    }

    public void generate_patties () {
        this.patties += arrayList_ToString(top);
        this.patties += arrayList_ToString(onMeat);
        this.patties += arrayList_ToString(meat);
        this.patties += arrayList_ToString(bottom);
    }

    private String arrayList_ToString (ArrayList<String> arrayList) {
        String out = "";
        for (String s : arrayList) {
            out += s;
        }
        return out;
    }

    private String displayReceiptHeader() {
        String out = "";
        out += super.getNumber() + "    ";
        out += getName();
        int space_size = 20 - super.getName().length();
        for (int i = 0; i < space_size; i++) {
            out += " ";
        }
        java.text.DecimalFormat df1 = new java.text.DecimalFormat("#.00");
        out += df1.format(this.price * super.getNumber()) + "\n";
        return out;
    }

    private String displayPattiesHeader() {
        String out = "";
        out += super.getNumber() + "    ";
        out += getName() + "\n";
        return out;
    }
}
