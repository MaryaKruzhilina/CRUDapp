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
    public void removeUser(User user) {

    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public void updateUser(User user) {

    }
}
