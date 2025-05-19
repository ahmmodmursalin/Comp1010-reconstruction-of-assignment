import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Staff> staffs;

    public Course(String name) {
        this.name = name;
        this.staffs = new ArrayList<Staff>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Staff> getStaffs() {
        return this.staffs;
    }

    public void addStaffs(Staff staffs) {
        this.staffs.add(staffs);
    }

    public String toString() {
        return this.name;
    }

    public void saveChannelsToCSV(String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        ArrayList<Channel> courseChannel = new ArrayList<Channel>();
        for (Staff staff : this.staffs){
            courseChannel.addAll(staff.getChannels());
        }
        for (Channel channel : courseChannel) {
            writer.write(channel.toString());
            writer.newLine();
        }
        writer.close();
    }
}

