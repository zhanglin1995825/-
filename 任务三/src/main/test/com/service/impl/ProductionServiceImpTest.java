package com.service.impl;
import com.service.ProductionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class ProductionServiceImpTest {
    @Autowired
    ProductionService productionService;

    @Test
    public void selectByParent() {
        Integer id=new Integer(1);
        System.out.println(productionService.selectByParent(id));
    }
    @Test
    public void selectByParen(){
        List parent=productionService.selectByParent(1);
        System.out.println(parent);
    }

}