package com.provider.service;

import com.api.pojo.Dept;

import java.util.List;

public interface DeptService {
    int addDept(Dept dept);

    Dept queryDeptById(Long id);

    List<Dept> queryDepts();
}
