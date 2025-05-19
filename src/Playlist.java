import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Video> videos;

    public Playlist(String name) {
        this.name = name;
        this.videos = new ArrayList<Video>();

    }
    public String getName(){
        return this.name;
    }
    public ArrayList<Video> getVideos() {
        return this.videos;
    }

    public void createVideo(Video videos) {
        this.videos.add(videos);
    }

    public void createMultipleVidoes(ArrayList<Video> videos) {
        this.videos.addAll(videos);
    }
} 
    

