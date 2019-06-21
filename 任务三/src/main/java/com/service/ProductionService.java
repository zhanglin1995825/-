package com.service;

import com.pojo.Production;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductionService {

    List<Production> selectone();

    List selectByParent(Integer id);

    List selectByPid(Integer id);

    List listid(Integer id);

    List selectByParent1(Integer id);
    //写死的方法通过一级查询对应的所有作品
    List selectThree(Integer id);
    //查询所有一级二级标题
    List selectAll();
    //二级查三级
    List selectTwo(Integer id);

}
