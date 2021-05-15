package com.example.department.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**字典表**/
public class Dictionary {
    private int id;
    private String depart_num;
    private String depart_name;
}
