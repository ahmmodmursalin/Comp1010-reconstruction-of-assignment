public class Video {

    // name of the video
    private String name;

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
