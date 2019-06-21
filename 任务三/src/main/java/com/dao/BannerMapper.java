package com.dao;

import com.pojo.Banner;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BannerMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);

    List<Banner> selectAll();

}