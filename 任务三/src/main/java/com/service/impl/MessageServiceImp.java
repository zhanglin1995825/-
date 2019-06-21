package com.service.impl;

import com.dao.MessageMapper;
import com.dao.ProductionMapper;
import com.pojo.Message;
import com.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MessageServiceImp implements MessageService {
    @Autowired
    MessageMapper messageMapper;
    @Autowired
    ProductionMapper productionMapper;
    //通过作品id查询对应的留言

    @Override
    public List<Message>selectMessage(Integer workId){
       return messageMapper.selectMessage(workId);
        }
    @Override
    public boolean insertSelective(Message record){
        return messageMapper.insertSelective(record);
    }
}
