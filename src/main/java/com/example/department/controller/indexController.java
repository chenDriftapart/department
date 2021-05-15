package com.example.department.controller;

import com.example.department.model.Admin;
import com.example.department.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class indexController {

    public static final Logger LOGGER = LoggerFactory.getLogger(indexController.class);

    @Resource
    private AdminService adminService;

    @RequestMapping("/boot")
    public String bootstrap(){
        System.out.println("被拦截路径========>");
        return "bootstrap";
    }

    @RequestMapping("/newGroup")
    public String newGroup() {
        return "new_group";
    }

    @RequestMapping("/login")
    public String login(HttpSession session) {
        Object admin = session.getAttribute("admin");
        LOGGER.info("loginAdmin======>"+admin);
        if (admin != null) {
            return "bootstrap";
        }
        return "redirect:/";
    }

    @RequestMapping("/checkLogin")
    @ResponseBody
    public Map<String, String> checkLogin(@RequestParam("name") String name,
                                          @RequestParam("password") String password,
                                          HttpSession session) {
        System.out.println("name=====>"+name+"  " +"password======>"+password);
        Map<String, String> res = adminService.checkUser(name, password, session);
        return res;

    }

    @RequestMapping("/register")
    public String accountSet() {
        return "register_account";
    }

    @RequestMapping("/insertAdmin")
    @ResponseBody
    public int insertAdmin(Admin admin) {
        return adminService.insertAccount(admin);
    }

    @RequestMapping("/query")
    public String query() {
        return "query";
    }

}
