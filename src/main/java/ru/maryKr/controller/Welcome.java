package ru.maryKr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome {
    @GetMapping(value = "/")
    public String getStartPage() {
        return "welcome";
    }

}