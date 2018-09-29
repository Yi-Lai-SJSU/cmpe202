import java.util.ArrayList;

public class DintaiFung {
    public static void main(String[] args) {

        Subject customerList = new Subject();
        Subject tableList = new Subject();
        Observer observer = new Observer(customerList, tableList);
        customerList.attachObserver(observer);
        tableList.attachObserver(observer);
        Distributor distributor = new Distributor(observer);
        observer.attachDistributor(distributor);

        System.out.println("\n" +"1. customer1 coming...");
        Customer customer1 = new Customer("customer1", "4084440981",1);
        customerList.receiveResource(customer1);

        System.out.println("\n" +"2. customer2 coming...");
        Customer customer2 = new Customer("customer2", "4088211982",1);
        customerList.receiveResource(customer2);

        System.out.println("\n" +"3. customer3 coming...");
        Customer customer3 = new Customer("customer3", "408666666",0);
        customerList.receiveResource(customer3);

        System.out.println("\n" +"4. table1 coming...");
        Table table1 = new Table("table1", 0);
        tableList.receiveResource(table1);
        System.out.println(distributor.toString());

        System.out.println("\n" +"5. table2 coming...");
        Table table2 = new Table("table2",1);
        tableList.receiveResource(table2);
        System.out.println(distributor.toString());

        System.out.println("\n" +"6. table3 coming...");
        Table table3 = new Table ("table3", 1);
        tableList.receiveResource(table3);
        System.out.println(distributor.toString());

        System.out.println("\n" +"7. table4 coming...");
        Table table4 = new Table ("table4",1);
        tableList.receiveResource(table4);

        System.out.println("\n" +"8. customer4 coming...");
        Customer customer4 = new Customer("customer4", "408888888",0);
        customerList.receiveResource(customer4);

        System.out.println("\n" + "9. customer1 cancelled:");
        distributor.releaseTable(customer1);
        System.out.println(distributor.toString());

        System.out.println("\n" + "10. customer2 cancelled:");
        distributor.releaseTable(customer2);
        System.out.println(distributor.toString());

        System.out.println("\n" + "11. customer3 come back on time:");
        distributor.distributeTable(customer3);
        System.out.println(distributor.toString());

        System.out.println("\n" + "12. customer4 come back on time:");
        distributor.distributeTable(customer4);
        System.out.println(distributor.toString());

        System.out.println("\n" +"13. customer5 coming...");
        Customer customer5 = new Customer("customer5", "4084440981",0);
        customerList.receiveResource(customer5);

        System.out.println("\n" +"14. customer6 coming...");
        Customer customer6 = new Customer("customer6", "4088211982",1);
        customerList.receiveResource(customer6);
    }
}
