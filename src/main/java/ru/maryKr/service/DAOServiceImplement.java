package ru.maryKr.service;

import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import ru.maryKr.DAO.UserDAO;
import ru.maryKr.DAO.UserDAOImplement;
import ru.maryKr.model.User;

import java.util.List;
@Component
public class DAOServiceImplement implements DAOservice{

    private UserDAO userDAO = new UserDAOImplement();

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
