package com.example.department.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private String id;
    private String name;
    private String dep;
    private int age;
    private String sex;
    private String entryTime;

}
