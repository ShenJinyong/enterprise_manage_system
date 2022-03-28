package com.pxxy.core.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "DepartmentDto对象", description = "")
public class DepartmentDto {

    @ApiModelProperty("部门名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("职责描述")
    @TableField("describe")
    private String describe;

    @ApiModelProperty("父部门id")
    @TableField("pid")
    private String pid;


}
