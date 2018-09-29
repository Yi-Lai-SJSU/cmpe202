import java.util.ArrayList;

public class Subject {
    private ArrayList<Resource> resources = new ArrayList<>();
    private Observer observer;

    public void attachObserver (Observer observer) {
        System.out.println("Attach Observer...");
        this.observer = observer;
    }

    public void receiveResource (Resource resource) {
        acceptResource(resource);
        observer.match(resource);
    }

    public void acceptResource (Resource resource) {
        resources.add(resource);
        System.out.println("Accept a new resource... ");
        System.out.println("The current List of " + resource.getClass().getName() + " is: ");
        System.out.println(this.toString());
    }

    public Resource offerResource (int index) {
        if (isEmpty()) {
            System.out.println("The current resource is: empty");
            return null;
        } else {
            return resources.remove(index);
        }
    }

    public ArrayList<Resource> getResources() {
        return resources;
    }

    public void setResources(ArrayList<Resource> resources) {
        this.resources = resources;
    }

    private boolean isEmpty() {
        if (resources.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getResourcesSize() {
        return resources.size();
    }

    @Override
    public String toString() {
        return resources.toString();
    }
}
