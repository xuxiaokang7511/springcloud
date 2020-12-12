package com.provider.service;

import com.api.pojo.Dept;
import com.provider.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl  implements DeptService{

    @Autowired
    private DeptMapper DeptMapper;


    @Override
    public int addDept(Dept dept) {
        return DeptMapper.insert(dept);
    }

    @Override
    public Dept queryDeptById(Long id) {
        return DeptMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Dept> queryDepts() {
        return DeptMapper.selectAll();
    }
}
