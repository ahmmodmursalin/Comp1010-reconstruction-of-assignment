import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class ChannelTest {

    @Test
    public void testGetChannel() {
        Channel channel = new Channel("My Channel");
        assertEquals("My Channel", channel.getChannel());
    }

    @Test
    public void testToString() {
        Channel channel = new Channel("Lectures");
        assertEquals("Lectures", channel.toString());
    }

    @Test
    public void testCreatePlaylistAndGetPlaylists() {
        Channel channel = new Channel("Help Channel");
        Playlist playlist = new Playlist("Help Playlist");
        channel.createPlaylist(playlist);

        ArrayList<Playlist> playlists = channel.getPlaylists();

        assertEquals(1, playlists.size());
        assertEquals("Help Playlist", playlists.get(0).getName());
    }
}