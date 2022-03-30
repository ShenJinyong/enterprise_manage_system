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
 * @since 2022-03-30 09:21:59
 */
@Getter
@Setter
@TableName("announcement")
@ApiModel(value = "AnnouncementPo对象", description = "")
public class AnnouncementPo {

    @ApiModelProperty("公告主键")
    @TableId("id")
    private String id;

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
    @TableField("`check`")
    private Integer check;

    @ApiModelProperty("开始时间")
    @TableField("start_time")
    private Date startTime;

    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private Date endTime;

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
