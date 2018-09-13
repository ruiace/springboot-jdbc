package com.rp.springboot.controller;

import com.rp.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rp on 2018/9/13.
 */
@RestController
public class DeptController {

    @Autowired
    public DeptService deptService;

    @GetMapping("/insert/{id}/{name}")
    public boolean insertDept(@PathVariable("id") int id,@PathVariable("name") String name){
        int result = deptService.createDept(id, name);
        return 1>= result;
    }
}
