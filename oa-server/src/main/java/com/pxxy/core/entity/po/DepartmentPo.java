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
import lombok.*;

/**
 * <p>
 * 
 * </p>
 *
 * @author 沈金勇
 * @since 2022-03-28 10:06:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("department")
@ApiModel(value = "DepartmentPo对象", description = "")
public class DepartmentPo {

    @ApiModelProperty("部门主键")
    @TableId("id")
    private String id;

    @ApiModelProperty("部门名称")
    @TableField("`name`")
    private String name;

    @ApiModelProperty("职责描述")
    @TableField("`describe`")
    private String describe;

    @ApiModelProperty("父部门id")
    @TableField("pid")
    private String pid;

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


}
