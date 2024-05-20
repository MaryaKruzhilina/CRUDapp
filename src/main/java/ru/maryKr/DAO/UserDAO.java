package ru.maryKr.DAO;

import org.springframework.stereotype.Component;
import ru.maryKr.model.User;

import java.util.List;

@Component
public interface UserDAO {
    void addUser(User user);
    void removeUser(User user);
    List<User> getUsers();
    void updateUser(User user);
}
