package ru.maryKr.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.maryKr.model.User;
import ru.maryKr.service.DAOservice;

import java.util.List;

@Controller
public class UserTable {

    private DAOservice service;

    public UserTable(DAOservice service) {
        this.service = service;
    }

    @GetMapping("/table")
    public String getTable(ModelMap model) {
        List<User> users = service.getUsers();
        if (users.size() == 0) {
            return "redirect:/add_user";
        } else {
            model.addAttribute("users_list", users);
            return "table";
        }
    }
}
