import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        
        // starting the system

        // creating staff members
        Staff staff1 = new Staff("Steven", "s1");
        System.out.println("Staff 1 created: " + staff1.getName());
        System.out.println("Staff 1 channels: " + 
            (staff1.getChannels().isEmpty() ? "No channels assigned" : staff1.getChannels()));

        Staff staff2 = new Staff("Kevin", "s2");
        System.out.println("Staff 2 created: " + staff2.getName());
        System.out.println("Staff 2 channels: " + 
            (staff2.getChannels().isEmpty() ? "No channels assigned" : staff2.getChannels()));

        // making channels for videos
        Channel channel1 = new Channel("study helpers");
        System.out.println("Channel 1 created: " + channel1.getChannel());

        Channel channel2 = new Channel("lecture notes");
        System.out.println("Channel 2 created: " + channel2.getChannel());

        // assigning channels to each staff
        staff1.createChannel(channel1);
        System.out.println("Added '" + channel1.getChannel() + "' channel to " + staff1.getName());
        System.out.println("Staff 1 channels: " + staff1.getChannels());

        staff2.createChannel(channel2);
        System.out.println("Added '" + channel2.getChannel() + "' channel to " + staff2.getName());
        System.out.println("Staff 2 channels: " + staff2.getChannels());

        // organizing playlists
        Playlist playlist1 = new Playlist("Help Sessions");
        System.out.println("playlist 1 " + playlist1.getVideos());
        Playlist playlist2 = new Playlist("Lectures");
        System.out.println("playlist 2 " + playlist2.getVideos());

        // adding some videos to Help Sessions Playlist
        playlist1.createVideo(new Video("How to study"));
        playlist1.createVideo(new Video("Basics of java"));
        playlist1.createVideo(new Video("Comp1000 recap"));
        playlist1.createVideo(new Video("What to come in comp1010"));
        System.out.println("playlist 1 videos" + playlist1.getVideos());


        // next video feature 
        Video introPartOne = new Video("Intro to MqTube Part 1"); 
        Video introPartTwo = new Video("intro to MqTube Part 2");
        introPartOne.setNextVideo(introPartTwo);

        // adding 12 weekly lecture videos to Lecture playlist
        for (int i = 1; i <= 12; i++) {
            playlist2.createVideo(new Video("Week " + i));
        }
        System.out.println("playlist 2 videos" + playlist2.getVideos());

        System.out.println("In 'lecture notes' channel: Creating 12 videos (Week 1 to Week 12)");

        // creating course objects and linking staff
        Course course1 = new Course("Comp1000");
        System.err.println("Course 1 " + course1.getName());
        course1.addStaffs(staff1);
        System.out.println("Course 1 " + course1.getStaffs());

        Course course2 = new Course("Comp1010");
        System.err.println("Course 2 " + course2.getName());
        course2.addStaffs(staff2);
        System.out.println("Course 2 " + course2.getStaffs());

        // saving channel info to a file
        course1.saveChannelsToCSV("educational video");
    }
}