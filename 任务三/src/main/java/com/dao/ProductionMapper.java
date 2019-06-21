package com.dao;

import com.pojo.Production;

import java.util.List;

public interface ProductionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Production record);

    int insertSelective(Production record);

    Production selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Production record);

    int updateByPrimaryKey(Production record);

    List selectByParentId(Integer parentId);

    List<Production>selectOne();

    List selectById(List item);

    List selectByListId(List item);

    List selectall();

    List selectAll();

    List selecId(Integer id);
}
