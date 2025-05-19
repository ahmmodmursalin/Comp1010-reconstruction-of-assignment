import java.io.IOException;

public class Client {
   public static void main(String[] args) throws IOException {
        System.out.println("==== Starting Staff and Channel System ====");
        System.out.println("\n-- Creating Staff Members --");
        System.out.println("Creating staff: Michael (Michael) Lay-Kujiraoka");
        Staff staff1 = new Staff("Spenser" , "s1");
        System.out.println("Staff 1 created: " + staff1.getName());
        System.out.println("Staff 1 channels: "
                + (staff1.getChannels().isEmpty() ? "No channels assigned" : staff1.getChannels()));

        Staff staff2 = new Staff("Kevin" , "s2");
        System.out.println("Staff 2 created: " + staff2.getName());
        System.out.println("Staff 2 channels: "
                + (staff2.getChannels().isEmpty() ? "No channels assigned" : staff2.getChannels()));

        System.out.println("\n-- Creating Channels --");
        System.out.println("Creating a channel (Comp1010)...");
        Channel channel1 = new Channel("study helpers");
        System.out.println("Channel 1 created: " + channel1.getChannel());

        Channel channel2 = new Channel("lecture notes");
        System.out.println("Channel 2 created: " + channel2.getChannel());

        System.out.println("\n-- Assigning Channels to Staff --");
        staff1.createChannel(channel1);
        System.out.println("Added '" + channel1.getChannel() + "' channel to " + staff1.getName());
        System.out.println("Staff 1 channels: " + (staff1.getChannels()));

        staff2.createChannel(channel2);
        System.out.println("Added '" + channel2.getChannel() + "' channel to " + staff2.getName());
        System.out.println("Staff 2 channels: " + (staff2.getChannels()));

        System.out.println("\n-- Course Organization --");
        System.out.println("Comp1010 holds two playlists: 'Help Sessions' and 'Lectures'");
        Playlist playlist1 = new Playlist("Help Sessions");
        System.out.println("playlist 1 " + playlist1.getVideos());
        Playlist playlist2 = new Playlist("Lectures");
        System.out.println("playlist 2 " + playlist2.getVideos());

        playlist1.createVideo(new Video("how to study"));
        playlist1.createVideo(new Video("basics of java"));
        playlist1.createVideo(new Video("comp1000 recap"));
        playlist1.createVideo(new Video("what to come in comp1010"));
        System.out.println("playlist 1 videos" + playlist1.getVideos());

        for (int i = 1; i <= 12; i++) {

            playlist2.createVideo(new Video("week " + i));
        }
        System.out.println("playlist 2 videos" + playlist2.getVideos());

        System.out.println("In 'lecture notes' channel: Creating 12 videos (Week 1 to Week 12)");

        System.out.println("--- Course ---");
        System.out.println("Create course 1");
        System.out.println("Add staff channels");

        Course course1 = new Course("comp1000");
        System.err.println("course 1 " + course1.getName());
        course1.addStaffs(staff1);
        System.out.println("course 1 " + course1.getStaffs());

        Course course2 = new Course("comp1010");
        System.err.println("course 2 " + course2.getName());
        course2.addStaffs(staff2);
        System.out.println("course 2 " + course2.getStaffs());

        System.out.println("--- File IO ---");
        System.out.println("Print all playlist from a course");
        
        course1.saveChannelsToCSV("educational video");
    }

}








