package com.pxxy.core.controller;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pxxy.core.entity.po.RolePo;
import com.pxxy.core.service.RoleService;
import com.pxxy.core.service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 沈金勇
 * @since 2022-03-28 10:06:54
 */
@RestController
@RequestMapping("/core/rolePo")
public class RoleController {

    @Autowired
    private RoleServiceImpl roleService;

    /**
     * 添加角色
     * */
    @PostMapping("/add")
    public void addRole(String roleName){
        RolePo rolePo = new RolePo();
        rolePo.setName(roleName);
        roleService.save(rolePo);
    }

    /**
     * 查询所有角色
     * */
    @GetMapping("getAllRole")
    public List<RolePo> getAllRole(){
        return roleService.selectAllRole();
    }
}
