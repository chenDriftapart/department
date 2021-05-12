package com.example.department.service;

import com.example.department.dao.DepartDao;
import com.example.department.model.Department;
import com.example.department.model.OtherModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartService {

    @Resource
    DepartDao depDao;

    /*
        Service层介于controller和dao之间作为服务层进行一些逻辑处理，
        这里逻辑太简单所以知识单纯调用dao所以不做注释
     */
    public List<Department> getAll(OtherModel oth){
        return depDao.getAll(oth);
    }

    public Department getDepByID(int id){
        return depDao.getDepByID(id);
    }

    public void  delete(String id){
        depDao.delete(id);
    }

    public int update(Department dep){
        return depDao.update(dep);
    }

    public int newp(Department dep){
       return depDao.newp(dep);
    }
}
