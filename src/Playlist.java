import java.util.ArrayList;

public class Playlist {

    // name of the playlist (e.g., "Lectures", "Help Sessions")
    private String name;

    // list of videos inside the playlist
    private ArrayList<Video> videos;

    // sets the playlist name and starts with an empty list of videos
    public Playlist(String name) {
        this.name = name;
        this.videos = new ArrayList<Video>();
    }

    // returns the name of the playlist
    public String getName(){
        return this.name;
    }

    // returns all videos inside the playlist
    public ArrayList<Video> getVideos() {
        return this.videos;
    }

    // adds a single video to the playlist
    public void createVideo(Video videos) {
        this.videos.add(videos);
    }

    // adds multiple videos at once to the playlist
    public void createMultipleVidoes(ArrayList<Video> videos) {
        this.videos.addAll(videos);
    }
}