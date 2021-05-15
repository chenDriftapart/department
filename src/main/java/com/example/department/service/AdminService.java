package com.example.department.service;

import com.example.department.dao.AdminDao;
import com.example.department.model.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Service
public class AdminService {

    @Resource
    private AdminDao ad;

    public Map<String, String> checkUser(String uname, String password, HttpSession session) {
        Admin admin =ad.getAdmByName(uname);
        System.out.println("查询出来的用户======>"+admin);
        Map<String, String> res = new HashMap<>();
        if (admin != null) {
            if (password.equals(admin.getPassword())) {
                session.setAttribute("admin", admin);
                res.put("mes", "success");
                res.put("address", "/login");
            } else {
                res.put("mes", "密码错误");
            }
        } else {
            res.put("mes", "用户不存在");
        }
        return res;
    }

    public int insertAccount(Admin admin){
        return ad.insertAccount(admin);
    }
}
