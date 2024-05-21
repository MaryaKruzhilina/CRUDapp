package ru.maryKr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.maryKr.model.User;
import ru.maryKr.service.DAOservice;

@Controller
public class AddUser {
    private DAOservice service;

    public AddUser(DAOservice service) {
        this.service = service;
    }
    @GetMapping("/add_user")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "add_user";
    }
    @PostMapping("/add_user/add")
    public String addNewUser(@ModelAttribute("user") User user) {
        service.addUser(user);
        return "redirect:/table";
    }
}
