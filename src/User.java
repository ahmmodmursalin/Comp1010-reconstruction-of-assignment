import java.util.ArrayList;

public class User {

    // name of the user (student or staff)
    private String name;

    // list of channels the user is managing or following
    private ArrayList<Channel> channels;

    // sets the user's name and starts with no channels
    public User(String name) {
        this.name = name;
        this.channels = new ArrayList<Channel>();
    }

    // returns the user's name
    public String getName() {
        return this.name;
    }

    // returns the name as string (for printing)
    public String toString() {
        return this.name;
    }

    // returns all channels linked to this user
    public ArrayList<Channel> getChannels() {
        return this.channels;
    }

    // adds a new channel to this user
    public void createChannel(Channel channel) {
        this.channels.add(channel);
    }
}
