import java.util.ArrayList;

public class Student extends User {

    // list of other students this student follows
    public final ArrayList<Student> following;

    // sets the student name and starts with no one followed
    public Student(String name) {
        super(name);
        this.following = new ArrayList<>();
    }

    // adds another student to the following list (if not already followed)
    public void follow(Student otherStudent) {
        if (!following.contains(otherStudent)) {
            following.add(otherStudent);
        }
    }

    // returns the list of followed students
    public ArrayList<Student> getFollowing() {
        return this.following;
    }

    // returns student name when printing
    @Override
    public String toString() {
        return getName();
    }
}