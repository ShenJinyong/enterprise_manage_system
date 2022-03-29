package com.pxxy.core.entity.dto;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("user")
@ApiModel(value = "UserPo对象", description = "")
public class UserDto {

    @ApiModelProperty("用户账号")
    @TableField("account")
    private String account;

    @ApiModelProperty("用户密码")
    @TableField("password")
    private String password;

    @ApiModelProperty("姓名")
    @TableField("username")
    private String username;

    @ApiModelProperty("性别")
    @TableField("sex")
    private Integer sex;

    @ApiModelProperty("邮件")
    @TableField("email")
    private String email;

    @ApiModelProperty("电话")
    @TableField("phone")
    private String phone;

    @ApiModelProperty("角色表id")
    @TableField("role_id")
    private String roleId;

    @ApiModelProperty("部门表id")
    @TableField("department_id")
    private String departmentId;


}
