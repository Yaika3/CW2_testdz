<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
=======

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Oleg ", 18);
        User user2 = new User("Alex", 20);
        User user3 = new User("Alex", 20);
        User user4 = new User("Oleg", 18);
        Phone phone1 = new Phone("A");
        Phone phone2 = new Phone("b");
        List <User> people = new ArrayList<>();
        people.add(user1);
        people.add(user2);
        people.add(user3);
        people.add(user4);


        Map<User, Phone> mapUser = new HashMap<>();
        mapUser.put(user1, phone1);
        mapUser.put(user1, phone1);
        mapUser.put(user2, phone2);
        mapUser.put(user2, phone2);
        Predicate<User> predicate = new Predicate<User>() {
            @Override
            public boolean test(User user) {

                return user.age > 20;
            }
        };
        System.out.println(mapUser);
        System.out.println(predicate.test(user1));
>>>>>>> efb5e29 (1 commit)
    }
}
