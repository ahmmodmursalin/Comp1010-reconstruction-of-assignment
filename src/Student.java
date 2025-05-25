import java.util.ArrayList;

public class Student extends User {

    public final ArrayList<Student> following;

    public Student(String name) {
        super(name);
        this.following = new ArrayList<>();
    }

    public void follow(Student otherStudent) {
        if (!following.contains(otherStudent)) {
            following.add(otherStudent);
        }
    }

    public ArrayList<Student> getFollowing() {
        return this.following;
    }

    @Override
    public String toString() {
        return getName();
    }
}
