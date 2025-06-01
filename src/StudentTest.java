import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class StudentTest {

    @Test
    public void testConstructorAndGetName() {
        Student student = new Student("John");
        assertEquals("John", student.getName());
        assertTrue(student.getFollowing().isEmpty());
    }

    @Test
    public void testToStringReturnsName() {
        Student student = new Student("Doe");
        assertEquals("Doe", student.toString());
    }

    @Test
    public void testFollowAddsStudent() {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.follow(student2);

        ArrayList<Student> following = student1.getFollowing();
        assertEquals(1, following.size());
        assertEquals("Bob", following.get(0).getName());
    }

    @Test
    public void testFollowNoDuplicates() {
        Student student1 = new Student("Charlie");
        Student student2 = new Student("Dave");

        student1.follow(student2);
        student1.follow(student2);

        ArrayList<Student> following = student1.getFollowing();
        assertEquals(1, following.size());
    }
}
