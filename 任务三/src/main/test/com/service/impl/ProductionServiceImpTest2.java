package com.service.impl;

import com.service.ProductionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class ProductionServiceImpTest2 {
@Autowired
    ProductionService productionService;
    @Test
    public void selectByPid() {
        List id=productionService.selectByPid(1);
        System.out.println(id);
    }
    @Test
    public void listid() {
        List list=productionService.listid(1);
        System.out.println(list);
    }
    @Test
    public void selectByPid1(){
        Integer Id=new Integer(5);
        System.out.println(productionService.selectByPid(Id));
    }
    @Test
    public void selectThree(){
        Integer id=new Integer(1);
        System.out.println(productionService.selectThree(id));
    }
    @Test
    public void selectByParent1(){
        Integer id=new Integer(1);
        System.out.println(productionService.selectByParent1(id));

    }
    @Test
    public void selectTwo(){
        Integer i=new Integer(2);
        System.out.println(productionService.selectTwo(i));
    }

}