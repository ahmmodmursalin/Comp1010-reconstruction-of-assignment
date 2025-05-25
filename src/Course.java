import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Course {
    public final String name;
    public final ArrayList<Staff> staffs;

    public Course(String name) {
        this.name = name;
        this.staffs = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Staff> getStaffs() {
        return this.staffs;
    }

    public void addStaffs(Staff staff) {
        this.staffs.add(staff);
    }

    @Override
    public String toString() {
        return this.name;
    }

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
                writer.newLine();
            }
        }
    }
}
