package com.example.department.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
