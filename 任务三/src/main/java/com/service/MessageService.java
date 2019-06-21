package com.service;

import com.pojo.Message;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MessageService {
//查询留言
    List<Message>selectMessage(Integer workId );
//插入留言
    boolean insertSelective(Message record);
}
