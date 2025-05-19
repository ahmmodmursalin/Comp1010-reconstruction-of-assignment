import java.util.ArrayList;

public class Channel {
    private String name;
    private ArrayList<Playlist> playlists;

    public Channel(String name) {
        this.name = name;
        this.playlists = new ArrayList<Playlist>();
    }

    public String getChannel() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    public void createPlaylist(Playlist playlists) {
        this.playlists.add(playlists);
    }

    public ArrayList<Playlist> getPlaylists() {
        return this.playlists;
    }

}
