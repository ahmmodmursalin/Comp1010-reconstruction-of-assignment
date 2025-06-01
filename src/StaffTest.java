import static org.junit.Assert.*;
import org.junit.Test;

public class StaffTest {

    @Test
    public void testConstructorAndGetName() {
        Staff staff = new Staff("Alice", "S123");
        assertEquals("Alice", staff.getName());
    }

    @Test
    public void testGetStaffID() {
        Staff staff = new Staff("Bob", "S456");
        assertEquals("S456", staff.getStaffID());
    }

    @Test
    public void testChannelsInitiallyEmpty() {
        Staff staff = new Staff("Carol", "S789");
        assertTrue(staff.getChannels().isEmpty());
    }
}