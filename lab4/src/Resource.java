public abstract class Resource {
    private String ID; //customer: phone_number; table: table_number;
    private int size; //1: big; 0: small;

    public Resource(String ID, int size) {
        this.ID = ID;
        this.size = size;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ID='" + ID + '\'' +
                ", size=" + size + "]";
    }
}
