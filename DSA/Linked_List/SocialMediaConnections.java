import java.util.*;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
    }
}

class SocialNetwork {
    User head = null;

    void addUser(int id, String name, int age) {
        User u = new User(id, name, age);
        if (head == null) head = u;
        else {
            User temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = u;
        }
    }

    void addFriend(int id1, int id2) {
        User u1 = findUser(id1), u2 = findUser(id2);
        if (u1 != null && u2 != null) {
            u1.friendIds.add(id2);
            u2.friendIds.add(id1);
        }
    }

    User findUser(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    void showFriends(int id) {
        User u = findUser(id);
        if (u != null) {
            System.out.println(u.name + "'s friends: " + u.friendIds);
        }
    }
}

public class SocialMediaConnections {
    public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();
        sn.addUser(1, "Amit", 21);
        sn.addUser(2, "Riya", 20);
        sn.addUser(3, "John", 22);
        sn.addFriend(1, 2);
        sn.addFriend(1, 3);
        sn.showFriends(1);
    }
}
