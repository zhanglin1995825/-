package com.service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.logging.Logger;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class WorkServiceTest {

@Autowired
WorkService workService;

    @Test
    public void selectByParent() {
        //logger.info("list");
        Integer list=new Integer(1);
        System.out.println(workService.selectByParent(list));
    }
    @Test
    public void selectAll(){
        System.out.println(workService.selectAll());
    }
    @Test
    public void selectTwo(){
        Integer list=new Integer(2);
        System.out.println(workService.selectTwo(list));
    }
}