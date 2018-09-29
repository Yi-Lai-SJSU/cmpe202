public class Customer extends Resource {

    private String lastName;

    public Customer(String lastName, String phoneNumber, int size) {
        super(phoneNumber,size);
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return  "\n lastName='" + lastName + "' , " + super.toString() + "\n";
    }
}
