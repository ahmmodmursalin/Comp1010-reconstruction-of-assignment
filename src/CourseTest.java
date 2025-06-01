import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class CourseTest {

    @Test
    public void testConstructorAndGetName() {
        Course course = new Course("comp1000");
        assertEquals("comp1000", course.getName());
    }

    @Test
    public void testAddStaffsAndGetStaffs() {
        Course course = new Course("comp1010");
        Staff staff1 = new Staff("Alice", "s1");
        Staff staff2 = new Staff("Bob", "s2");

        course.addStaffs(staff1);
        course.addStaffs(staff2);

        ArrayList<Staff> staffList = course.getStaffs();
        assertEquals(2, staffList.size());
        assertTrue(staffList.contains(staff1));
        assertTrue(staffList.contains(staff2));
    }

    @Test
    public void testToStringReturnsName() {
        Course course = new Course("comp1020");
        assertEquals("comp1020", course.toString());
    }
}
