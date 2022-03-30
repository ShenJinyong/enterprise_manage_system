package com.pxxy.core.entity.dto;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@TableName("holiday")
@ApiModel(value = "HolidayDto对象", description = "")
public class HolidayDto {

    @ApiModelProperty("请假标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("请假人")
    @TableField("username")
    private String username;

    @ApiModelProperty("请假类型")
    @TableField("type")
    private String type;

    @ApiModelProperty("请假原因")
    @TableField("content")
    private String content;

    @ApiModelProperty("开始时间")
    @TableField("start_time")
    private Date startTime;

    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private Date endTime;

}