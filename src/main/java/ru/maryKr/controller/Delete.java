package ru.maryKr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.maryKr.service.DAOservice;

@Controller
public class Delete {

    private DAOservice service;

    public Delete(DAOservice service) {
        this.service = service;
    }

    @GetMapping("/delete")
    public String edit(@RequestParam("id") long id) {
        System.out.println(id);
        service.removeUser(id);
        return "redirect:/table";
    }
}
