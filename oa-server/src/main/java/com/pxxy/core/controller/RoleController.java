package com.pxxy.core.controller;

import com.pxxy.core.entity.po.RolePo;
import com.pxxy.core.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private RoleService roleService;

    /**
     * 添加角色
     * */
    @GetMapping("/add")
    public void addRole(String roleName){
        RolePo rolePo = new RolePo();
        rolePo.setName(roleName);
        roleService.save(rolePo);
    }

}
