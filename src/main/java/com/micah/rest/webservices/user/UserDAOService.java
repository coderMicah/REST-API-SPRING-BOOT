package com.micah.rest.webservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount;

    static {
        users.add(new User(++usersCount, "John Doe", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Jane Doe", LocalDate.now().minusYears(26)));
        users.add(new User(++usersCount, "Jasmine Doe", LocalDate.now().minusYears(12)));
    }

    // retrieve all users
    public List<User> findAll() {
        return users;
    }

    // retrieve all users
    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    // create a user
    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;

    }
    // delete a user
    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        users.removeIf(predicate);
    }
}
