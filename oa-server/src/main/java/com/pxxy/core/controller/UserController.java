package com.pxxy.core.controller;

import com.pxxy.core.entity.dto.UserDto;
import com.pxxy.core.entity.po.UserPo;
import com.pxxy.core.service.impl.UserServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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
@RequestMapping("/core/userPo")
public class UserController {

    @Resource
    private UserServiceImpl userService;

    /**
     * 添加用户
     * */
    @PostMapping("/addUser")
    public void addUser(@RequestBody UserDto userDto){
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userDto,userPo);
        userService.save(userPo);
    }


    @GetMapping("/getAllUser")
    public List<UserPo> getAllUser(){
        return userService.getAllUser();
    }
}
