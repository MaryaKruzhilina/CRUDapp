package ru.maryKr.service;

import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.maryKr.DAO.UserDAO;
import ru.maryKr.DAO.UserDAOImplement;
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
        System.out.println(1);
        return userDAO.getUsers();
    }

    @Override
    public void updateUser(User user) {

    }
}
