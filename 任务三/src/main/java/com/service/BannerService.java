package com.service;

import com.pojo.Banner;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BannerService  {

    int deleteByPrimaryKey(Integer id);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
    //查询所以有banner状态为上架的banner图
    List<Banner> selectAll();
    //点击banner增加留言功能
   // int insertMessage(Banner content);

    }