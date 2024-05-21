package ru.maryKr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.maryKr.model.User;
import ru.maryKr.service.DAOservice;

@Controller
public class UpdateUser {

    private DAOservice service;

    public UpdateUser(DAOservice service) {
        this.service = service;
    }

    @GetMapping("/update_user")
    public String update(@RequestParam("id") long id, Model model) {
        System.out.println(id);
        model.addAttribute("user", service.getUser(id));
        model.addAttribute("id", id);
        return "update_user";
    }
    @PostMapping("/update_user/update")
    public String edit(@RequestParam("id") long id, @ModelAttribute User user) {
        service.updateUser(id, user);
        return "redirect:/table";
    }

}
