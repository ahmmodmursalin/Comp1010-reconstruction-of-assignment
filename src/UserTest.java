import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class UserTest {

    @Test
    public void testConstructorAndGetName() {
        User user = new User("John");
        assertEquals("John", user.getName());
    }

    @Test
    public void testToStringReturnsName() {
        User user = new User("Doe");
        assertEquals("Doe", user.toString());
    }

    @Test
    public void testCreateChannelAddsChannel() {
        User user = new User("Alice");
        Channel channel = new Channel("Study Tips");
        user.createChannel(channel);

        ArrayList<Channel> channels = user.getChannels();
        assertEquals(1, channels.size());
        assertEquals("Study Tips", channels.get(0).getChannel());
    }

    @Test
    public void testGetChannelsInitiallyEmpty() {
        User user = new User("Bob");
        assertTrue(user.getChannels().isEmpty());
    }
}