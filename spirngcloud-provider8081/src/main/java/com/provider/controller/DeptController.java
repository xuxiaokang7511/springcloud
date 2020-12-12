package com.provider.controller;

import com.api.pojo.Dept;
import com.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;


    @PostMapping("/addDept")
    public int addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/queryDeptById/{id}")
    public Dept queryDeptById(@PathVariable("id") Long id){
        System.out.println(id);
        return deptService.queryDeptById(id);
    }

    @GetMapping("/queryDepts")
    public List<Dept> queryDepts() {
        return deptService.queryDepts();
    }

}
