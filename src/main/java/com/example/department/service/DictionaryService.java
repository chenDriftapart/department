package com.example.department.service;

import com.example.department.dao.DictionaryDao;
import com.example.department.model.Dictionary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DictionaryService {

    @Resource
    private DictionaryDao dd;

    public List<Dictionary> getDep(){
        return  dd.getDep();
    }
}
