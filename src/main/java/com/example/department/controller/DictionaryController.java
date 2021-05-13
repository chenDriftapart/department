package com.example.department.controller;

import com.example.department.model.Dictionary;
import com.example.department.service.DictionaryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DictionaryController {

    @Resource
    private DictionaryService ds;

    @RequestMapping("/getDep")
    public List<Dictionary> getDep(){
        return ds.getDep();
    }
}
