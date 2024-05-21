package ru.maryKr.service;

import org.springframework.stereotype.Service;
import ru.maryKr.DAO.UserDAO;
import ru.maryKr.model.User;

import java.util.List;
@Service
public class DAOServiceImplement implements DAOservice{

    private UserDAO userDAO;

    public DAOServiceImplement(UserDAO userDAO){
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

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public void updateUser(long id, User user) {
        userDAO.updateUser(id,user);
    }

    @Override
    public User getUser(long id) {
        return userDAO.getUser(id);
    }
}
