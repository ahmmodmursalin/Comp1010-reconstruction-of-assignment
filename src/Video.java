public class Video {

    // name of the video
    private String name;
    private Video nextVideo;

    
    public void setNextVideo(Video nextVideo){
        this.nextVideo = nextVideo;
    }
    public Video getNextVideo() {
        return this.nextVideo;

    }
    
    // sets the video name
    public Video(String name) {
        this.name = name;
    }

    // returns the video name
    public String getName() {
        return this.name;
    }

    // returns video name as string (for printing)

    public String toString() {
        return this.name;
    }

    }
