package com.feign.service;


import com.api.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "SPRINGCLOUD-PROVIDER8081")
public interface DeptService {

    @GetMapping("/queryDeptById/{id}")
    public Dept queryById(@PathVariable("id") Long id);

    @GetMapping("/queryDepts")
    public List<Dept> queryAll();

    @GetMapping("/addDept")
    public int addDept(Dept dept);

}
