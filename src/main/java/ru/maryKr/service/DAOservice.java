package ru.maryKr.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.maryKr.model.User;

import java.util.List;

public interface DAOservice {
    void addUser(User user);
    void removeUser(User user);
    List<User> getUsers();
    void updateUser(User user);
}
