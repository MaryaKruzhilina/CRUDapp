package ru.maryKr.DAO;

import ru.maryKr.model.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);
    void removeUser(long id);
    List<User> getUsers();
    void updateUser(long id, User user);
    User getUser(long id);
}
