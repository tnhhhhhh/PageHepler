package com.tnh.pagehelper.service.impl;

import com.tnh.pagehelper.domain.TbUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.tnh.pagehelper.mapper.TbUserMapper;
import com.tnh.pagehelper.service.TbUserService;

import java.util.List;

@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public List<TbUser> select() {
        return tbUserMapper.selectAll();
    }
}
