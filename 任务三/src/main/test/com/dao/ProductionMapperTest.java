package com.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class ProductionMapperTest {
    @Autowired
    ProductionMapper productionMapper;

    @Test
    public void selectByParentId() {
        Integer parentId=new Integer(1);
        System.out.println(productionMapper.selectByParentId(parentId));
    }
    @Test
    public void selectByParent(){
        List list=productionMapper.selectByParentId(1);
        System.out.println(list);
    }

}