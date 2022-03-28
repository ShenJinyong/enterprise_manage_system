package com.pxxy.core.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("department")
@ApiModel(value = "DepartmentVo对象", description = "")
public class DepartmentVo {

    @ApiModelProperty("部门主键")
    @TableId("id")
    private String id;

    @ApiModelProperty("部门名称")
    @TableField("`name`")
    private String name;

    @ApiModelProperty("父部门id")
    @TableField("pid")
    private String pid;

    @ApiModelProperty("部门信息树")
    private List<DepartmentVo> departmentVos;



}
