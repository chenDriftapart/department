package com.example.department.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtherModel {
    private String pageNumber;
    private String pageSize;
    private String sortName;
    private String sortOrder;
    private String eplName;
    private String departName;
    private String groupState;
    private String time1;
    private String time2;

}
