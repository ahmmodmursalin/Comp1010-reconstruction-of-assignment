// Staff class extends User and adds a staff ID
public class Staff extends User {

    // unique ID for the staff
    private String staffID;

    // constructor sets name and staff ID
    public Staff(String name, String staffID) {
        super(name);
        this.staffID = staffID;
    }

    // returns the staff ID
    public String getStaffID() {
        return this.staffID;
    }
}