package com.example.department.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class indexController {

    @RequestMapping("/boot")
    public String bootstrap(){
        return "bootstrap";
    }

    @RequestMapping("/newGroup")
    public String newGroup() {
        return "new_group";
    }

    @RequestMapping("/login")
    public String login(HttpSession session) {
        Object user = session.getAttribute("user");
        if (user != null) {
            return "bootstrap";
        }
        return "redirect:/";
    }

}
