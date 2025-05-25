import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PlaylistTest {

    @Test
    public void testAddSingleVideo() {
        Playlist playlist = new Playlist("My Playlist");
        Video video = new Video("Intro to Java");
        playlist.createVideo(video);
        assertEquals(1, playlist.getVideos().size());
        assertEquals("Intro to Java", playlist.getVideos().get(0).getName());
    }

    @Test
    public void testAddMultipleVideos() {
        Playlist playlist = new Playlist("Lecture Series");
        ArrayList<Video> videoList = new ArrayList<>();
        videoList.add(new Video("Week 1"));
        videoList.add(new Video("Week 2"));
        playlist.createMultipleVidoes(videoList);
        assertEquals(2, playlist.getVideos().size());
        assertEquals("Week 1", playlist.getVideos().get(0).getName());
        assertEquals("Week 2", playlist.getVideos().get(1).getName());
    }
}