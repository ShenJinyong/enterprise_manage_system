package com.pxxy.core.service.impl;

import com.pxxy.core.entity.po.UserPo;
import com.pxxy.core.mapper.UserMapper;
import com.pxxy.core.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 沈金勇
 * @since 2022-03-28 10:06:54
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserPo> implements UserService {

    @Resource
    private UserMapper userMapper;

    public List<UserPo> getAllUser(){
        return userMapper.selectList(null);
    }
}
