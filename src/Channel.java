import java.util.ArrayList;

public class Channel {
    // name of the channel
    public String name;

    // list that stores all the playlists in this channel
    public ArrayList<Playlist> playlists;

    // constructor sets the name and creates an empty list of playlists
    public Channel(String name) {
        this.name = name;
        this.playlists = new ArrayList<Playlist>();
    }

    // returns the channel name
    public String getChannel() {
        return this.name;
    }

    // this returns the name, mainly used when printing
    public String toString() {
        return this.name;
    }

    // adds a new playlist to the channel
    public void createPlaylist(Playlist playlists) {
        this.playlists.add(playlists);
    }

    // returns all playlists for this channel
    public ArrayList<Playlist> getPlaylists() {
        return this.playlists;
    }
} 