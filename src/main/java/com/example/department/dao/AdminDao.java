package com.example.department.dao;

import com.example.department.model.Admin;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AdminDao {

    /**
     *
     * @param uname
     * @return
     */
    Admin getAdmByName(String uname);

    /**
     * 新增
     */
    int insertAccount(Admin admin);


}
