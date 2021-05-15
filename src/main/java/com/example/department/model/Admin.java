package com.example.department.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**账号密码**/
public class Admin {
    private int aid;
    private String username;
    private String password;
}
