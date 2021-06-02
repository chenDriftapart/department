package com.example.department.controller;

import com.example.department.model.DepartDictionary;
import com.example.department.model.Department;
import com.example.department.model.OtherModel;
import com.example.department.service.DepartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DepartmentController {

    public static final Logger log = LoggerFactory.getLogger(DepartmentController.class);

    @Resource
    private DepartService deps;

    @RequestMapping("/getAll")
    public List<DepartDictionary> getUser(OtherModel oth) {
        log.info("oth====>"+oth);
        List<DepartDictionary> dep = deps.getAll(oth);
        return dep;
    }
    @RequestMapping("/getLay")
    public HashMap<String,Object> getDep(OtherModel oth) {
        List<DepartDictionary> dep = deps.getAll(oth);
        HashMap<String,Object> map= new HashMap<>();
        map.put("code",0);
        map.put("mes","success");
        map.put("data",dep);
        return map;
    }
    @RequestMapping("/getDepById")
    public Department getDepById(Integer id) {
      Department dep = deps.getDepByID(id);
        return dep;
    }
    //修改单挑数据
    @RequestMapping("changeOne")
    public int changeOne(Department department) {
        return deps.update(department);
    }
    //插入单条数据
    @RequestMapping("insertOne")
    public int insertOne(Department dep) {
        log.info("dep===>"+dep);
        return deps.newp(dep);
    }
    //批量删除
    @RequestMapping("removeById")
    public String removeById(String ids) {
        String substring = ids.substring(0, ids.length() - 1);
        String[] split = substring.split(",");
        try {
            for (int i = 0; i < split.length; i++) {
                deps.delete(split[i]);
            }
            return "success";
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return "error";
        }

    }

    @RequestMapping("/getH")
    public Map<String,Object> getDep1(OtherModel oth) {
       Map<String,Object> map= deps.getLay(oth);
        return map;
    }

    @RequestMapping("/getCount")
    public Map<String,Object> getCount() {
        HashMap<String,Object> map=new HashMap<>();
        Integer count=deps.getCount();
        map.put("count",count);
        map.put("mes","success");
        return map;
    }


}
