package com.example.department.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**用户字典表**/
public class DepartDictionary extends Department{

    private String depart_num;
    private String depart_name;
}
