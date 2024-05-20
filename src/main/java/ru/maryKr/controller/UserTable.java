package ru.maryKr.controller;

import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.maryKr.service.DAOServiceImplement;
import ru.maryKr.service.DAOservice;

@Controller
public class UserTable {

    private DAOservice service = new DAOServiceImplement();

    @GetMapping("/table")
    public String getTable(ModelMap model) {
        model.addAttribute("users_list", service.getUsers());
        return "table";
    }
}
