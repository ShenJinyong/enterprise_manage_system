package com.pxxy.core.entity.dto;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@TableName("announcement")
@ApiModel(value = "AnnouncementDto对象", description = "")
public class AnnouncementDto {

    @ApiModelProperty("公告标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("公告内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("编辑人")
    @TableField("editor")
    private String editor;

    @ApiModelProperty("是否审核")
    @TableField("check")
    private Integer check;

    @ApiModelProperty("开始时间")
    @TableField("start_time")
    private Date startTime;

    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private Date endTime;

}
