import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Course {

    // course name like comp1010
    public final String name;

    // list of staff linked to this course
    public final ArrayList<Staff> staffs;

    // sets the course name and creates an empty staff list
    public Course(String name) {
        this.name = name;
        this.staffs = new ArrayList<>();
    }

    // returns the course name
    public String getName() {
        return this.name;
    }

    // returns all staff in the course
    public ArrayList<Staff> getStaffs() {
        return this.staffs;
    }

    // adds a staff member to the course
    public void addStaffs(Staff staff) {
        this.staffs.add(staff);
    }

    // returns course name as string (used when printing)
    @Override
    public String toString() {
        return this.name;
    }

    // writes course structure to a text file
    public void saveChannelsToCSV(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Staff staff : this.staffs) {
                writer.write("Staff: " + staff.getName());
                writer.newLine();

                for (Channel channel : staff.getChannels()) {
                    writer.write("  Channel: " + channel.getChannel());
                    writer.newLine();

                    for (Playlist playlist : channel.getPlaylists()) {
                        writer.write("    Playlist: " + playlist.getName());
                        writer.newLine();

                        for (Video video : playlist.getVideos()) {
                            writer.write("      Video: " + video.getName());
                            writer.newLine();
                        }
                    }
                }

                writer.newLine(); // space between staff blocks
            }
        }
    }
}