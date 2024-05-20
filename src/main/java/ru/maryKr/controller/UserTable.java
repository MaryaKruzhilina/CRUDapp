package ru.maryKr.controller;

import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.maryKr.model.User;
import ru.maryKr.service.DAOServiceImplement;
import ru.maryKr.service.DAOservice;

import java.util.List;

@Controller
public class UserTable {

    private  DAOservice service;

    public UserTable(DAOservice service) {
        this.service = service;
    }

    @GetMapping("/table")
    public String getTable(ModelMap model) {
        List<User> users = service.getUsers();
        if (users.isEmpty()) {
            return "add_user";
        }
        model.addAttribute("users_list", users);
        return "table";
    }
}
