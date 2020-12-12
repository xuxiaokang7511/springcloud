package com.provider.mapper;

import com.api.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    int deleteByPrimaryKey(Long deptno);

    int insert(Dept record);

    Dept selectByPrimaryKey(Long deptno);

    List<Dept> selectAll();

    int updateByPrimaryKey(Dept record);

}