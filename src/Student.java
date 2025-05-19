import java.util.ArrayList;

public class Student {
    class User {
        private String name;
        private ArrayList<Channel> channels;

        public User(String name) {
            this.name = name;
            this.channels = new ArrayList<Channel>();
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return this.name;
        }

        public ArrayList<Channel> getChannels() {
            return this.channels;
        }

        public void createChannel(Channel channel) {
            this.channels.add(channel);
        }
    }
}
