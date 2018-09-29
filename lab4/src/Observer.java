public class Observer {

    protected Subject customerList;
    protected Subject tableList;
    protected Distributor distributor;

    public Observer(Subject customList, Subject tableList) {
        this.customerList = customList;
        this.tableList = tableList;
        System.out.println("add customerList and tableList to Observer!");
    }

    public void attachDistributor (Distributor distributor) {
        this.distributor = distributor;
    }

    public void match (Resource resource) {

        Subject peerSubject = getPeerSuject(resource);
        Subject selfSubject = getSelfSuject(resource);

        if (peerSubject.getResourcesSize() == 0) {
            System.out.println("No available peer resource.");
        } else {
            int size = resource.getSize();
            for(int i = 0; i < peerSubject.getResourcesSize(); i++) {
                if(peerSubject.getResources().get(i).getSize() == size) {
                    System.out.println("Resource matched...");
                    Resource self = selfSubject.offerResource(selfSubject.getResourcesSize() - 1);
                    Resource peer = peerSubject.offerResource(i);
                    distribute (self, peer);
                    break;
                }
            }
        }
    }

    public void recycleTable(Resource resource) {
        tableList.receiveResource(resource);
    }

    private Subject getSelfSuject (Resource resource) {
        if (resource.getClass().getName().equals("Customer")) {
            return this.customerList;
        } else {
            return this.tableList;
        }
    }

    private Subject getPeerSuject (Resource resource) {
        if (resource.getClass().getName().equals("Customer")) {
            return this.tableList;
        } else {
            return this.customerList;
        }
    }

    public void distribute(Resource resource1, Resource resource2) {
        System.out.println("Start to distribute resource in the distributor....");
        distributor.addCustomerTablePair(resource1, resource2);
    }
}
