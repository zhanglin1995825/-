package com.service;

import com.pojo.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext.xml")
public class MessageServiceTest {
@Autowired
MessageService messageService;
    @Test
    public void insertSelective() {
        Message record=new Message();
        record.setContent("看得见吗哈哈");
        //record.getCreatAt();
        System.out.println(messageService.insertSelective(record));
    }
}