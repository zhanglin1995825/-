package com.dao;

import com.pojo.Work;

import java.util.List;

public interface WorkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Work record);

    int insertSelective(Work record);

    Work selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Work record);

    int updateByPrimaryKey(Work record);

    List selectByParent(Integer parentId);

    List selectAll();

    List selectById(List item);

    List selectId(Integer parentId);
}