package ru.maryKr.DAO;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.maryKr.model.User;

import java.util.List;
@Component
public class UserDAOImplement implements UserDAO{
    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public void addUser(User user) {
        em.persist(user);
    }
    @Transactional
    @Override
    public void removeUser(long id) {
        em.remove(em.find(User.class, id));
    }
    @Transactional
    @Override
    public List<User> getUsers() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }
    @Transactional
    @Override
    public void updateUser(long id, User user) {
        User u = em.find(User.class, id);
        u.setName(user.getName());
        u.setEmail(user.getEmail());
        u.setLastname(user.getLastname());
        u.setAge(user.getAge());
        em.merge(u);
    }

    @Override
    public User getUser(long id) {
        return em.find(User.class, id);
    }
}
