public class Staff extends User {
    private String staffID;

    public Staff(String name, String staffID) {
        super(name);
        this.staffID = staffID;
    }

    public String getStaffID() {
        return this.staffID;
    }
}
