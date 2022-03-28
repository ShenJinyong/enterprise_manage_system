package com.pxxy.core.entity.po;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 沈金勇
 * @since 2022-03-28 10:06:54
 */
@Getter
@Setter
@TableName("user")
@ApiModel(value = "UserPo对象", description = "")
public class UserPo {

    @ApiModelProperty("主键")
    @TableId("id")
    private String id;

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

    @ApiModelProperty("状态")
    @TableField("state")
    private Integer state;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty("更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty("乐观锁")
    @TableField("version")
    @Version
    private Integer version;

    @ApiModelProperty("逻辑删除")
    @TableField("deleted")
    @TableLogic
    private Integer deleted;

    @ApiModelProperty("角色表id")
    @TableField("role_id")
    private String roleId;

    @ApiModelProperty("部门表id")
    @TableField("department_id")
    private String departmentId;


}
