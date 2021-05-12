package com.example.department.dao;


import com.example.department.model.Department;
import com.example.department.model.OtherModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartDao {

    /*
    查所有
    return List<Department>
     */
    List<Department> getAll(OtherModel oth);

    /*
    根据ID查询
    {id} 要查询用户的 id
     */
    Department getDepByID(int id);

    /*
    删除
    {id} 要删除人员的 id
     */
    void delete(String id);

    /*
    更新
    {p} 要更新的用户实例
     */
    int update(Department dep);

    /*
    增加
    {p} 要新增的Department实例
     */
    int newp(Department dep);
}
