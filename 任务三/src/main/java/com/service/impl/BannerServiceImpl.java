package com.service.impl;

import com.dao.BannerMapper;
import com.pojo.Banner;
import com.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    BannerMapper bannerDao;
    @Override
    public int deleteByPrimaryKey(Integer id){
        return bannerDao.deleteByPrimaryKey(id);
    }
    @Override
    public int insert(Banner record){
        return bannerDao.insert(record);
    }

    @Override
    public int insertSelective(Banner record) {
        return bannerDao.insertSelective(record);
    }

    @Override
    public Banner selectByPrimaryKey(Integer id) {
        return bannerDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Banner record) {
        return bannerDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Banner record) {
        return bannerDao.updateByPrimaryKey(record);
    }
//查询所有状态为上架的banner图
    @Override
    public List<Banner>selectAll(){
        return bannerDao.selectAll();
    }
}
