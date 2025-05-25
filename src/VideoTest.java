import org.junit.Test;
import static org.junit.Assert.*;

public class VideoTest {

    @Test
    public void testGetName() {
        // Test if the name is correctly returned
        Video video = new Video("Intro to Java");
        assertEquals("Intro to Java", video.getName());
    }

    @Test
    public void testToStringReturnsName() {
        // Test if toString returns the same as the name
        Video video = new Video("Week 1 Lecture");
        assertEquals("Week 1 Lecture", video.toString());
    }
}