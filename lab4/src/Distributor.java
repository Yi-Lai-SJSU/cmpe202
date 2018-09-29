import java.util.HashMap;
import java.util.Map;

public class Distributor {
    protected HashMap<Resource, Resource> customerTableMAP = new HashMap<>(); //<Customer, Table>
    protected Observer observer;

    public Distributor(Observer observer) {
        this.observer = observer;
    }

    public void addCustomerTablePair (Resource resource1, Resource resource2) {
        if (resource1.getClass().getName().equals("Customer")) {
            customerTableMAP.put(resource1, resource2);
            notifyCustomer(resource1);
        } else {
            customerTableMAP.put(resource2, resource1);
            notifyCustomer(resource2);
        }
    }

    public void notifyCustomer (Resource resource) {
        String notifyMessage = resource.getID()
                             + ":   Table No."
                             + customerTableMAP.get(resource).getID()
                             + " is ready for you.";
        System.out.println(notifyMessage);
    }

    public void distributeTable (Customer customer) {  //custom get the table;
        if (customerTableMAP.get(customer) != null) {
            System.out.println("Distribute a table to a customer.");
            customerTableMAP.remove(customer);
            System.out.println(customerTableMAP.toString());
        } else {
            System.out.println("Please wait until receive a notify message.");
        }
    }

    public void releaseTable (Customer customer) {   //when the custom cancelled the reservation.
        if (customerTableMAP.get(customer) != null) {
            System.out.println("Release a table because the customer cancelled");
            Resource resource = customerTableMAP.remove(customer); // table;
            System.out.println(customerTableMAP.toString());
            observer.recycleTable(resource);
        }
    }

    @Override
    public String toString() {
        return "Distributor map is: \n" + customerTableMAP.toString();
    }
}
