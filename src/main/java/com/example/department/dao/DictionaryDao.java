package com.example.department.dao;

import com.example.department.model.Dictionary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DictionaryDao {
    /**
     * 查询字典表部门
     * @return
     */
    List<Dictionary> getDep();

}
