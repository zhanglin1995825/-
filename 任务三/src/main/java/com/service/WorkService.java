package com.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface WorkService {

    List selectByParent (Integer id);
    //查询一级二级标题
    List selectAll();
    //通过二级查询三级
    List selectTwo(Integer id);
}
