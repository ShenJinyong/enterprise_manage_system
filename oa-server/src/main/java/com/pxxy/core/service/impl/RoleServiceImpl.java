package com.pxxy.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pxxy.core.entity.po.RolePo;
import com.pxxy.core.mapper.RoleMapper;
import com.pxxy.core.service.RoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RolePo> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    public List<RolePo> selectAllRole(){
        return roleMapper.selectList(null);
    }
}
