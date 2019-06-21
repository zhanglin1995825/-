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
public class WorkMapperTest {
    @Autowired
    WorkMapper workMapper;
    @Test
    public void selectByParent() {
        Integer id=new Integer(1);
        System.out.println(workMapper.selectByParent(id));
    }
    @Test
    public void selectByParent1(){
        List list=workMapper.selectByParent(1);
        System.out.println(list);
    }
//    @Test
//    public void selectById(){
//        System.out.println(workMapper.);
//    }

}