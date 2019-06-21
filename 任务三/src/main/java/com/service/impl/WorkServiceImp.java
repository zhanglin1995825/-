package com.service.impl;
import com.dao.WorkMapper;
import com.pojo.Work;
import org.apache.log4j.Logger;
import com.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkServiceImp implements WorkService {
    @Autowired
    WorkMapper workMapper;

    List list2=new ArrayList();
//    @Aspect1(operateType = "添加了一个字典项")
    @Override
    public List<Work>selectByParent(Integer id){
        //logger.info("login");
        List<Work>list=workMapper.selectByParent(id);
        if (list.size()!=0){
        for (Work work:list) {
            Integer list1 = work.getId();
            selectByParent(list1);

            }
        list2.add(list);
        }
        return list2;
    }
//查询出所有的一级二级标题
    @Override
    public List selectAll(){

        List<Work> All=workMapper.selectAll();
        List list1=new ArrayList();
        for (Work list:All) {
            Integer ids=list.getParentId();
            list1.add(ids);
        }
       List l= workMapper.selectById(list1);
        return l ;
    }
    //通过二级查询对应的三级
@Override
    public List selectTwo(Integer id){
        return workMapper.selectByParent(id);
}
}
