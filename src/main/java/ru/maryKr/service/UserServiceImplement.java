package ru.maryKr.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.maryKr.dao.UserDAO;
import ru.maryKr.model.User;

import java.util.List;
@Service
@Transactional
public class UserServiceImplement implements UserService {

    private final UserDAO userDAO;

    public UserServiceImplement(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public void removeUser(long id) {
        userDAO.removeUser(id);
    }
    @Transactional(readOnly = true)
    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public void updateUser(long id, User user) {
        userDAO.updateUser(id,user);
    }
    @Transactional(readOnly = true)
    @Override
    public User getUser(long id) {
        return userDAO.getUser(id);
    }
}
