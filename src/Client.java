import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
System.out.println("==== Starting Staff and Channel System ====");
System.out.println("\n-- Creating Staff Members --");
System.out.println("Creating staff: Michael (Michael) Lay-Kujiraoka");
Staff staff1 = new Staff("Spenser");
System.out.println("Staff 1 created: " + staff1.getName());
System.out.println("Staff 1 channels: " + (staff1.getChannels().isEmpty() ? "No channels assigned" : staff1.getChannels()));

Staff staff2 = new Staff("Kevin");
System.out.println("Staff 2 created: " + staff2.getName());
System.out.println("Staff 2 channels: " + (staff2.getChannels().isEmpty() ? "No channels assigned" : staff2.getChannels()));

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
System.out.println("In 'lecture notes' channel: Creating 12 videos (Week 1 to Week 12)");
    }

}

class Staff {
    private String name;
    private ArrayList<Channel> channels;

    public Staff(String name) {
        this.name = name;
        this.channels = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Channel> getChannels() {
        return this.channels;
    }

    public void createChannel(Channel channel) {
        this.channels.add(channel);
    }
}

class Channel {
    public String name;

    public Channel(String name) {
        this.name = name;
    }

    public String getChannel() {
        return this.name;
    }
    public String toString(){
        return this.name;
    }
}
